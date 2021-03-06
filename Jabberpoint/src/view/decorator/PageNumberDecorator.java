package view.decorator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

import jabberpoint.Values;
import model.Displayable;
import view.theme.SlideStyle;

/**
 * Extends abstract class DisplayableDecorator to decorate the page numbering on a slide. 
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class PageNumberDecorator extends DisplayableDecorator {

	/**
	 * Constructor for objects of class PageNumberDecorator
	 * 
	 * @param displayable
	 */
	public PageNumberDecorator(Displayable displayable) {
		super(displayable);
	}

	/* (non-Javadoc)
	 * @see view.decorator.DisplayableDecorator#decorate(java.awt.Graphics, java.awt.Rectangle, java.awt.image.ImageObserver, model.Displayable)
	 */
	@Override
	public void decorate(Graphics g, Rectangle area, ImageObserver view, Displayable presentation) {
		draw(g, area, presentation);
		displayable.decorate(g, area, view, presentation);
	}

	/**
	 * Draws the page numbering of the presentation 
	 * 
	 * @param g
	 * @param area
	 * @param presentation
	 */
	private void draw(Graphics g, Rectangle area, Displayable presentation) {
		SlideStyle style = getCorrectSlideStyle(presentation);
		Font labelFont = style.getFont();
		Color labelFontColor = style.getLabelFontColor();
		g.setFont(labelFont);
		g.setColor(labelFontColor);

		int x = (int) (Values.XPOS * getScale(area));
		int y = (Values.YPOS);

		g.drawString("Slide " + (1 + presentation.iterator().getDisplayableNumber()) + " of " + presentation.getSize(), x, y);
	}

}
