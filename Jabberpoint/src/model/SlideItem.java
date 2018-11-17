package model;

import view.theme.SlideItemStyle;
import view.theme.Style;

/**
 * <p>
 * The abstract class of an item on the Slide.
 * <p>
 * <p>
 * SlideItems have the responsibility of knowing their level.
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

public abstract class SlideItem extends Displayable {
	protected int level = 0; // het level van het slideitem

	/**
	 * Constructor for objects of class SlideItem
	 * 
	 * @param lev
	 */
	public SlideItem(int lev) {
		level = lev;
	}

// Geef het level
	/* (non-Javadoc)
	 * @see model.Displayable#getLevel()
	 */
	@Override
	public int getLevel() {
		return level;
	}

	/**
	 * Get the Style of the SlideItem
	 * 
	 * @param slideItemstyle
	 * @return the Style of the SlideItem
	 */
	protected Style getStyle(SlideItemStyle slideItemstyle) {
		return slideItemstyle.getStyle(level);
	}

}
