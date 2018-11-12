package view.drawer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import view.theme.Theme;

public class BitmapItemDrawerImpl implements BitmapItemDrawer{
	// geef de bounding box van de afbeelding
		public Rectangle getBoundingBox(Graphics g, ImageObserver observer, float scale, Theme myTheme, BufferedImage bufferedImage) {
			return new Rectangle((int) (myTheme.getSlideItemStyle().getIndent() * scale), 0,
					(int) (bufferedImage.getWidth(observer) * scale),
					((int) (myTheme.getSlideItemStyle().getLeading() * scale)) + 
					(int) (bufferedImage.getHeight(observer) * scale));
		}

	// teken de afbeelding
		public void draw(int x, int y, float scale, Graphics g, Theme myTheme, ImageObserver observer, BufferedImage bufferedImage) {
			int width = x + (int) (myTheme.getSlideItemStyle().getIndent() * scale);
			int height = y + (int) (myTheme.getSlideItemStyle().getLeading() * scale);
			g.drawImage(bufferedImage, width, height,(int) (bufferedImage.getWidth(observer)*scale),
	                (int) (bufferedImage.getHeight(observer)*scale), observer);
		}
}
