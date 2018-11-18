package view.theme;

import java.awt.Color;
import java.awt.Font;

import factory.SlideDecoratorBuilder;
import factory.SlideDecoratorBuilderImpl;
import jabberpoint.Values;
import model.Displayable;

/**
 * Extends SlideStyle to implement a concrete Slide Style - SlideStyleImpl2.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class SlideStyleImpl2 extends SlideStyle {

	/**
	 * Constructor for objects of class SlideStyleImpl2
	 */
	public SlideStyleImpl2() {
		this.logo = "JabberPoint.jpg";
		this.backgroundColor = Color.green;
		this.labelFont = new Font("Arial", Values.FONTSTYLE, Values.FONTHEIGHT);
		this.labelFontColor = Color.blue;
	}

	/* (non-Javadoc)
	 * @see view.theme.SlideStyle#wrapDecorator(model.Displayable)
	 */
	@Override
	public Displayable wrapDecorator(Displayable slide) {
		SlideDecoratorBuilder slideDecoratorBuilder = new SlideDecoratorBuilderImpl();
		return slideDecoratorBuilder.setDisplayable(slide).addLogo().addBackground().build();
	}

	/* (non-Javadoc)
	 * @see view.theme.SlideStyle#getLogo()
	 */
	@Override
	public String getLogo() {
		return logo;
	}

	/* (non-Javadoc)
	 * @see view.theme.SlideStyle#getBackgroundColor()
	 */
	@Override
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	/* (non-Javadoc)
	 * @see view.theme.SlideStyle#getFont()
	 */
	@Override
	public Font getFont() {
		return labelFont;
	}

	/* (non-Javadoc)
	 * @see view.theme.SlideStyle#getLabelFontColor()
	 */
	@Override
	public Color getLabelFontColor() {
		return labelFontColor;
	}
}
