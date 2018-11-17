package event;

import java.util.EventObject;

/**
 * Defines an abstract SlideEvent object that can be extended by specific events.
 * This is used as the generic type in the Commands and classes that implement the CommandEventListener.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public abstract class SlideEvent extends EventObject {
	private static final long serialVersionUID = 1L;
	private int slideNumber = 0;
	private String theme = "";

	/**
	 * Constructor for objects of class SlideEvent
	 * 
	 * @param source
	 */
	public SlideEvent(Object source) {
		super(source);
	}

	/**
	 * Get the current slide number
	 * 
	 * @return the current slide number
	 */
	public int getSlideNumber() {
		return this.slideNumber;
	}

	/**
	 * Set the current slide number
	 * 
	 * @param slideNumber
	 */
	public void setSlideNumber(int slideNumber) {
		this.slideNumber = slideNumber;
	}

	/**
	 * Get the current theme
	 * 
	 * @return the current theme
	 */
	public String getTheme() {
		return this.theme;
	}

	/**
	 * Set the current theme
	 * 
	 * @param theme
	 */
	public void setTheme(String theme) {
		this.theme = theme;
	}
}
