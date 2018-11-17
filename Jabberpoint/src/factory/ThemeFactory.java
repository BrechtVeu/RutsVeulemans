package factory;

import view.theme.Theme;

/**
 * @author Brecht Veulemans, Dominique Ruts
 * 
 * Gives interface for concrete implementations of a ThemeFactory.
 * Responsible for creating themes.
 *
 */
public interface ThemeFactory {
	
	/**
	 * Create a Theme1
	 * 
	 * @return theme 1
	 */
	public Theme makeTheme1();
	
	/**
	 * Create a Theme2
	 * 
	 * @return theme 2
	 */
	public Theme makeTheme2();
	
	/**
	 * Create a Theme3
	 * 
	 * @return theme 3
	 */
	public Theme makeTheme3();
	
	/**
	 * Create a Theme4
	 * 
	 * @return theme 4
	 */
	public Theme makeTheme4();
	
	/**
	 * Return a requested theme
	 * 
	 * @param theme
	 * @return a theme
	 */
	public Theme getTheme(String theme);
}
