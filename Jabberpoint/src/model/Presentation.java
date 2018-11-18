package model;

/**
 * <p>
 * Presentation houdt de slides in de presentatie bij.
 * </p>
 * <p>
 * Er is slechts één instantie van deze klasse aanwezig.
 * </p>
 *
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 * @version 1.7 2018/11/17 Brecht Veulemans, Dominique Ruts
 */
public class Presentation extends Displayable {
	private String showTitle; // de titel van de presentatie

	/**
	 * Constructor to make a new Presentation.
	 * Clears on initialization.
	 */
	public Presentation() {
		clear();
	}

	/* (non-Javadoc)
	 * @see model.Displayable#getTitle()
	 */
	@Override
	public String getTitle() {
		return showTitle;
	}

	/* (non-Javadoc)
	 * @see model.Displayable#setTitle(java.lang.String)
	 */
	@Override
	public void setTitle(String nt) {
		showTitle = nt;
	}
}
