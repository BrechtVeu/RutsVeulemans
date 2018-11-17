package factory;

import model.Displayable;

/**
 * @author Brecht Veulemans, Dominique Ruts
 * 
 * Gives interface for concrete implementations of a DisplayableFactory.
 * Responsible for creating Displayable objects.
 *
 */
public interface DisplayableFactory {
	
	/**
	 * Creates an new Presentation object
	 * 
	 * @return a presentation
	 */
	public Displayable makePresentation();
	
	/**
	 * Creates a new Slide object
	 * 
	 * @param title
	 * @return a slide
	 */
	public Displayable makeSlide();
	/**
	 * Creates a new TextItem object
	 * 
	 * @param level
	 * @param text
	 * @return a text item
	 */
	public Displayable makeTextItem(int level, String text);
	
	/**
	 * Creates a new BitmapItem object
	 * 
	 * @param level
	 * @param text
	 * @return a bitmap item
	 */
	public Displayable makeBitmapItem(int level, String text);
}
