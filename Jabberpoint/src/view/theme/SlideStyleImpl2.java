package view.theme;

import java.awt.Color;
import java.awt.Font;

import factory.SlideDecoratorBuilder;
import factory.SlideDecoratorBuilderImpl;
import jabberpoint.Values;
import model.Displayable;

public class SlideStyleImpl2 extends SlideStyle {

	public SlideStyleImpl2() {
		this.logo = "JabberPoint.jpg";
		this.backgroundColor = Color.green;
		this.labelFont = new Font("Arial", Values.FONTSTYLE, Values.FONTHEIGHT);
		this.labelFontColor = Color.blue;
	}

	@Override
	public Displayable wrapDecorator(Displayable slide) {
		SlideDecoratorBuilder slideDecoratorBuilder = new SlideDecoratorBuilderImpl();
		return slideDecoratorBuilder.setDisplayable(slide).addLogo().addBackground().build();
	}

	@Override
	public String getLogo() {
		return logo;
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
}
