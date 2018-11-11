package view;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public interface BitmapItemDrawer {
	public Rectangle getBoundingBox(Graphics g, ImageObserver observer, float scale, Style myStyle, BufferedImage bufferedImage);
	public void draw(int x, int y, float scale, Graphics g, Style myStyle, ImageObserver observer, BufferedImage bufferedImage);
}
