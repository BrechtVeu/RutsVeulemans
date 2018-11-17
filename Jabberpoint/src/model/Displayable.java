package model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

import jabberpoint.Values;
import view.theme.SlideItemStyle;
import view.theme.SlideStyle;
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

public abstract class Displayable implements Observable, Iterable<Displayable>, CommandEventListener<SlideEvent> {

	protected int currentSlideNumber = 0; // het slidenummer van de huidige Slide
	
	protected ArrayList<Displayable> displayableList = new ArrayList<Displayable>(); // een ArrayList voor Displayables
	protected DisplayableIterator<Displayable> displayableIterator = new DisplayableIteratorImpl<Displayable>(displayableList, currentSlideNumber);
	
	protected Theme theme;
	protected ThemeFactory themeFactory = new ThemeFactoryImpl();
	protected ArrayList<Observer> observerList = new ArrayList<Observer>(); // een ArrayList voor Displayables

	public void setIterator() {
		displayableIterator = new DisplayableIteratorImpl<Displayable>(displayableList, currentSlideNumber);
	}
	
	// Voeg een Displayable toe
	public void append(Displayable anItem) {
		displayableList.add(anItem);
	}

	public Displayable getLastItem() {
		if (displayableList.size() == 0) {
			return null;
		}
		return displayableList.get(displayableList.size() - 1);
	}

	public ArrayList<Displayable> getDisplayableItems() {
		return displayableList;
	}

	// geef het betreffende Displayable
	public Displayable getDisplayableItem(int number) {
		if (number < 0 || number >= getSize()) {
			return null;
		}
		return displayableList.get(number);
	}

	// geef de afmeting van de Slide
	public int getSize() {
		return displayableList.size();
	}

	public void draw(Graphics g, Rectangle area, ImageObserver view, SlideItemStyle style) {
	}

	public void decorate(Graphics g, Rectangle area, ImageObserver view, Displayable presentation) {
	}

	// geef de schaal om de slide te kunnen tekenen
	protected float getScale(Rectangle area) {
		return Math.min(((float) area.width) / ((float) Values.WIDTH), ((float) area.height) / ((float) Values.HEIGHT));
	}

	@Override
	public void attach(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observerList) {
			observer.update(this, this.getCurrentSlide());
		}
	}

	public SlideStyle getCorrectSlideStyle(Displayable presentation) {
		SlideStyle style;
		if (presentation.getSlideNumber() == 0) {
			style = presentation.getTheme().getSlideStyle();
		} else {
			style = presentation.getTheme().getSlideStyleOthers();
		}
		return style;
	}

	public SlideItemStyle getCorrectSlideItemStyle(Displayable presentation) {
		SlideItemStyle style;
		if (presentation.getSlideNumber() == 0) {
			style = presentation.getTheme().getSlideItemStyle();
		} else {
			style = presentation.getTheme().getSlideItemStyleOthers();
		}
		return style;
	}

	public Displayable getCurrentSlide() {
		return getDisplayableItem(currentSlideNumber);
	}

	public Rectangle getBoundingBox(Graphics g, ImageObserver view, float scale, SlideItemStyle slideItemstyle) {
		return null;
	}

	public String getTitle() {
		return null;
	}

	public void setTitle(String title) {
	}

	public int getSlideNumber() {
		return currentSlideNumber;
	}

	// Iterator
	public void nextSlide() {
		if (displayableIterator.hasNext()) {
			displayableIterator.next();
			setSlideNumber(displayableIterator.getSlideNumber());
		}			
	}

	public void prevSlide() {
		if (displayableIterator.hasPrevious()) {
			displayableIterator.previous();
			setSlideNumber(displayableIterator.getSlideNumber());
		}		
	}
	
	// Verwijder de presentatie, om klaar te zijn voor de volgende
	public void clear() {
		displayableList.clear();
		iterator().clear();
		setSlideNumber(-1);
	}
	
	public void gotoSlide(int displayableNumber) {
		if (displayableList.size()>0) {
			this.iterator().setSlideNumber(displayableNumber);
			this.setSlideNumber(displayableNumber);
		}
	}
	

		public void setSlideNumber(int number) {
			currentSlideNumber = number;
			notifyObservers();
		}

	public int getLevel() {
		return 0;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = themeFactory.getTheme(theme);
		notifyObservers();
	}

	public ThemeFactory getThemeFactory() {
		return themeFactory;
	}

	@Override
	public void eventTriggered(SlideEvent event) {
		if (event instanceof NextSlideEvent) {
			this.nextSlide();
		} else if (event instanceof PreviousSlideEvent) {
			this.prevSlide();
		} else if (event instanceof GotoSlideEvent) {
			this.gotoSlide(event.getSlideNumber() - 1);
		} else if (event instanceof RepaintEvent) {
			this.clear();
		} else if (event instanceof OpenPresentationEvent) {
			this.setSlideNumber(0);
		} else if (event instanceof ChangeSlideThemeEvent) {
			this.setTheme(event.getTheme());
		} else {
			System.out.println("Displayble - not sure which instance");
		}
	}
	
	@Override
	public DisplayableIterator<Displayable> iterator() {
		return displayableIterator;
	}
}
