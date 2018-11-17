package view.drawer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import model.Displayable;
import model.DisplayableIterator;
import view.theme.SlideItemStyle;

public interface SlideDrawer {
	public void draw(Graphics g, Rectangle area, ImageObserver view, int size,
			DisplayableIterator<Displayable> displayableIterator, float scale, SlideItemStyle style);
}
