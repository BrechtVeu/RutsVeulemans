/**
 *
 */
package model;

import java.io.IOException;

/**
 * @author Brecht Veulemans, Dominique Ruts
 * 
 * Gives interface for concrete implementations of Writer.
 * Responsible for write files.
 *
 */
public interface Writer {
	/**
	 * Write a presentation to a file
	 * 
	 * @param p
	 * @param filename
	 * @throws IOException
	 */
	public void saveFile(Displayable p, String filename) throws IOException;
}
