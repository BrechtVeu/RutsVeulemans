package view.drawer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import model.Displayable;
import model.DisplayableIterator;
import view.theme.SlideItemStyle;

/**
 * Concrete implementation of SlideDrawer.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class SlideDrawerImpl implements SlideDrawer {
	/* (non-Javadoc)
	 * @see view.drawer.SlideDrawer#draw(java.awt.Graphics, java.awt.Rectangle, java.awt.image.ImageObserver, int, model.DisplayableIterator, float, view.theme.SlideItemStyle)
	 */
	@Override
	public void draw(Graphics g, Rectangle area, ImageObserver view, int size,
			DisplayableIterator<Displayable> displayableIterator, float scale, SlideItemStyle slideItemstyle) {
		int y = area.y;

		displayableIterator.setCurrentDisplayableNumber(0);
		while (displayableIterator.hasNext()) {
			Displayable slideItem = displayableIterator.next();
			area = new Rectangle(area.x, y, area.width, area.height);
			slideItem.draw(g, area, view, slideItemstyle);
			y += slideItem.getBoundingBox(g, view, scale, slideItemstyle).height;
		}
	}
}
