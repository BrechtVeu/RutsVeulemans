package view.theme;

import java.awt.Color;

public class SlideItemStyleImpl3 extends SlideItemStyle {

	public SlideItemStyleImpl3() {
		styles = new Style[5];
		// De styles zijn vast ingecodeerd.
		styles[0] = new Style("Helvetica", 0, Color.pink, 48, 20); // style voor item-level 0
		styles[1] = new Style("Helvetica", 20, Color.white, 40, 10); // style voor item-level 1
		styles[2] = new Style("Helvetica", 50, Color.black, 36, 10); // style voor item-level 2
		styles[3] = new Style("Helvetica", 70, Color.green, 30, 10); // style voor item-level 3
		styles[4] = new Style("Helvetica", 90, Color.black, 24, 10); // style voor item-level 4
	}

	@Override
	public Style getStyle(int level) {
		if (level >= styles.length) {
			level = styles.length - 1;
		}
		return styles[level];
	}

}
