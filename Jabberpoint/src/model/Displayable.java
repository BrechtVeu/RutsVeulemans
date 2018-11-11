package model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Vector;

import view.SlideViewerComponent;

public abstract class Displayable {
	
	protected ArrayList<Displayable> displayableList = null; // een ArrayList voor Displayables
	
	// Voeg een SlideItem toe
	public void append(Displayable anItem) {
		displayableList.add(anItem);
	}

	public String getTitle() {		
		return null;
	}

	public int getSlideNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Displayable getTitleItem() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Displayable> getSlideItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public void draw(Graphics g, Rectangle area, ImageObserver view){};
	
	// geef de schaal om de slide te kunnen tekenen
	protected float getScale(Rectangle area) {
		return Math.min(((float)area.width) / ((float)Slide.WIDTH), ((float)area.height) / ((float)Slide.HEIGHT));
	}

	public Rectangle getBoundingBox(Graphics g, ImageObserver view, float scale){ return null; };
}
