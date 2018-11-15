package view.theme;

public class ThemeImpl implements Theme {
	SlideStyle slideStyle;
	SlideItemStyle slideItemStyle;
	
	public ThemeImpl(SlideStyle slideStyle, SlideItemStyle slideItemStyle){
		this.slideStyle = slideStyle;
		this.slideItemStyle = slideItemStyle;
	}

	public SlideStyle getSlideStyle() {
		return slideStyle;
	}

	public void setSlideStyle(SlideStyle slideStyle) {
		this.slideStyle = slideStyle;
	}

	public SlideItemStyle getSlideItemStyle() {
		return slideItemStyle;
	}

	public void setSlideItemStyle(SlideItemStyle slideItemStyle) {
		this.slideItemStyle = slideItemStyle;
	}
	
	
}
