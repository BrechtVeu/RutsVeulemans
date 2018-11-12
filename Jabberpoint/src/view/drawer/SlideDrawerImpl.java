package view.drawer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Vector;

import jabberpoint.Values;
import model.Displayable;
import model.SlideItem;

public class SlideDrawerImpl implements SlideDrawer{
	@Override
	public void draw(Graphics g, Rectangle area, ImageObserver view, Displayable title, int size,
			ArrayList<Displayable> slideItems, float scale) {
	    int y = area.y;
		/* De titel hoeft niet meer apart behandeld te worden */
	    Displayable slideItem = title;
	    slideItem.draw(g, area, view);
	    y += slideItem.getBoundingBox(g, view, scale).height;
	    for (int number=0; number<size; number++) {
	      slideItem = slideItems.get(number);
	      area = new Rectangle(area.x, y, area.width, area.height) ;
	      slideItem.draw(g, area, view);
	      y += slideItem.getBoundingBox(g, view, scale).height;
	    }
	  }	
}
