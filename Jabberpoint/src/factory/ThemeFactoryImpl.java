package factory;

import view.theme.SlideItemStyle;
import view.theme.SlideItemStyleImpl1;
import view.theme.SlideItemStyleImpl2;
import view.theme.SlideStyle;
import view.theme.SlideStyleImpl1;
import view.theme.SlideStyleImpl2;
import view.theme.Theme;
import view.theme.ThemeImpl;

public class ThemeFactoryImpl implements ThemeFactory {
	
	@Override
	public Theme makeDefaultTheme(){
		SlideStyle slideStyle = new SlideStyleImpl1();
		SlideItemStyle slideItemStyle = new SlideItemStyleImpl1();
		return new ThemeImpl(slideStyle, slideItemStyle, slideStyle, slideItemStyle);		
	}

	@Override
	public Theme makeTheme1() {
		SlideStyle slideStyle = new SlideStyleImpl1();
		SlideItemStyle slideItemStyle = new SlideItemStyleImpl2();

		SlideStyle slideStyleOthers = new SlideStyleImpl2();
		SlideItemStyle slideItemStyleOthers = new SlideItemStyleImpl1();
		return new ThemeImpl(slideStyle, slideItemStyle, slideStyleOthers, slideItemStyleOthers);
	}

	@Override
	public Theme makeTheme2() {
		SlideStyle slideStyle = new SlideStyleImpl2();
		SlideItemStyle slideItemStyle = new SlideItemStyleImpl1();
		
		SlideStyle slideStyleOthers = new SlideStyleImpl2();
		SlideItemStyle slideItemStyleOthers = new SlideItemStyleImpl1();
		return new ThemeImpl(slideStyle, slideItemStyle, slideStyleOthers, slideItemStyleOthers);
	}
}
