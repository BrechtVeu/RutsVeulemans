package view.theme;

/**
 * Concrete implementation of Theme.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class ThemeImpl implements Theme {
	SlideStyle slideStyle;
	SlideItemStyle slideItemStyle;
	SlideStyle slideStyleOthers;
	SlideItemStyle slideItemStyleOthers;

	/**
	 * Constructor for objects of class ThemeImpl
	 * 
	 * @param slideStyle
	 * @param slideItemStyle
	 * @param slideStyleOthers
	 * @param slideItemStyleOthers
	 */
	public ThemeImpl(SlideStyle slideStyle, SlideItemStyle slideItemStyle, SlideStyle slideStyleOthers,
			SlideItemStyle slideItemStyleOthers) {
		this.slideStyle = slideStyle;
		this.slideItemStyle = slideItemStyle;
		this.slideStyleOthers = slideStyleOthers;
		this.slideItemStyleOthers = slideItemStyleOthers;
	}

	/* (non-Javadoc)
	 * @see view.theme.Theme#getSlideStyle()
	 */
	@Override
	public SlideStyle getSlideStyle() {
		return slideStyle;
	}

	/* (non-Javadoc)
	 * @see view.theme.Theme#getSlideItemStyle()
	 */
	@Override
	public SlideItemStyle getSlideItemStyle() {
		return slideItemStyle;
	}

	/* (non-Javadoc)
	 * @see view.theme.Theme#getSlideStyleOthers()
	 */
	@Override
	public SlideStyle getSlideStyleOthers() {
		return slideStyleOthers;
	}

	/* (non-Javadoc)
	 * @see view.theme.Theme#getSlideItemStyleOthers()
	 */
	@Override
	public SlideItemStyle getSlideItemStyleOthers() {
		return slideItemStyleOthers;
	}
}
