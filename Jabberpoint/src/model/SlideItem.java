package model;

import view.theme.SlideItemStyle;
import view.theme.Style;

/**
 * <p>
 * De abstracte klasse voor een item op een Slide
 * <p>
 * <p>
 * Alle SlideItems hebben tekenfunctionaliteit.
 * </p>
 * 
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 */

public abstract class SlideItem extends Displayable {
	protected int level = 0; // het level van het slideitem

	public SlideItem(int lev) {
		level = lev;
	}

// Geef het level
	@Override
	public int getLevel() {
		return level;
	}

	protected Style getStyle(SlideItemStyle slideItemstyle) {
		return slideItemstyle.getStyle(level);
	}

}
