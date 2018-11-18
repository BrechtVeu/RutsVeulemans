package view.drawer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

import view.theme.Style;

/**
 * Gives interface for concrete implementations of TextItemDrawer.
 * Responsible for drawing Text Items.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public interface TextItemDrawer {

	/**
	 * Creates and returns the bounding box of a text item.
	 * 
	 * @param g
	 * @param observer
	 * @param scale
	 * @param style
	 * @param text
	 * @return the bounding box of a text item
	 */
	public Rectangle getBoundingBox(Graphics g, ImageObserver observer, float scale, Style style, String text);
	
	/**
	 * Draws the text.
	 * 
	 * @param x
	 * @param y
	 * @param scale
	 * @param g
	 * @param style
	 * @param observer
	 * @param text
	 */
	public void draw(int x, int y, float scale, Graphics g, Style style, ImageObserver observer, String text);
}
