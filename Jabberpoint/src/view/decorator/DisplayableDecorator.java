package view.decorator;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

import model.Displayable;

/**
 *  Abstract class responsible for decorating objects on the slides. 
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public abstract class DisplayableDecorator extends Displayable {

	protected Displayable displayable;

	/**
	 * Constructor for objects of class DisplayableDecorator
	 * 
	 * @param displayable
	 */
	public DisplayableDecorator(Displayable displayable) {
		this.displayable = displayable;
	}

	/* (non-Javadoc)
	 * @see model.Displayable#decorate(java.awt.Graphics, java.awt.Rectangle, java.awt.image.ImageObserver, model.Displayable)
	 */
	@Override
	public abstract void decorate(Graphics g, Rectangle area, ImageObserver view, Displayable presentation);

}
