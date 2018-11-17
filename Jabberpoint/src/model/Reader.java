/**
 *
 */
package model;

import java.io.IOException;

/**
 * @author Brecht Veulemans, Dominique Ruts
 * 
 * Gives interface for concrete implementations of Reader.
 * Responsible for loading files.
 *
 */
public interface Reader {
	/**
	 * Load a file
	 * 
	 * @param p
	 * @param filename
	 * @throws IOException
	 */
	public void loadFile(Displayable p, String filename) throws IOException;
}
