package view.drawer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Vector;

import model.Displayable;
import model.SlideItem;
import view.theme.SlideItemStyle;
import view.theme.Theme;

public interface SlideDrawer {
	public void draw(Graphics g, Rectangle area, ImageObserver view, 
			Displayable title, int size, ArrayList<Displayable> slideItems,
			float scale, SlideItemStyle style);
}
