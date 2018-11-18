/**
 *
 */
package model;

import java.io.IOException;

/**
 * Gives interface for concrete implementations of Reader.
 * Responsible for loading files.
 * 
 * @author Brecht Veulemans, Dominique Ruts
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
