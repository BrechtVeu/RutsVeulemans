package factory;

import view.theme.Theme;

public interface ThemeFactory {
	public Theme makeTheme1();

	public Theme makeTheme2();

	public Theme makeTheme3();

	public Theme makeTheme4();

	public Theme getTheme(String theme);
}
