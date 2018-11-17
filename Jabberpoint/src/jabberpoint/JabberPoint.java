package jabberpoint;

import java.io.IOException;

import javax.swing.JOptionPane;

import factory.DisplayableFactory;
import factory.DisplayableFactoryImpl;
import model.Displayable;
import model.Reader;
import model.ReaderImpl;
import view.SlideViewerFrame;

/**
 * JabberPoint Main Programma
 * <p>
 * This program is distributed under the terms of the accompanying COPYRIGHT.txt
 * file (which is NOT the GNU General Public License). Please read it. Your use
 * of the software constitutes acceptance of the terms in the COPYRIGHT.txt
 * file.
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

public class JabberPoint {

	/**
	 * <p>
	 * Main program; a default presentation will be loaded if no arguments are passed.
	 * </p>
	 * 
	 * @param argv
	 */
	public static void main(String argv[]) {
		DisplayableFactory factory = new DisplayableFactoryImpl();
		Displayable presentation = factory.makePresentation();
		new SlideViewerFrame(Values.JABVERSION, presentation);

		Reader reader = new ReaderImpl();

		try {
			if (argv.length == 0) { // een demo presentatie
				reader.loadFile(presentation, "");
			} else {
				reader.loadFile(presentation, argv[0]);
			}
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, Values.IOERR + ex, Values.JABERR, JOptionPane.ERROR_MESSAGE);
		}
	}
}
