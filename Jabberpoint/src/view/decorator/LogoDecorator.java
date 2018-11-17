package view.decorator;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

import model.Displayable;
import view.theme.SlideStyle;
import view.theme.Theme;

public class LogoDecorator extends DisplayableDecorator{

	public LogoDecorator(Displayable displayable) {
		super(displayable);
	}

	@Override
	public void decorate(Graphics g, Rectangle area, ImageObserver view, Displayable presentation) {
		draw(presentation);
		displayable.decorate(g, area, view, presentation);
	}
	
	private void draw(Displayable presentation){
		SlideStyle style = getCorrectSlideStyle(presentation);
		
	}
}
