package view.drawer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.util.Vector;

import model.Displayable;
import model.SlideItem;

public interface SlideDrawer {
	public void draw(Graphics g, Rectangle area, ImageObserver view, 
			Displayable title, int size, Vector<Displayable> slideItems,
			float scale);
}
