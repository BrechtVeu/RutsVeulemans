package view.theme;

import java.awt.Color;
import java.awt.Font;

import model.Displayable;

public abstract class SlideStyle {
	//logo
	//achtergrondkleur
	//afbeelding
	protected Color backgroundColor;
	protected Font labelFont;
	protected Color labelFontColor;
	
	public abstract Color getBackgroundColor();

	public abstract Font getFont();
	
	public abstract Color getLabelFontColor();	

	public abstract Displayable wrapDecorator(Displayable slide);
}
