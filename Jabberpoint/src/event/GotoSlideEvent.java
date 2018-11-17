package event;

public class GotoSlideEvent extends SlideEvent {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private int slideNumber = 0;

	public GotoSlideEvent(Object source) {
		super(source);
	}

	@Override
	public void setSlideNumber(int slideNumber) {
		this.slideNumber = slideNumber;
	}

	@Override
	public int getSlideNumber() {
		return this.slideNumber;
	}
}
