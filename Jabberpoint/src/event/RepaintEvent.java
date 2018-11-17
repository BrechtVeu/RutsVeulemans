package event;

/**
 * Event type used by the EventListener to trigger the remove and clean the active presentation from the screen.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class RepaintEvent extends SlideEvent {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for objects of class RepaintEvent
	 * 
	 * @param source
	 */
	public RepaintEvent(Object source) {
		super(source);
	}

}
