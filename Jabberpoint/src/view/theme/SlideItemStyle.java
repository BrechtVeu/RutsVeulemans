package view.theme;

import java.awt.Color;
import java.awt.Font;

public abstract class SlideItemStyle {
	
	protected Style[] styles; // de styles
		
	public abstract Style getStyle(int level);
}
