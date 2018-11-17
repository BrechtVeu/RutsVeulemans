package view.drawer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import view.theme.Style;

public interface BitmapItemDrawer {
	public Rectangle getBoundingBox(Graphics g, ImageObserver observer, float scale, Style style,
			BufferedImage bufferedImage);

	public void draw(int x, int y, float scale, Graphics g, Style style, ImageObserver observer,
			BufferedImage bufferedImage);
}
