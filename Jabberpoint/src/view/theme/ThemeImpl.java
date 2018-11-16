package view.theme;

public class ThemeImpl implements Theme {
	SlideStyle slideStyle;
	SlideItemStyle slideItemStyle;
	SlideStyle slideStyleOthers;
	SlideItemStyle slideItemStyleOthers;
	
	public ThemeImpl(SlideStyle slideStyle, SlideItemStyle slideItemStyle,
			SlideStyle slideStyleOthers, SlideItemStyle slideItemStyleOthers){
		this.slideStyle = slideStyle;
		this.slideItemStyle = slideItemStyle;
		this.slideStyle = slideStyleOthers;
		this.slideItemStyle = slideItemStyleOthers;
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
