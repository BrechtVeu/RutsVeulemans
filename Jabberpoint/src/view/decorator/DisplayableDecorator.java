package view.decorator;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.ImageObserver;

import model.Displayable;
import view.theme.SlideStyle;
import view.theme.Theme;

public abstract class DisplayableDecorator extends Displayable {
	
	protected Displayable displayable;	
	
	public DisplayableDecorator(Displayable displayable) {
		this.displayable = displayable;
	}
	
	public SlideStyle getCorrectStyle(Displayable presentation){
		SlideStyle style;
		if(presentation.getSlideNumber() == 1){
			style = presentation.getTheme().getSlideStyle();
		}else{
			style = presentation.getTheme().getSlideStyleOthers();
		}
		return style;
	}

	public abstract void decorate(Graphics g, Rectangle area, ImageObserver view, Displayable presentation);

}
