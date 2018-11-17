package factory;

import model.Displayable;

/**
 * @author Brecht Veulemans, Dominique Ruts
 * 
 * Gives interface for concrete implementations of a SlideDecoratorBuilder.
 * Responsible for building decorator around a Displayable object.
 *
 */
public interface SlideDecoratorBuilder {
	
	/**
	 * Set a displayable to decorate
	 * 
	 * @param displayable
	 * @return SlideDecoratorBuilder
	 */
	public SlideDecoratorBuilder setDisplayable(Displayable displayable);
	
	/**
	 * Add a logo to a displayable
	 * 
	 * @return SlideDecoratorBuilder
	 */
	public SlideDecoratorBuilder addLogo();
	
	/**
	 * Add a background to a displayable
	 * 
	 * @return SlideDecoratorBuilder
	 */
	public SlideDecoratorBuilder addBackground();
	
	/**
	 * Add a pagenumber on a displayable
	 * 
	 * @return SlideDecoratorBuilder
	 */
	public SlideDecoratorBuilder addPageNumber();
	
	/**
	 * Return the displayable
	 * 
	 * @return Displayable
	 */
	public Displayable build();
}
