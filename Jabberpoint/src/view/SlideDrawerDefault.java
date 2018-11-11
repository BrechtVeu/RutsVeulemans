package view;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.util.Vector;

import model.SlideItem;

public class SlideDrawerDefault implements SlideDrawer{
	public void draw(Graphics g, Rectangle area, ImageObserver view,
			SlideItem title, int size, Vector<SlideItem> slideItems,
			float scale) {
	    int y = area.y;
		/* De titel hoeft niet meer apart behandeld te worden */
	    SlideItem slideItem = title;
	    Style style = Style.getStyle(slideItem.getLevel());
	    slideItem.draw(area.x, y, scale, g, style, view);
	    y += slideItem.getBoundingBox(g, view, scale, style).height;
	    for (int number=0; number<size; number++) {
	      slideItem = (SlideItem)slideItems.elementAt(number);
	      style = Style.getStyle(slideItem.getLevel());
	      slideItem.draw(area.x, y, scale, g, style, view);
	      y += slideItem.getBoundingBox(g, view, scale, style).height;
	    }
	  }

	
}
