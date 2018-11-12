package view.drawer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import view.theme.Theme;

public interface BitmapItemDrawer {
	public Rectangle getBoundingBox(Graphics g, ImageObserver observer, float scale, Theme myTheme, BufferedImage bufferedImage);
	public void draw(int x, int y, float scale, Graphics g, Theme myTheme, ImageObserver observer, BufferedImage bufferedImage);
}
