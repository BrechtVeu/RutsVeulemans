package model;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.util.Vector;

import view.drawer.SlideDrawer;
import view.drawer.TextItemDrawerImpl;

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
	public final static int WIDTH = 1200;
	public final static int HEIGHT = 800;
	/* Geen String meer maar een TextItem */
	protected Displayable title; // de titel wordt apart bewaard
	protected Vector<Displayable> items; // de slide-items worden in een Vector bewaard
	private SlideDrawer slideDrawer;

	public Slide(SlideDrawer slideDrawer) {
		items = new Vector<Displayable>();
		this.slideDrawer = slideDrawer;
	}

	// Voeg een SlideItem toe
	public void append(SlideItem anItem) {
		items.addElement(anItem);
	}

	// geef de titel van de slide
	public Displayable getTitleItem() {
		/* Geef nu de tekst van het TextItem terug */
		return title;
	}

	// verander de titel van de slide
	public void setTitle(String newTitle) {
		/* Cre�er nu een TextItem op basis van de nieuwe titel */
		title = new TextItem(0, newTitle, new TextItemDrawerImpl());
	}

	// Maak een TextItem van String, en voeg het TextItem toe
	public void append(int level, String message) {
		append(new TextItem(level, message, new TextItemDrawerImpl()));
	}

	// geef het betreffende SlideItem
	public Displayable getSlideItem(int number) {
		return (Displayable)items.elementAt(number);
	}

	// geef alle SlideItems in een Vector
	public Vector<Displayable> getSlideItems() {
		return items;
	}

	// geef de afmeting van de Slide
	public int getSize() {
		return items.size();
	}

	@Override
	public void draw(Graphics g, Rectangle area, ImageObserver view, 
			Displayable title, int size, Vector<Displayable> slideItems,
			float scale) {
		slideDrawer.draw(g, area, view, title, size, slideItems, scale);
	}
}
