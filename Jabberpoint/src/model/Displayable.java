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

/**
 * @author Brecht Veulemans, Dominique Ruts
 * 
 * Abstract class to define shared responsibilities and to treat all displayables in a similar fashion.
 *
 */
public abstract class Displayable implements Observable, Iterable<Displayable>, CommandEventListener<SlideEvent> {

	protected int currentDisplayableNumber = 0; // het slidenummer van de huidige Slide

	protected ArrayList<Displayable> displayableList = new ArrayList<Displayable>(); // een ArrayList voor Displayables
	protected DisplayableIterator<Displayable> displayableIterator = new DisplayableIteratorImpl<Displayable>(
			displayableList, currentDisplayableNumber);

	protected Theme theme;
	protected ThemeFactory themeFactory = new ThemeFactoryImpl();
	protected ArrayList<Observer> observerList = new ArrayList<Observer>(); // een ArrayList voor Displayables

	/**
	 * Sets the iterator to traverse displayableList
	 */
	public void setIterator() {
		displayableIterator = new DisplayableIteratorImpl<Displayable>(displayableList, currentDisplayableNumber);
	}

	// Voeg een Displayable toe
	/**
	 * Append a Displayable to a list of Displayables
	 * 
	 * @param anItem
	 */
	public void append(Displayable displayable) {
		displayableList.add(displayable);
	}

	/**
	 * Get the last item of a list of Displayables
	 * 
	 * @return the last item of a list of Displayables
	 */
	public Displayable getLastItem() {
		if (displayableList.size() == 0) {
			return null;
		}
		return displayableList.get(displayableList.size() - 1);
	}

	/**
	 * Get a list of Displayable items
	 * 
	 * @return list of Displayables
	 */
	public ArrayList<Displayable> getDisplayableItems() {
		return displayableList;
	}

	/**
	 * Get a Displayable item from a list of Displayables items based on the number
	 * 
	 * @param number
	 * @return the n-th Displayables in a list
	 */
	public Displayable getDisplayableItem(int number) {
		if (number < 0 || number >= getSize()) {
			return null;
		}
		return displayableList.get(number);
	}

	/**
	 * Get the size of the list
	 * 
	 * @return the size of the list
	 */
	public int getSize() {
		return displayableList.size();
	}

	/**
	 * Draw the Displayable
	 * 
	 * @param g
	 * @param area
	 * @param view
	 * @param style
	 */
	public void draw(Graphics g, Rectangle area, ImageObserver view, SlideItemStyle style) {
	}

	/**
	 * Decorate the Displayable
	 * 
	 * @param g
	 * @param area
	 * @param view
	 * @param presentation
	 */
	public void decorate(Graphics g, Rectangle area, ImageObserver view, Displayable presentation) {
	}

	/**
	 * Get the scale to draw the Displayable
	 * 
	 * @param area
	 * @return a scale to draw
	 */
	protected float getScale(Rectangle area) {
		return Math.min(((float) area.width) / ((float) Values.WIDTH), ((float) area.height) / ((float) Values.HEIGHT));
	}

	/* (non-Javadoc)
	 * @see model.Observable#attach(model.Observer)
	 */
	@Override
	public void attach(Observer observer) {
		observerList.add(observer);
	}

	/* (non-Javadoc)
	 * @see model.Observable#detach(model.Observer)
	 */
	@Override
	public void detach(Observer observer) {
		observerList.remove(observer);
	}

	/* (non-Javadoc)
	 * @see model.Observable#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		for (Observer observer : observerList) {
			observer.update(this, this.getCurrentSlide());
		}
	}

	/**
	 * Get the correct SlideStyle to draw
	 * 
	 * @param presentation
	 * @return a SlideStyle to draw
	 */
	public SlideStyle getCorrectSlideStyle(Displayable presentation) {
		SlideStyle style;
		if (presentation.getDisplayableNumber() == 0) {
			style = presentation.getTheme().getSlideStyle();
		} else {
			style = presentation.getTheme().getSlideStyleOthers();
		}
		return style;
	}

