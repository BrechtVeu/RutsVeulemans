/**
 *
 */
package model;

import java.io.IOException;

/**
 * Gives interface for concrete implementations of Writer.
 * Responsible for write files.
 * 
 * @author Brecht Veulemans, Dominique Ruts
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
