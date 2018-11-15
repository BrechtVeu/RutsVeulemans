package factory;

import view.theme.SlideItemStyle;
import view.theme.SlideItemStyleImpl1;
import view.theme.SlideItemStyleImpl2;
import view.theme.SlideStyle;
import view.theme.SlideStyleImpl1;
import view.theme.Theme;
import view.theme.ThemeImpl;

public class ThemeFactoryImpl implements ThemeFactory {
	
	@Override
	public Theme makeDefaultTheme(){
		SlideStyle slideStyle = new SlideStyleImpl1();
		SlideItemStyle slideItemStyle = new SlideItemStyleImpl1();
		return new ThemeImpl(slideStyle, slideItemStyle);		
	}

	@Override
	public Theme makeTheme1() {
		SlideStyle slideStyle = new SlideStyleImpl1();
		SlideItemStyle slideItemStyle = new SlideItemStyleImpl2();
		return new ThemeImpl(slideStyle, slideItemStyle);
	}

	@Override
	public Theme makeTheme2() {
		// TODO Auto-generated method stub
		return null;
	}
}
