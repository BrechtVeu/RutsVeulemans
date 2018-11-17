package factory;

import model.Displayable;

/**
 * @author Brecht Veulemans, Dominique Ruts
 *
 * Gives interface for concrete classes of DisplayableBuilder.
 * Responsible for building a presentation.
 *
 */
public interface DisplayableBuilder {
	
	/**
	 * Set a presentation
	 * 
	 * @param presentation
	 * @return DisplayableBuilder
	 */
	public DisplayableBuilder setPresentation(Displayable presentation);
	
	/**
	 * Add a slide to the presentation
	 * 
	 * @param title
	 * @return DisplayableBuilder
	 */
	public DisplayableBuilder addSlide();
	
	/**
	 * Add a textitem to the presentation
	 * 
	 * @param level
	 * @param text
	 * @return DisplayableBuilder
	 */
	public DisplayableBuilder addTextItem(int level, String text);
	
	/**
	 * Add a bitmapitem to the presentation
	 * 
	 * @param level
	 * @param text
	 * @return DisplayableBuilder
	 */
	public DisplayableBuilder addBitmapItem(int level, String text);
	
	/**
	 * Return the presentation
	 * 
	 * @return presentation
	 */
	public Displayable build();

}
