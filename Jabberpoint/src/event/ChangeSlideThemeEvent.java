/**
 *
 */
package event;

/**
 * Event type used by the EventListener to trigger a change in theme.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class ChangeSlideThemeEvent extends SlideEvent {

	private static final long serialVersionUID = 1L;
	private String theme = "";

	/**
	 * Constructor for objects of class ChangeSlideThemeEvent
	 * 
	 * @param source
	 */
	public ChangeSlideThemeEvent(Object source) {
		super(source);
	}

	/* (non-Javadoc)
	 * @see event.SlideEvent#setTheme(java.lang.String)
	 */
	@Override
	public void setTheme(String theme) {
		this.theme = theme;
	}

	/* (non-Javadoc)
	 * @see event.SlideEvent#getTheme()
	 */
	@Override
	public String getTheme() {
		return this.theme;
	}

}
