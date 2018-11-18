package view.drawer;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.font.LineBreakMeasurer;
import java.awt.font.TextAttribute;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;
import java.awt.image.ImageObserver;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jabberpoint.Values;
import view.theme.Style;

/**
 * Concrete implementation of TextItemDrawer
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class TextItemDrawerImpl implements TextItemDrawer {

	/**
	 * Returns the AttributedString for the item.
	 *
	 * @param style
	 * @param scale
	 * @param text
	 * @return
	 */
	public AttributedString getAttributedString(Style style, float scale, String text) {
		AttributedString attrStr = new AttributedString(text);
		attrStr.addAttribute(TextAttribute.FONT, style.getFont(scale), 0, text.length());
		return attrStr;
	}

	// geef de bounding box van het item
	/* (non-Javadoc)
	 * @see view.drawer.TextItemDrawer#getBoundingBox(java.awt.Graphics, java.awt.image.ImageObserver, float, view.theme.Style, java.lang.String)
	 */
	@Override
	public Rectangle getBoundingBox(Graphics g, ImageObserver observer, float scale, Style style, String text) {
		List<TextLayout> layouts = getLayouts(g, style, scale, text);
		int xsize = 0, ysize = (int) (style.getLeading() * scale);
		Iterator<TextLayout> iterator = layouts.iterator();
		while (iterator.hasNext()) {
			TextLayout layout = iterator.next();
			Rectangle2D bounds = layout.getBounds();
			if (bounds.getWidth() > xsize) {
				xsize = (int) bounds.getWidth();
			}
			if (bounds.getHeight() > 0) {
				ysize += bounds.getHeight();
			}
			ysize += layout.getLeading() + layout.getDescent();
		}
		return new Rectangle((int) (style.getIndent() * scale), 0, xsize, ysize);
	}

	// teken het item
	/* (non-Javadoc)
	 * @see view.drawer.TextItemDrawer#draw(int, int, float, java.awt.Graphics, view.theme.Style, java.awt.image.ImageObserver, java.lang.String)
	 */
	@Override
	public void draw(int x, int y, float scale, Graphics g, Style style, ImageObserver o, String text) {

		List<TextLayout> layouts = getLayouts(g, style, scale, text);
		Point pen = new Point(x + (int) (style.getIndent() * scale), y + (int) (style.getLeading() * scale));
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(style.getColor());
		Iterator<TextLayout> it = layouts.iterator();
		while (it.hasNext()) {
			TextLayout layout = it.next();
			pen.y += layout.getAscent();
			layout.draw(g2d, pen.x, pen.y);
			pen.y += layout.getDescent();
		}
	}

	/**
	 * Returns the layout of the text item.
	 *  
	 * @param g
	 * @param style
	 * @param scale
	 * @param text
	 * @return
	 */
	private List<TextLayout> getLayouts(Graphics g, Style style, float scale, String text) {
		List<TextLayout> layouts = new ArrayList<TextLayout>();
		AttributedString attrStr = getAttributedString(style, scale, text);
		Graphics2D g2d = (Graphics2D) g;
		FontRenderContext frc = g2d.getFontRenderContext();
		LineBreakMeasurer measurer = new LineBreakMeasurer(attrStr.getIterator(), frc);
		float wrappingWidth = (Values.WIDTH - style.getIndent()) * scale;
		while (measurer.getPosition() < text.length()) {
			TextLayout layout = measurer.nextLayout(wrappingWidth);
			layouts.add(layout);
		}
		return layouts;
	}

}
