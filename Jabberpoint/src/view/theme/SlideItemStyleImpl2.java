package view.theme;

import java.awt.Color;

/**
 * Extends SlideItemStyle to implement a concrete Slide Item Style - SlideItemStyleImpl2.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class SlideItemStyleImpl2 extends SlideItemStyle {

	/**
	 * Constructor for objects of class SlideItemStyleImpl2
	 */
	public SlideItemStyleImpl2() {
		styles = new Style[5];
		styles[0] = new Style("Helvetica", 0, Color.magenta, 48, 20); // style voor item-level 0
		styles[1] = new Style("Helvetica", 20, Color.red, 40, 10); // style voor item-level 1
		styles[2] = new Style("Helvetica", 50, Color.blue, 36, 10); // style voor item-level 2
		styles[3] = new Style("Helvetica", 70, Color.yellow, 30, 10); // style voor item-level 3
		styles[4] = new Style("Helvetica", 90, Color.orange, 24, 10); // style voor item-level 4
	}

	/* (non-Javadoc)
	 * @see view.theme.SlideItemStyle#getStyle(int)
	 */
	@Override
	public Style getStyle(int level) {
		if (level >= styles.length) {
			level = styles.length - 1;
		}
		return styles[level];
	}

}
