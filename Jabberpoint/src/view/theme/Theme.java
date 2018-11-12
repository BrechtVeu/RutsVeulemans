package view.theme;

public class Theme {
	SlideStyle slideStyle;
	SlideItemStyle slideItemStyle;
	
	public Theme(SlideStyle slideStyle, SlideItemStyle slideItemStyle){
		this.slideStyle = slideStyle;
		this.slideItemStyle = slideItemStyle;
	}

	public SlideItemStyle getSlideItemStyle() {
		return slideItemStyle;
	}

	public void setSlideItemStyle(SlideItemStyle slideItemStyle) {
		this.slideItemStyle = slideItemStyle;
	}
	
	
}
