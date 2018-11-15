package event;

import java.util.EventObject;

public abstract class SlideEvent extends EventObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int slideNumber = 0;

	public SlideEvent(Object source) {
		super(source);
	}
	
	public void setSlideNumber (int slideNumber) {
		this.slideNumber = slideNumber;
	}
	
	public int getSlideNumber () {
		return this.slideNumber;
	}
}
