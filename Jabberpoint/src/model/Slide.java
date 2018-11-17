package model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import view.drawer.SlideDrawer;
import view.theme.SlideItemStyle;

/**
 * <p>
 * A Slide. This class holds a list of Text- and BitMapItems.
 * </p>
 *
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 * @version 1.7 2018/11/17 Brecht Veulemans, Dominique Ruts
 */

public class Slide extends Displayable {

	private SlideDrawer slideDrawer;

	/**
	 * Constructor for objects of class Slide
	 * 
	 * @param slideDrawer
	 */
	public Slide(SlideDrawer slideDrawer) {
		this.slideDrawer = slideDrawer;
	}

	/* (non-Javadoc)
	 * @see model.Displayable#draw(java.awt.Graphics, java.awt.Rectangle, java.awt.image.ImageObserver, view.theme.SlideItemStyle)
	 */
	@Override
	public void draw(Graphics g, Rectangle area, ImageObserver view, SlideItemStyle slideItemstyle) {
		float scale = getScale(area);
		slideDrawer.draw(g, area, view, getSize(), iterator(), scale, slideItemstyle);
	}

	/* (non-Javadoc)
	 * @see model.Displayable#decorate(java.awt.Graphics, java.awt.Rectangle, java.awt.image.ImageObserver, model.Displayable)
	 */
	@Override
	public void decorate(Graphics g, Rectangle area, ImageObserver view, Displayable presentation) {
		SlideItemStyle style = getCorrectSlideItemStyle(presentation);
		draw(g, area, view, style);
	}
}
