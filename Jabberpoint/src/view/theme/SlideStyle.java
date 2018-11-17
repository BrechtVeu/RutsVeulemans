package view.theme;

import java.awt.Color;
import java.awt.Font;
import model.Displayable;

public abstract class SlideStyle {
	protected String logo;
	protected Color backgroundColor;
	protected Font labelFont;
	protected Color labelFontColor;

	public abstract String getLogo();

	public abstract Color getBackgroundColor();

	public abstract Font getFont();

	public abstract Color getLabelFontColor();

	public abstract Displayable wrapDecorator(Displayable slide);
}
