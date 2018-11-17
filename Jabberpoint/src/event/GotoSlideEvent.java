package event;

/**
 * Event type used by the EventListener to trigger the navigation to a different slide.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class GotoSlideEvent extends SlideEvent {

	private static final long serialVersionUID = 1L;
	private int slideNumber = 0;

	/**
	 * Constructor for objects of class GotoSlideEvent
	 * 
	 * @param source
	 */
	public GotoSlideEvent(Object source) {
		super(source);
	}

	/* (non-Javadoc)
	 * @see event.SlideEvent#setSlideNumber(int)
	 */
	@Override
	public void setSlideNumber(int slideNumber) {
		this.slideNumber = slideNumber;
	}

	/* (non-Javadoc)
	 * @see event.SlideEvent#getSlideNumber()
	 */
	@Override
	public int getSlideNumber() {
		return this.slideNumber;
	}
}
