package view;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.util.Vector;

import model.SlideItem;

public interface SlideDrawer {
	public void draw(Graphics g, Rectangle area, ImageObserver view, 
			SlideItem title, int size, Vector<SlideItem> slideItems,
			float scale);
}
