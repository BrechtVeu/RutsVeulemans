package view.drawer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

import view.theme.Theme;

public interface TextItemDrawer {
	// Geef de bounding box
		public Rectangle getBoundingBox(Graphics g, 
				ImageObserver observer, float scale, Theme myTheme, String text);

	// teken het item
		public void draw(int x, int y, float scale, 
				Graphics g, Theme myTheme, ImageObserver observer, String text);
}
