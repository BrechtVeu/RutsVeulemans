package view.theme;

import java.awt.Color;
import java.awt.Font;

import jabberpoint.Values;

public class SlideStyleImpl2 extends SlideStyle{

	public SlideStyleImpl2(){
		this.backgroundColor = Color.green;
		this.labelFont = new Font("Arial", Values.FONTSTYLE, Values.FONTHEIGHT);
		this.labelFontColor = Color.blue;
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
