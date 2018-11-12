package model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import jabberpoint.Values;
import view.SlideViewerComponent;
import view.theme.Theme;

public abstract class Displayable {
	
	protected ArrayList<Displayable> displayableList = new ArrayList<Displayable>(); // een ArrayList voor Displayables
	protected Theme theme;
	
	// Voeg een Displayable toe
	public void append(Displayable anItem, Theme theme) {
		displayableList.add(anItem);
		this.theme = theme;
	}

	public ArrayList<Displayable> getDisplayableItems() {
		return displayableList;
	}
	
	// geef het betreffende Displayable
	public Displayable getDisplayableItem(int number) {
		if (number < 0 || number >= getSize()){
			return null;
	    }
		return displayableList.get(number);
	}
	
	// geef de afmeting van de Slide
	public int getSize() {
		return displayableList.size();
	}

	public void draw(Graphics g, Rectangle area, ImageObserver view){};
	
	// geef de schaal om de slide te kunnen tekenen
	protected float getScale(Rectangle area) {
		return Math.min(((float)area.width) / ((float)Values.WIDTH), ((float)area.height) / ((float)Values.HEIGHT));
	}

	public Rectangle getBoundingBox(Graphics g, ImageObserver view, float scale){ return null; };
	
	public String getTitle() {return null;}
	
	public void setTitle(String title) {}
	
	//TODO AAN TE PASSEN - aangemaakt voor Accessor en SlideViewerComponent
	
	public int getSlideNumber() {return 0;}

	
}
