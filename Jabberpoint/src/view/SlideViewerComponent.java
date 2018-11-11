package view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JComponent;
import javax.swing.JFrame;

import jabberpoint.Values;
import model.Displayable;
import model.Slide;


/** <p>SlideViewerComponent is een grafische component die Slides kan laten zien.</p>
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 */

public class SlideViewerComponent extends JComponent {
		
	private Displayable slide; // de huidige slide
	private Font labelFont = null; // het font voor labels
	private Displayable presentation = null; // de presentatie
	private JFrame frame = null;
	
	

	public SlideViewerComponent(Displayable pres, JFrame frame) {
		setBackground(Values.BGCOLOR); 
		presentation = pres;
		labelFont = new Font(Values.FONTNAME, Values.FONTSTYLE, Values.FONTHEIGHT);
		this.frame = frame;
	}

	public Dimension getPreferredSize() {
		return new Dimension(Slide.WIDTH, Slide.HEIGHT);
	}

	public void update(Displayable presentation, Displayable data) {
		if (data == null) {
			repaint();
			return;
		}
		this.presentation = presentation;
		this.slide = data;
		repaint();
		frame.setTitle(presentation.getTitle());
	}

// teken de slide
	public void paintComponent(Graphics g) {
		g.setColor(Values.BGCOLOR);
		g.fillRect(0, 0, getSize().width, getSize().height);
		if (presentation.getSlideNumber() < 0 || slide == null) {
			return;
		}
		g.setFont(labelFont);
		g.setColor(Values.COLOR);
		g.drawString("Slide " + (1 + presentation.getSlideNumber()) + " of " +
                 presentation.getSize(), Values.XPOS, Values.YPOS);
		Rectangle area = new Rectangle(0, Values.YPOS, getWidth(), (getHeight() - Values.YPOS));
	
		slide.draw(g, area, this);
	}
	
	
}
