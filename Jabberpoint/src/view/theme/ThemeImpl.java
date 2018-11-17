package view.theme;

public class ThemeImpl implements Theme {
	SlideStyle slideStyle;
	SlideItemStyle slideItemStyle;
	SlideStyle slideStyleOthers;
	SlideItemStyle slideItemStyleOthers;

	public ThemeImpl(SlideStyle slideStyle, SlideItemStyle slideItemStyle, SlideStyle slideStyleOthers,
			SlideItemStyle slideItemStyleOthers) {
		this.slideStyle = slideStyle;
		this.slideItemStyle = slideItemStyle;
		this.slideStyleOthers = slideStyleOthers;
		this.slideItemStyleOthers = slideItemStyleOthers;
	}

	@Override
	public SlideStyle getSlideStyle() {
		return slideStyle;
	}

	@Override
	public SlideItemStyle getSlideItemStyle() {
		return slideItemStyle;
	}

	@Override
	public SlideStyle getSlideStyleOthers() {
		return slideStyleOthers;
	}

	@Override
	public SlideItemStyle getSlideItemStyleOthers() {
		return slideItemStyleOthers;
	}
}
