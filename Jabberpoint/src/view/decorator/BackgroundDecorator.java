package view.decorator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

import model.Displayable;
import view.theme.SlideStyle;

public class BackgroundDecorator extends DisplayableDecorator {

	public BackgroundDecorator(Displayable displayable) {
		super(displayable);
	}

	@Override
	public void decorate(Graphics g, Rectangle area, ImageObserver view, Displayable presentation) {
		draw(g, presentation, area);
		displayable.decorate(g, area, view, presentation);
	}

	private void draw(Graphics g, Displayable presentation, Rectangle area) {
		SlideStyle style = getCorrectSlideStyle(presentation);
		Color backgroundColor = style.getBackgroundColor();
		g.setColor(backgroundColor);
		g.fillRect(0, 0, area.width, area.height);
	}

}
