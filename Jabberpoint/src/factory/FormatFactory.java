/**
 *
 */
package factory;

import java.io.IOException;

import model.Format;

/**
 * @author Dominique
 *
 */
public interface FormatFactory {
	Format makeFileFormat(String filename) throws IOException;
}
