package view.theme;

import java.awt.Color;
import java.awt.Font;

public class SlideItemStyleImpl2 extends SlideItemStyle {
	
	public SlideItemStyleImpl2() {
		styles = new Style[5];    
		// De styles zijn vast ingecodeerd.
		styles[0] = new Style("Helvetica", 0, Color.black,   48, 20);	// style voor item-level 0
		styles[1] = new Style("Arial", 20, Color.red,  40, 10);	// style voor item-level 1
		styles[2] = new Style("Arial", 50, Color.green, 36, 10);	// style voor item-level 2
		styles[3] = new Style("Helvetica", 70, Color.yellow, 30, 10);	// style voor item-level 3
		styles[4] = new Style("Helvetica", 90, Color.orange, 24, 10);	// style voor item-level 4
	}

	@Override
	public Style getStyle(int level) {
		if (level >= styles.length) {
			level = styles.length - 1;
		}
		return styles[level];
	}


}