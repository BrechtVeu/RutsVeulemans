/**
 *
 */
package factory;

import java.io.IOException;

import model.Format;

/**
 * @author Brecht Veulemans, Dominique Ruts
 * 
 * Gives interface for concrete implementations of a FormatFactory.
 * Responsible for creating Format.
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
	Format makeFileFormat(String filename) throws IOException;
}
