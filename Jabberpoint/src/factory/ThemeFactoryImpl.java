package factory;

import jabberpoint.Values;
import view.theme.SlideItemStyle;
import view.theme.SlideItemStyleImpl1;
import view.theme.SlideItemStyleImpl2;
import view.theme.SlideItemStyleImpl3;
import view.theme.SlideStyle;
import view.theme.SlideStyleImpl1;
import view.theme.SlideStyleImpl2;
import view.theme.SlideStyleImpl3;
import view.theme.Theme;
import view.theme.ThemeImpl;

/**
 * @author Brecht Veulemans, Dominique Ruts
 *
 * Concrete implementation of ThemeFactory.
 *
 */
public class ThemeFactoryImpl implements ThemeFactory {
	
	/* (non-Javadoc)
	 * @see factory.ThemeFactory#makeTheme1()
	 */
	@Override
	public Theme makeTheme1() {
		SlideStyle slideStyle = new SlideStyleImpl1();
		SlideItemStyle slideItemStyle = new SlideItemStyleImpl1();

		SlideStyle slideStyleOthers = new SlideStyleImpl1();
		SlideItemStyle slideItemStyleOthers = new SlideItemStyleImpl1();
		return new ThemeImpl(slideStyle, slideItemStyle, slideStyleOthers, slideItemStyleOthers);
	}

	/* (non-Javadoc)
	 * @see factory.ThemeFactory#makeTheme2()
	 */
	@Override
	public Theme makeTheme2() {
		SlideStyle slideStyle = new SlideStyleImpl2();
		SlideItemStyle slideItemStyle = new SlideItemStyleImpl2();

		SlideStyle slideStyleOthers = new SlideStyleImpl1();
		SlideItemStyle slideItemStyleOthers = new SlideItemStyleImpl1();
		return new ThemeImpl(slideStyle, slideItemStyle, slideStyleOthers, slideItemStyleOthers);
	}
	
	/* (non-Javadoc)
	 * @see factory.ThemeFactory#makeTheme3()
	 */
	@Override
	public Theme makeTheme3() {
		SlideStyle slideStyle = new SlideStyleImpl3();
		SlideItemStyle slideItemStyle = new SlideItemStyleImpl3();

		SlideStyle slideStyleOthers = new SlideStyleImpl3();
		SlideItemStyle slideItemStyleOthers = new SlideItemStyleImpl3();
		return new ThemeImpl(slideStyle, slideItemStyle, slideStyleOthers, slideItemStyleOthers);
	}

	/* (non-Javadoc)
	 * @see factory.ThemeFactory#makeTheme4()
	 */
	@Override
	public Theme makeTheme4() {
		SlideStyle slideStyle = new SlideStyleImpl3();
		SlideItemStyle slideItemStyle = new SlideItemStyleImpl3();

		SlideStyle slideStyleOthers = new SlideStyleImpl2();
		SlideItemStyle slideItemStyleOthers = new SlideItemStyleImpl2();
		return new ThemeImpl(slideStyle, slideItemStyle, slideStyleOthers, slideItemStyleOthers);
	}

	/* (non-Javadoc)
	 * @see factory.ThemeFactory#getTheme(java.lang.String)
	 */
	@Override
	public Theme getTheme(String theme) {
		if (theme == Values.THEME1) {
			return makeTheme1();
		} else if (theme == Values.THEME2) {
			return makeTheme2();
		} else if (theme == Values.THEME3) {
			return makeTheme3();
		} else if (theme == Values.THEME4) {
			return makeTheme4();
		} else {
			return makeTheme1();
		}
	}
}
