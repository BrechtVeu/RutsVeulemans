package event;

import java.util.EventObject;

public abstract class SlideEvent extends EventObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int slideNumber = 0;
	private String theme = "";

	public SlideEvent(Object source) {
		super(source);
	}
	

	public int getSlideNumber () {
		return this.slideNumber;
	}
	
	public void setSlideNumber (int slideNumber) {
		this.slideNumber = slideNumber;
	}

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
}
