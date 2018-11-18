package view.theme;

import java.awt.Color;
import java.awt.Font;

/**
 * <p>
 * Style defines the Indent, Color, Font, Font size and Leading of a Displayable.
 * </p>
 *
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 * @version 1.7 2018/11/17 Brecht Veulemans, Dominique Ruts
 */

public class Style {

	private String fontName;
	private int indent;
	private Color color;
	Font font;
	int fontSize;
	private int leading;

	/**
	 * Constructor for objects of class Style
	 * 
	 * @param fontName
	 * @param indent
	 * @param color
	 * @param points
	 * @param leading
	 */
	public Style(String fontName, int indent, Color color, int points, int leading) {
		this.fontName = fontName;
		this.indent = indent;
		this.color = color;
		font = new Font(this.fontName, Font.BOLD, fontSize = points);
		this.leading = leading;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[" + getIndent() + "," + getColor() + "; " + fontSize + " on " + getLeading() + "]";
	}

	/**
	 * Gets the font of the style
	 * 
	 * @param scale
	 * @return the font of the style
	 */
	public Font getFont(float scale) {
		return font.deriveFont(fontSize * scale);
	}

	/**
	 * Gets the leading of the style
	 * 
	 * @return the leading of the style
	 */
	public int getLeading() {
		return leading;
	}

	/**
	 * Sets the leading of the style
	 * 
	 * @param leading
	 */
	public void setLeading(int leading) {
		this.leading = leading;
	}

	/**
	 * Gets the indent of the style
	 * 
	 * @return the ident of the style
	 */
	public int getIndent() {
		return indent;
	}

	/**
	 * Sets the indent of the style
	 * 
	 * @param indent
	 */
	public void setIndent(int indent) {
		this.indent = indent;
	}

	/**
	 * Gets the color of the style
	 * 
	 * @return the color of the style
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Sets the color of the style
	 * 
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}
}
