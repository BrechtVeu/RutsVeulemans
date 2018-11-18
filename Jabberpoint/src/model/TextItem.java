package model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

import view.drawer.TextItemDrawer;
import view.theme.SlideItemStyle;

/**
 * <p>
 * A TextItem is responsible for knowing its text and the textItemDrawer that will be used to draw the text.
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

public class TextItem extends SlideItem {
	private String text;
	private TextItemDrawer textItemDrawer;

	/**
	 * Constructor for objects of class TextItem
	 * 
	 * @param level
	 * @param string
	 * @param textItemDrawer
	 */
	public TextItem(int level, String string, TextItemDrawer textItemDrawer) {
		super(level);
		text = string;
		this.textItemDrawer = textItemDrawer;
	}

	/**
	 * Get the text of the TextItem
	 * 
	 * @return the text of the TextItem
	 */
	public String getText() {
		return text == null ? "" : text;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TextItem[" + getLevel() + "," + getText() + "]";
	}

	/* (non-Javadoc)
	 * @see model.Displayable#draw(java.awt.Graphics, java.awt.Rectangle, java.awt.image.ImageObserver, view.theme.SlideItemStyle)
	 */
	@Override
	public void draw(Graphics g, Rectangle area, ImageObserver observer, SlideItemStyle slideItemstyle) {
		if (text == null || text.length() == 0) {
			return;
		}
		float scale = getScale(area);
		textItemDrawer.draw(area.x, area.y, scale, g, getStyle(slideItemstyle), observer, text);

	}

	/* (non-Javadoc)
	 * @see model.Displayable#getBoundingBox(java.awt.Graphics, java.awt.image.ImageObserver, float, view.theme.SlideItemStyle)
	 */
	@Override
	public Rectangle getBoundingBox(Graphics g, ImageObserver observer, float scale, SlideItemStyle slideItemstyle) {
		return textItemDrawer.getBoundingBox(g, observer, scale, getStyle(slideItemstyle), text);
	}
}
