package factories;

import view.theme.SlideItemStyle;
import view.theme.SlideItemStyleImpl1;
import view.theme.SlideStyle;
import view.theme.SlideStyleImpl1;
import view.theme.Theme;

public class ThemeFactoryImpl implements ThemeFactory {

	@Override
	public Theme mkTheme1() {
		SlideStyle slideStyle = new SlideStyleImpl1();
		SlideItemStyle slideItemStyle = new SlideItemStyleImpl1();
		return new Theme(slideStyle, slideItemStyle);
	}

	@Override
	public Theme mkTheme2() {
		// TODO Auto-generated method stub
		return null;
	}
}
