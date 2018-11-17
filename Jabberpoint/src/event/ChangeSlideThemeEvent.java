/**
 *
 */
package event;

/**
 * @author Dominique
 *
 */
public class ChangeSlideThemeEvent extends SlideEvent {

	private static final long serialVersionUID = 1L;
	private String theme = "";

	/**
	 *
	 */
	public ChangeSlideThemeEvent(Object source) {
		super(source);
	}

	@Override
	public void setTheme(String theme) {
		this.theme = theme;
	}

	@Override
	public String getTheme() {
		return this.theme;
	}

}
