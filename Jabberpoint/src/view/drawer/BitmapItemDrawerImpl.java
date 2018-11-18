package view.drawer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import view.theme.Style;

/**
 * Concrete implementation of BitmapItemDrawer.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class BitmapItemDrawerImpl implements BitmapItemDrawer {
	/* (non-Javadoc)
	 * @see view.drawer.BitmapItemDrawer#getBoundingBox(java.awt.Graphics, java.awt.image.ImageObserver, float, view.theme.Style, java.awt.image.BufferedImage)
	 */
	@Override
	public Rectangle getBoundingBox(Graphics g, ImageObserver observer, float scale, Style style,
			BufferedImage bufferedImage) {
		return new Rectangle((int) (style.getIndent() * scale), 0, (int) (bufferedImage.getWidth(observer) * scale),
				((int) (style.getLeading() * scale)) + (int) (bufferedImage.getHeight(observer) * scale));
	}

	/* (non-Javadoc)
	 * @see view.drawer.BitmapItemDrawer#draw(int, int, float, java.awt.Graphics, view.theme.Style, java.awt.image.ImageObserver, java.awt.image.BufferedImage)
	 */
	@Override
	public void draw(int x, int y, float scale, Graphics g, Style style, ImageObserver observer,
			BufferedImage bufferedImage) {
		int width = x + (int) (style.getIndent() * scale);
		int height = y + (int) (style.getLeading() * scale);
		g.drawImage(bufferedImage, width, height, (int) (bufferedImage.getWidth(observer) * scale),
				(int) (bufferedImage.getHeight(observer) * scale), observer);
	}
}
