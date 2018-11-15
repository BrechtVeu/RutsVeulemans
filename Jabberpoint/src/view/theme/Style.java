package view.theme;
import java.awt.Color;
import java.awt.Font;

/** <p>Style staat voor Indent, Color, Font and Leading.</p>
 * <p>De koppeling tussen style-nummer en item-level is nu direct:
 * in Slide wordt de style opgehaald voor een item
 * met als style-nummer het item-level.</p>
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 */

public class Style {
	
	private String fontName;
	private int indent;
	private Color color;
	Font font;
	int fontSize;
	private int leading;

	public Style(String fontName, int indent, Color color, int points, int leading) {
		this.fontName = fontName;
		this.indent = indent;
		this.color = color;
		font = new Font(fontName, Font.BOLD, fontSize=points);
		this.leading = leading;
	}

	public String toString() {
		return "["+ getIndent() + "," + getColor() + "; " + fontSize + " on " + getLeading() +"]";
	}

	public Font getFont(float scale) {
		return font.deriveFont(fontSize * scale);
	}

	public int getLeading() {
		return leading;
	}

	public void setLeading(int leading) {
		this.leading = leading;
	}

	public int getIndent() {
		return indent;
	}

	public void setIndent(int indent) {
		this.indent = indent;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
}
}
