package view.theme;

import java.awt.Color;
import java.awt.Font;

public interface SlideItemStyle {

	public int getIndent();

	public int getLeading();

	public Font getFont(float scale);

	public Color getColor();

}
