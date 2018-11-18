package view.theme;

import java.awt.Color;
import java.awt.Font;
import model.Displayable;

/**
 * Abstract class defining a Slide Style. Specific Slide Style will extend on this base class.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public abstract class SlideStyle {
	protected String logo;
	protected Color backgroundColor;
	protected Font labelFont;
	protected Color labelFontColor;

	/**
	 * Gets the logo of the slide.
	 * 
	 * @return the logo of the slide
	 */
	public abstract String getLogo();

	/**
	 * Gets the background color of the slide.
	 * 
	 * @return the background color of the slide.
	 */
	public abstract Color getBackgroundColor();

	/**
	 * Gets the font of the slide, (i.e. used by the page numbering).
	 * 
	 * @return the font of the slide
	 */
	public abstract Font getFont();

	/**
	 * Gets the font color of the slide, (i.e. used by the page numbering).
	 * 
	 * @return the font color of the slide
	 */
	public abstract Color getLabelFontColor();

	/**
	 * Wraps the decorator around the slide.
	 * 
	 * @param slide
	 * @return the wrapped Displayable item
	 */
	public abstract Displayable wrapDecorator(Displayable slide);
}
