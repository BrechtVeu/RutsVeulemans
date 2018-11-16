package view.decorator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

import jabberpoint.Values;
import model.Displayable;
import view.theme.SlideStyle;
import view.theme.Theme;

public class PageNumberDecorator extends DisplayableDecorator{

	public PageNumberDecorator(Displayable displayable) {
		super(displayable);
	}

	@Override
	public void decorate(Graphics g, Rectangle area, ImageObserver view, Displayable presentation) {	
		draw(g, presentation);
		displayable.decorate(g, area, view, presentation);
	}

	private void draw(Graphics g, Displayable presentation){
		SlideStyle style = getCorrectStyle(presentation);
		Font labelFont = style.getFont();
		Color labelFontColor = style.getLabelFontColor();
		g.setFont(labelFont);
		g.setColor(labelFontColor);
		g.drawString("Slide " + (1 + presentation.getSlideNumber()) + " of " +
	             presentation.getSize(), Values.XPOS, Values.YPOS);
	}
	
	
	
}
