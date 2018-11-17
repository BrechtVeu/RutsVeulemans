package event;

/**
 * Event type used by the EventListener to trigger the navigation to the previous slide.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class PreviousSlideEvent extends SlideEvent {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for objects of class PreviousSlideEvent
	 * 
	 * @param source
	 */
	public PreviousSlideEvent(Object source) {
		super(source);
	}

}
