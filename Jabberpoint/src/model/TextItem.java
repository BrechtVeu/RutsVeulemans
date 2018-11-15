package model;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

import view.drawer.TextItemDrawer;

/** <p>Een tekst item.</p>
 * <p>Een TextItem heeft tekenfunctionaliteit.</p>
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 */

public class TextItem extends SlideItem {
	private String text;
	private TextItemDrawer textItemDrawer;
	
	private static final String EMPTYTEXT = "No Text Given";

// een textitem van level level, met als tekst string
	public TextItem(int level, String string, TextItemDrawer textItemDrawer) {
		super(level);
		text = string;
		this.textItemDrawer = textItemDrawer;
	}
/*
// een leeg textitem
	public TextItem() {
		this(0, EMPTYTEXT);
	}*/

// Geef de tekst
	public String getText() {
		return text == null ? "" : text;
	}


	public String toString() {
		return "TextItem[" + getLevel()+","+getText()+"]";
	}
	

	@Override
	public void draw(Graphics g, Rectangle area, ImageObserver observer) {
		// TODO Auto-generated method stub
		if (text == null || text.length() == 0) {
			return;
		}
		float scale = getScale(area);
		textItemDrawer.draw(area.x, area.y, scale, g, this.getStyle(super.getLevel()), observer, text);
		
	}

	@Override
	public Rectangle getBoundingBox(Graphics g, ImageObserver observer, float scale) {
		
		return textItemDrawer.getBoundingBox(g, observer, scale, this.getStyle(super.getLevel()), text);
	}
}
