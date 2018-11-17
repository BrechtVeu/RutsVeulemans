package view.theme;

import java.awt.Color;
import java.awt.Font;

import factory.SlideDecoratorBuilder;
import factory.SlideDecoratorBuilderImpl;
import jabberpoint.Values;
import model.Displayable;

public class SlideStyleImpl3 extends SlideStyle{

	public SlideStyleImpl3(){
		this.backgroundColor = Color.red;
		this.labelFont = new Font("Arial", Values.FONTSTYLE, Values.FONTHEIGHT);
		this.labelFontColor = Color.pink;
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