package view.drawer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import view.theme.Style;

/**
 * Gives interface for concrete implementations of BitmapItemDrawer.
 * Responsible for drawing Bitmap Items.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public interface BitmapItemDrawer {
	/**
	 * Creates and returns the bounding box of an image.
	 * 
	 * @param g
	 * @param observer
	 * @param scale
	 * @param style
	 * @param bufferedImage
	 * @return the bounding box of an image
	 */
	public Rectangle getBoundingBox(Graphics g, ImageObserver observer, float scale, Style style,
			BufferedImage bufferedImage);

	/**
	 * Draws the image.
	 * 
	 * @param x
	 * @param y
	 * @param scale
	 * @param g
	 * @param style
	 * @param observer
	 * @param bufferedImage
	 */
	public void draw(int x, int y, float scale, Graphics g, Style style, ImageObserver observer,
			BufferedImage bufferedImage);
}
