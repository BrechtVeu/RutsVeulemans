package model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.util.Vector;

import view.SlideViewerComponent;

public abstract class Displayable {

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

	public Vector<Displayable> getSlideItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public void draw(Graphics g, Rectangle area, ImageObserver view, Displayable titleItem,
			int size, Vector<Displayable> slideItems, float scale) {
		// TODO Auto-generated method stub
		
	}
}
