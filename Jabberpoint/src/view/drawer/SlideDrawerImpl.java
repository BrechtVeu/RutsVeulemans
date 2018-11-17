package view.drawer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import model.Displayable;
import model.DisplayableIterator;
import view.theme.SlideItemStyle;

public class SlideDrawerImpl implements SlideDrawer {
	@Override
	public void draw(Graphics g, Rectangle area, ImageObserver view, int size,
			DisplayableIterator<Displayable> displayableIterator, float scale, SlideItemStyle slideItemstyle) {
		int y = area.y;

		displayableIterator.setSlideNumber(0);
		while (displayableIterator.hasNext()) {
			Displayable slideItem = displayableIterator.next();
			area = new Rectangle(area.x, y, area.width, area.height);
			slideItem.draw(g, area, view, slideItemstyle);
			y += slideItem.getBoundingBox(g, view, scale, slideItemstyle).height;
		}
	}
}
