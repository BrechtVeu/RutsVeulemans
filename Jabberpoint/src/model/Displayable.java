package model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

public abstract class Displayable implements Observable {
	
	protected ArrayList<Displayable> displayableList = new ArrayList<Displayable>(); // een ArrayList voor Displayables
	protected ArrayList<Observer> observerList = new ArrayList<Observer>(); // een ArrayList voor Displayables

	// Voeg een Displayable toe
	public void append(Displayable anItem) {
		displayableList.add(anItem);
	}
	
	public Displayable getLastItem(){
		if(displayableList.size() == 0){
			return null;
		}
		return displayableList.get(displayableList.size()-1);
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

	public void draw(Graphics g, Rectangle area, ImageObserver view){}
	
	// geef de schaal om de slide te kunnen tekenen
	protected float getScale(Rectangle area) {
		return Math.min(((float)area.width) / ((float)Slide.WIDTH), ((float)area.height) / ((float)Slide.HEIGHT));
	}
	
	public void attach(Observer observer){
		observerList.add(observer);
	};
	public void detach(Observer observer){
		observerList.remove(observer);
	};
	public void notifyObservers(){
		for(Observer observer: observerList){
			observer.update(this, this.getCurrentSlide());
		}
	};
	
	public Displayable getCurrentSlide() {return null;}

	public Rectangle getBoundingBox(Graphics g, ImageObserver view, float scale){ return null; }
	
	public String getTitle() {return null;}
	
	public void setTitle(String title) {}
	
	//TODO AAN TE PASSEN - aangemaakt voor Accessor en SlideViewerComponent
	
	public int getSlideNumber() {return 0;}
	
	// verander het huidige-slide-nummer en laat het aan het window weten.
	public void setSlideNumber(int number) {}

	public void clear() {}

	//Iterator
	public void nextSlide() {
		// TODO Auto-generated method stub
		
	}

	public void prevSlide() {
		// TODO Auto-generated method stub
		
	}

	
}
