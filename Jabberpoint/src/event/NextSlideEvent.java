/**
 *
 */
package event;

/**
 * Event type used by the EventListener to trigger the navigation to the next slide.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class NextSlideEvent extends SlideEvent {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for objects of class NextSlideEvent
	 * 
	 * @param source
	 */
	public NextSlideEvent(Object source) {
		super(source);
	}
}
