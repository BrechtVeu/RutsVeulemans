/**
 *
 */
package factory;

import java.io.IOException;

import model.Format;

/**
 * Gives interface for concrete implementations of a FormatFactory.
 * Responsible for creating Format.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 * 
 */
public interface FormatFactory {
	
	/**
	 * Create a file format based on filename
	 * 
	 * @param filename
	 * @return Format
	 * @throws IOException
	 */
	public Format makeFileFormat(String filename) throws IOException;
}
