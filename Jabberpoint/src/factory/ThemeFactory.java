package factory;

import view.theme.Theme;

public interface ThemeFactory {
	public Theme makeDefaultTheme();
	public Theme makeTheme1();
	public Theme makeTheme2();
}
