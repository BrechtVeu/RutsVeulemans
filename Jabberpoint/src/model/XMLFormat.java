/**
 * 
 */
package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import jabberpoint.Values;
import view.drawer.BitmapItemDrawerImpl;
import view.drawer.SlideDrawerImpl;
import view.drawer.TextItemDrawerImpl;

/**
 * @author Dominique
 *
 */
public class XMLFormat implements Format {
	
	/**
	 * 
	 */
	public XMLFormat() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see model.Format#loadFile(model.Presentation, java.lang.String)
	 */
	@Override
	public void loadFile(Displayable p, String filename) throws IOException {
		int slideNumber, itemNumber, max = 0, maxItems = 0;
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();    
			Document document = builder.parse(new File(filename)); // maak een JDOM document
			Element doc = document.getDocumentElement();
			p.setTitle(getTitle(doc, Values.SHOWTITLE));

			NodeList slides = doc.getElementsByTagName(Values.SLIDE);
			max = slides.getLength();
			for (slideNumber = 0; slideNumber < max; slideNumber++) {
				Element xmlSlide = (Element) slides.item(slideNumber);
				Slide slide = new Slide(new SlideDrawerImpl());
				slide.setTitle(getTitle(xmlSlide, Values.SLIDETITLE));
				p.append(slide);
				
				NodeList slideItems = xmlSlide.getElementsByTagName(Values.ITEM);
				maxItems = slideItems.getLength();
				for (itemNumber = 0; itemNumber < maxItems; itemNumber++) {
					Element item = (Element) slideItems.item(itemNumber);
					loadSlideItem(slide, item);
				}
			}
		} 
		catch (IOException iox) {
			System.err.println(iox.toString());
		}
		catch (SAXException sax) {
			System.err.println(sax.getMessage());
		}
		catch (ParserConfigurationException pcx) {
			System.err.println(Values.PCE);
		}
	}
	
	protected void loadSlideItem(Slide slide, Element item) {
		int level = 1; // default
		NamedNodeMap attributes = item.getAttributes();
		String leveltext = attributes.getNamedItem(Values.LEVEL).getTextContent();
		if (leveltext != null) {
			try {
				level = Integer.parseInt(leveltext);
			}
			catch(NumberFormatException x) {
				System.err.println(Values.NFE);
			}
		}
		String type = attributes.getNamedItem(Values.KIND).getTextContent();
		if (Values.TEXT.equals(type)) {
			slide.append(new TextItem(level, item.getTextContent(),new TextItemDrawerImpl()));
		}
		else {
			if (Values.IMAGE.equals(type)) {
				slide.append(new BitmapItem(level, item.getTextContent(),new BitmapItemDrawerImpl()));
			}
			else {
				System.err.println(Values.UNKNOWNTYPE);
			}
		}
	}
	
	private String getTitle(Element element, String tagName) {
    	NodeList titles = element.getElementsByTagName(tagName);
    	return titles.item(0).getTextContent();
    	
    }

	/* (non-Javadoc)
	 * @see model.Format#saveFile(model.Presentation)
	 */
	@Override
	public void saveFile(Displayable p, String filename) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter(filename));
		out.println("<?xml version=\"1.0\"?>");
		out.println("<!DOCTYPE presentation SYSTEM \"jabberpoint.dtd\">");
		out.println("<presentation>");
		out.print("<showtitle>");
		out.print(p.getTitle());
		out.println("</showtitle>");
		for (int slideNumber=0; slideNumber<p.getSize(); slideNumber++) {
			Displayable slide = p.getDisplayableItem(slideNumber);
			out.println("<slide>");
			out.println("<title>" + slide.getTitle() + "</title>");
			ArrayList<Displayable> slideItems = slide.getDisplayableItems();
			for (int itemNumber = 0; itemNumber<slideItems.size(); itemNumber++) {
				SlideItem slideItem = (SlideItem) slideItems.get(itemNumber);
				out.print("<item kind="); 
				if (slideItem instanceof TextItem) {
					out.print("\"text\" level=\"" + slideItem.getLevel() + "\">");
					out.print( ( (TextItem) slideItem).getText());
				}
				else {
					if (slideItem instanceof BitmapItem) {
						out.print("\"image\" level=\"" + slideItem.getLevel() + "\">");
						out.print( ( (BitmapItem) slideItem).getName());
					}
					else {
						System.out.println("Ignoring " + slideItem);
					}
				}
				out.println("</item>");
			}
			out.println("</slide>");
		}
		out.println("</presentation>");
		out.close();
	}

}
