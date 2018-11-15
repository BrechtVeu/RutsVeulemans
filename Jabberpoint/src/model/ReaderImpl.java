/**
 * 
 */
package model;

import java.io.IOException;

/**
 * @author Dominique
 *
 */
public class ReaderImpl implements Reader {

	/**
	 * 
	 */
	public ReaderImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadFile(Displayable p, String filename) throws IOException {
		Format format;
		if (filename.isEmpty() || filename.length() == 0) { // een demo presentatie
			format = new DemoFormat();
		} else {
			format = new XMLFormat();
		}
		format.loadFile(p, filename);
	}

}
