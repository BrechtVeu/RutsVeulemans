/**
 *
 */
package model;

import java.io.IOException;

/**
 * Gives interface for concrete implementations of a Format.
 * Responsible for loading and writing in a format.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 * 
 */
public interface Format {
	/**
	 * Load a file in a format
	 * 
	 * @param p
	 * @param filename
	 * @throws IOException
	 */
	public void loadFile(Displayable p, String filename) throws IOException;

	/**
	 * Save a file in a format
	 * 
	 * @param p
	 * @param filename
	 * @throws IOException
	 */
	public void saveFile(Displayable p, String filename) throws IOException;
}
