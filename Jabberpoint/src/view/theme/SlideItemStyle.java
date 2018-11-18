package view.theme;

/**
 * Abstract class defining a Slide Item Style. Specific Slide Item Style will extend on this base class.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public abstract class SlideItemStyle {

	protected Style[] styles; // de styles

	/**
	 * Returns the style for a Slide Item with a specified level
	 * 
	 * @param level
	 * @return the style for a slide item
	 */
	public abstract Style getStyle(int level);
}
