package view.decorator;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

import model.Displayable;
import view.theme.Theme;

public class LogoDecorator extends DisplayableDecorator{

	public LogoDecorator(Displayable displayable) {
		super(displayable);
	}

	@Override
	public void decorate(Graphics g, Rectangle area, ImageObserver view, Theme theme, Displayable presentation) {
		draw();
		displayable.decorate(g, area, view, theme, presentation);
	}
	
	private void draw(){
		
	}
}
