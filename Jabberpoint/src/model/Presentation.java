package model;

import java.util.ArrayList;

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
 */

public class Presentation extends Displayable {
	private String showTitle; // de titel van de presentatie

	public Presentation() {
		clear();
	}

	@Override
	public String getTitle() {
		return showTitle;
	}

	@Override
	public void setTitle(String nt) {
		showTitle = nt;
	}

	public void exit(int n) {
		System.exit(n);
	}
}
