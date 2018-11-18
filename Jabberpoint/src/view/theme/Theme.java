package view.theme;

/**
 * Gives interface for concrete implementations of Theme.
 * Responsible for defining a theme with its styles.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public interface Theme {
	/**
	 * Gets the Slide Style of the theme for the first slide
	 * 
	 * @return a SlideStyle
	 */
	public SlideStyle getSlideStyle();

	/**
	 * Gets the Slide Item Style of the theme for the first slide
	 * 
	 * @return a SlideItemStyle
	 */
	public SlideItemStyle getSlideItemStyle();

	/**
	 * Gets the Slide Style of the theme for all slides except the first
	 * 
	 * @return a SlideStyle
	 */
	public SlideStyle getSlideStyleOthers();

	/**
	 * Gets the Slide Item Style of the theme for all slides except the first
	 * 
	 * @return a SlideItemStyle
	 */
	public SlideItemStyle getSlideItemStyleOthers();

}
