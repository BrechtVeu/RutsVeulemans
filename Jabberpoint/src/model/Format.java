/**
 *
 */
package model;

import java.io.IOException;

/**
 * @author Brecht Veulemans, Dominique Ruts
 * 
 * Gives interface for concrete implementations of a Format.
 * Responsible for loading and writing in a format.
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
