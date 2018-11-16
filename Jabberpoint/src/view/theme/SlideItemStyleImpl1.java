package view.theme;

import java.awt.Color;
import java.awt.Font;

public class SlideItemStyleImpl1 extends SlideItemStyle {
	
	public SlideItemStyleImpl1() {
		styles = new Style[5];    
		// De styles zijn vast ingecodeerd.
		styles[0] = new Style("Helvetica", 0, Color.red,   48, 20);	// style voor item-level 0
		styles[1] = new Style("Helvetica", 20, Color.blue,  40, 10);	// style voor item-level 1
		styles[2] = new Style("Helvetica", 50, Color.black, 36, 10);	// style voor item-level 2
		styles[3] = new Style("Helvetica", 70, Color.black, 30, 10);	// style voor item-level 3
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
