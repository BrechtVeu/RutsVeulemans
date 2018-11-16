package view.theme;

import java.awt.Color;
import java.awt.Font;

import jabberpoint.Values;

public class SlideStyleImpl1 extends SlideStyle{

	//TODO values fontstyle en fontheight variabel per theme
	public SlideStyleImpl1(){
		this.backgroundColor = Color.blue;
		this.labelFont = new Font("Helvetica", Values.FONTSTYLE, Values.FONTHEIGHT);
		this.labelFontColor = Color.red;
	}
	
	@Override
	public void setLogo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Color getBackgroundColor() {
		return backgroundColor;
		
	}

	@Override
	public Font getFont() {		
		return labelFont;
	}
	
	@Override
	public Color getLabelFontColor() {
		return labelFontColor;
	}

}