	/**
	 * Get the correct SlideItemStyle to draw
	 * 
	 * @param presentation
	 * @return a SlideItemStyle to draw
	 */
	public SlideItemStyle getCorrectSlideItemStyle(Displayable presentation) {
		SlideItemStyle style;
		if (presentation.getDisplayableNumber() == 0) {
			style = presentation.getTheme().getSlideItemStyle();
		} else {
			style = presentation.getTheme().getSlideItemStyleOthers();
		}
		return style;
	}

	/**
	 * Get the current Slide
	 * 
	 * @return the current slide
	 */
	public Displayable getCurrentSlide() {
		return getDisplayableItem(currentDisplayableNumber);
	}

	/**
	 * Get the bounding box of a Displayable
	 * 
	 * @param g
	 * @param view
	 * @param scale
	 * @param slideItemstyle
	 * @return a rectangle defining the bounding box
	 */
	public Rectangle getBoundingBox(Graphics g, ImageObserver view, float scale, SlideItemStyle slideItemstyle) {
		return null;
	}

	/**
	 * Get the title of a Displayable
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return null;
	}

	/**
	 * Set the title of a displayable
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
	}

	/**
	 * Get the number of the current Displayable
	 * 
	 * @return the number of the current Displayable
	 */
	public int getDisplayableNumber() {
		return currentDisplayableNumber;
	}

	// Iterator
	/**
	 * Change to the next Displayable
	 */
	public void nextDisplayable() {
		if (displayableIterator.hasNext()) {
			displayableIterator.next();
			setDisplayableNumber(displayableIterator.getDisplayableNumber());
		}
	}

	/**
	 * Change to the previous Displayble 
	 */
	public void prevDisplayable() {
		if (displayableIterator.hasPrevious()) {
			displayableIterator.previous();
			setDisplayableNumber(displayableIterator.getDisplayableNumber());
		}
	}

	/**
	 * Clear the presentation
	 */
	public void clear() {
		displayableList.clear();
		iterator().clear();
		setDisplayableNumber(-1);
	}

	/**
	 * Go to a certain Displayable based on a given number
	 * 
	 * @param displayableNumber
	 */
	public void gotoSlide(int displayableNumber) {
		if (displayableList.size() > 0) {
			this.iterator().setCurrentDisplayableNumber(displayableNumber);
			this.setDisplayableNumber(displayableNumber);
		}
	}

	/**
	 * Set the current displayable number to a given a number
	 * and update the view
	 * 
	 * @param number
	 */
	public void setDisplayableNumber(int number) {
		currentDisplayableNumber = number;
		notifyObservers();
	}

	/**
	 * Get the level of the Displayable
	 * 
	 * @return the level
	 */
	public int getLevel() {
		return 0;
	}

	/**
	 * Get the theme of the Displayable
	 * 
	 * @return the theme
	 */
	public Theme getTheme() {
		return theme;
	}

	/**
	 * Set the theme of the Displayable
	 * 
	 * @param theme
	 */
	public void setTheme(String theme) {
		this.theme = themeFactory.getTheme(theme);
		notifyObservers();
	}

	/**
	 * Get a factory to make a theme
	 * 
	 * @return a factory to make a theme
	 */
	public ThemeFactory getThemeFactory() {
		return themeFactory;
	}

	/* (non-Javadoc)
	 * @see event.CommandEventListener#eventTriggered(java.util.EventObject)
	 */
	@Override
	public void eventTriggered(SlideEvent event) {
		if (event instanceof NextSlideEvent) {
			this.nextDisplayable();
		} else if (event instanceof PreviousSlideEvent) {
			this.prevDisplayable();
		} else if (event instanceof GotoSlideEvent) {
			this.gotoSlide(event.getSlideNumber() - 1);
		} else if (event instanceof RepaintEvent) {
			this.clear();
		} else if (event instanceof OpenPresentationEvent) {
			this.setDisplayableNumber(0);
		} else if (event instanceof ChangeSlideThemeEvent) {
			this.setTheme(event.getTheme());
		} else {
			System.out.println("Displayble - not sure which instance");
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public DisplayableIterator<Displayable> iterator() {
		return displayableIterator;
	}
}
