package view;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class BitmapItemDrawerDefault implements BitmapItemDrawer{
	// geef de bounding box van de afbeelding
		public Rectangle getBoundingBox(Graphics g, ImageObserver observer, float scale, Style myStyle, BufferedImage bufferedImage) {
			return new Rectangle((int) (myStyle.getIndent() * scale), 0,
					(int) (bufferedImage.getWidth(observer) * scale),
					((int) (myStyle.getLeading() * scale)) + 
					(int) (bufferedImage.getHeight(observer) * scale));
		}

	// teken de afbeelding
		public void draw(int x, int y, float scale, Graphics g, Style myStyle, ImageObserver observer, BufferedImage bufferedImage) {
			int width = x + (int) (myStyle.getIndent() * scale);
			int height = y + (int) (myStyle.getLeading() * scale);
			g.drawImage(bufferedImage, width, height,(int) (bufferedImage.getWidth(observer)*scale),
	                (int) (bufferedImage.getHeight(observer)*scale), observer);
		}
}
