package view.theme;

import java.awt.Color;
import java.awt.Font;

import factory.SlideDecoratorBuilder;
import factory.SlideDecoratorBuilderImpl;
import jabberpoint.Values;
import model.Displayable;

public class SlideStyleImpl1 extends SlideStyle{

	//TODO values fontstyle en fontheight variabel per theme
	public SlideStyleImpl1(){
		this.backgroundColor = Color.white;
		this.labelFont = new Font("Helvetica", Values.FONTSTYLE, Values.FONTHEIGHT);
		this.labelFontColor = Color.black;
	}
	
	@Override
	public Color getBackgroundColor() {
		return backgroundColor;
		
	}

	@Override
	public Font getFont() {		
		return labelFont;
	}
	
	@Override
	public Color getLabelFontColor() {
		return labelFontColor;
	}
	
	@Override
	public Displayable wrapDecorator(Displayable slide) {
		SlideDecoratorBuilder slideDecoratorBuilder = new SlideDecoratorBuilderImpl();
		return slideDecoratorBuilder
				.setDisplayable(slide)				
				.addLogo()
				.addPageNumber()
				.addBackground()
				.build();
	}

}
