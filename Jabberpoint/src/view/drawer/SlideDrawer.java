package view.drawer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import model.Displayable;
import model.DisplayableIterator;
import view.theme.SlideItemStyle;

/**
 * Gives interface for concrete implementations of SlideDrawer.
 * Responsible for drawing Slides.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public interface SlideDrawer {
	/**
	 * Draws the slides of a presentation.
	 * 
	 * @param g
	 * @param area
	 * @param view
	 * @param size
	 * @param displayableIterator
	 * @param scale
	 * @param style
	 */
	public void draw(Graphics g, Rectangle area, ImageObserver view, int size,
			DisplayableIterator<Displayable> displayableIterator, float scale, SlideItemStyle style);
}
