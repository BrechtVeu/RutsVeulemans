package view.decorator;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

import model.Displayable;

public abstract class DisplayableDecorator extends Displayable {

	protected Displayable displayable;

	public DisplayableDecorator(Displayable displayable) {
		this.displayable = displayable;
	}

	@Override
	public abstract void decorate(Graphics g, Rectangle area, ImageObserver view, Displayable presentation);

}
