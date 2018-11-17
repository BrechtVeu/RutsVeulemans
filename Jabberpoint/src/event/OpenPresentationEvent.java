package event;

/**
 * Event type used by the EventListener to trigger the navigation to the next slide.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class OpenPresentationEvent extends SlideEvent {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for objects of class OpenPresentationEvent
	 * 
	 * @param source
	 */
	public OpenPresentationEvent(Object source) {
		super(source);
	}

}
