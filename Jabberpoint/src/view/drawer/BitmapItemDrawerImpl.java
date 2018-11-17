package view.drawer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import view.theme.Style;

public class BitmapItemDrawerImpl implements BitmapItemDrawer {
	// geef de bounding box van de afbeelding
	@Override
	public Rectangle getBoundingBox(Graphics g, ImageObserver observer, float scale, Style style,
			BufferedImage bufferedImage) {
		return new Rectangle((int) (style.getIndent() * scale), 0, (int) (bufferedImage.getWidth(observer) * scale),
				((int) (style.getLeading() * scale)) + (int) (bufferedImage.getHeight(observer) * scale));
	}

	// teken de afbeelding
	@Override
	public void draw(int x, int y, float scale, Graphics g, Style style, ImageObserver observer,
			BufferedImage bufferedImage) {
		int width = x + (int) (style.getIndent() * scale);
		int height = y + (int) (style.getLeading() * scale);
		g.drawImage(bufferedImage, width, height, (int) (bufferedImage.getWidth(observer) * scale),
				(int) (bufferedImage.getHeight(observer) * scale), observer);
	}
}
