package view.decorator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

import model.Displayable;
import view.theme.SlideStyle;

/**
 * Extends abstract class DisplayableDecorator to decorate the background color on a slide. 
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class BackgroundDecorator extends DisplayableDecorator {

	/**
	 * Constructor for objects of class BackgroundDecorator
	 * 
	 * @param displayable
	 */
	public BackgroundDecorator(Displayable displayable) {
		super(displayable);
	}

	/* (non-Javadoc)
	 * @see view.decorator.DisplayableDecorator#decorate(java.awt.Graphics, java.awt.Rectangle, java.awt.image.ImageObserver, model.Displayable)
	 */
	@Override
	public void decorate(Graphics g, Rectangle area, ImageObserver view, Displayable presentation) {
		draw(g, presentation, area);
		displayable.decorate(g, area, view, presentation);
	}

	/**
	 * Draws the background of the presentation 
	 * 
	 * @param g
	 * @param presentation
	 * @param area
	 */
	private void draw(Graphics g, Displayable presentation, Rectangle area) {
		SlideStyle style = getCorrectSlideStyle(presentation);
		Color backgroundColor = style.getBackgroundColor();
		g.setColor(backgroundColor);
		g.fillRect(0, 0, area.width, area.height);
	}

}
