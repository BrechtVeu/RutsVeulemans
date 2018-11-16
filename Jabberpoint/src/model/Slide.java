package model;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Vector;

import event.NextSlideEvent;
import view.drawer.SlideDrawer;
import view.drawer.TextItemDrawerImpl;
import view.theme.SlideItemStyle;
import view.theme.Theme;

/** <p>Een slide. Deze klasse heeft tekenfunctionaliteit.</p>
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 */

public class Slide extends Displayable{
	
	/* Geen String meer maar een TextItem */
	protected Displayable title; // de titel wordt apart bewaard
	private SlideDrawer slideDrawer;

	public Slide(SlideDrawer slideDrawer) {
		this.slideDrawer = slideDrawer;
	}

	// geef de titel van de slide
	@Override
	public String getTitle() {
		/* Geef nu de tekst van het TextItem terug */
		return ((TextItem) title).getText();
	}

	// verander de titel van de slide
	@Override
	public void setTitle(String newTitle) {
		/* Creëer nu een TextItem op basis van de nieuwe titel */
		title = new TextItem(0, newTitle, new TextItemDrawerImpl());
	}

	@Override
	public void draw(Graphics g, Rectangle area, ImageObserver view, SlideItemStyle slideItemstyle) {
		float scale = getScale(area);
		slideDrawer.draw(g, area, view, title, getSize() , displayableList, scale, slideItemstyle);
	}
	
	public void decorate(Graphics g, Rectangle area, ImageObserver view, Displayable presentation){
		SlideItemStyle style;
		if(presentation.getSlideNumber() == 1){
			style = presentation.getTheme().getSlideItemStyle();
		}else{
			style = presentation.getTheme().getSlideItemStyleOthers();
		}
		draw(g, area, view, style);
	}
}
