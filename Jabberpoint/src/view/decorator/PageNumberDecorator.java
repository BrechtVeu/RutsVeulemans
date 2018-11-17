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
		draw(g, area, presentation);
		displayable.decorate(g, area, view, presentation);
	}

	private void draw(Graphics g, Rectangle area, Displayable presentation){
		SlideStyle style = getCorrectSlideStyle(presentation);
		Font labelFont = style.getFont();
		Color labelFontColor = style.getLabelFontColor();
		g.setFont(labelFont);
		g.setColor(labelFontColor);
		
		int x = (int) (Values.XPOS*getScale(area));
		int y = (int) (Values.YPOS);
		
		g.drawString("Slide " + (1 + presentation.getSlideNumber()) + " of " +
	             presentation.getSize(), x, y);
	}
	
	
	
}
