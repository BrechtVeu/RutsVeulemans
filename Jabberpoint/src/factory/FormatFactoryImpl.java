/**
 *
 */
package factory;

import java.io.IOException;

import model.DemoFormat;
import model.Format;
import model.XMLFormat;

/**
 * Concrete implementation of FormatFactory.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class FormatFactoryImpl implements FormatFactory {
	
	/* (non-Javadoc)
	 * @see factory.FormatFactory#makeLoadFileCommand()
	 */
	@Override
	public Format makeFileFormat(String filename) throws IOException {
		Format format;
		if (filename.isEmpty() || filename.length() == 0) {
			format = new DemoFormat();
		} else {
			format = new XMLFormat();
		}
		return format;
	}
}
