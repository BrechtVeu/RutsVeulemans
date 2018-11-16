package model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import jabberpoint.Values;
import view.theme.SlideItemStyle;
import view.theme.Theme;
import event.ChangeSlideThemeEvent;
import event.CommandEventListener;
import event.NextSlideEvent;
import event.OpenPresentationEvent;
import event.PreviousSlideEvent;
import event.RepaintEvent;
import event.SlideEvent;
import factory.ThemeFactory;
import factory.ThemeFactoryImpl;
import event.GotoSlideEvent;

public abstract class Displayable implements Observable, CommandEventListener<SlideEvent> {
	
	protected ArrayList<Displayable> displayableList = new ArrayList<Displayable>(); // een ArrayList voor Displayables

	protected Theme theme;
	protected ThemeFactory themeFactory = new ThemeFactoryImpl();
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

	public void draw(Graphics g, Rectangle area, ImageObserver view, SlideItemStyle style){}
	
	public void decorate(Graphics g, Rectangle area, ImageObserver view, Displayable presentation){}
	
	// geef de schaal om de slide te kunnen tekenen
	protected float getScale(Rectangle area) {
		return Math.min(((float)area.width) / ((float)Values.WIDTH), ((float)area.height) / ((float)Values.HEIGHT));
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

	public Rectangle getBoundingBox(Graphics g, ImageObserver view, float scale, SlideItemStyle slideItemstyle){ return null; }
	
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

	public int getLevel() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Theme getTheme(){return theme;}
	public void setTheme(String theme){
		this.theme = themeFactory.getTheme(theme);
		notifyObservers();
	}
	public ThemeFactory getThemeFactory(){return themeFactory;};


	@Override
	public void eventTriggered(SlideEvent event) {
		if(event instanceof NextSlideEvent){
			this.nextSlide();
			System.out.println("Displayble - eventTriggered - Source:"+event.getSource());
			System.out.println("Displayble - instance of NextSlideEvent");
		} else if (event instanceof PreviousSlideEvent) {
			this.prevSlide();
			System.out.println("Displayble - eventTriggered - Source:"+event.getSource());
			System.out.println("Displayble - instance of PreviousSlideEvent");
		} else if (event instanceof GotoSlideEvent) {
			this.setSlideNumber(event.getSlideNumber() - 1);
			System.out.println("Displayble - eventTriggered - Source:"+event.getSource());
			System.out.println("Displayble - instance of GotoSlideEvent");
		} else if (event instanceof RepaintEvent) {
			this.clear();
			System.out.println("Displayble - eventTriggered - Source:"+event.getSource());
			System.out.println("Displayble - instance of RepaintEvent");
		} else if (event instanceof OpenPresentationEvent) {
			this.setSlideNumber(0);
			System.out.println("Displayble - eventTriggered - Source:"+event.getSource());
			System.out.println("Displayble - instance of OpenPresentationEvent");
		} else if (event instanceof ChangeSlideThemeEvent) {
			this.setTheme(event.getTheme());
			System.out.println("Displayble - theme:" + event.getTheme());
			System.out.println("Displayble - eventTriggered - Source:"+event.getSource());
			System.out.println("Displayble - instance of ChangeSlideThemeEvent");
		}	else {
			System.out.println("Displayble - not sure which instance");
		}
	}
}
