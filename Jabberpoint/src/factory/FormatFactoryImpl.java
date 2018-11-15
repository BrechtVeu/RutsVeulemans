/**
 * 
 */
package factory;

import java.awt.Frame;
import java.io.IOException;

import model.DemoFormat;
import model.Format;
import model.Presentation;
import model.XMLFormat;

/**
 * @author Dominique
 *
 */
public class FormatFactoryImpl implements FormatFactory {
	
	public FormatFactoryImpl() {
	}
	
	/* (non-Javadoc)
	 * @see factory.FormatFactory#makeLoadFileCommand()
	 */
	@Override
	public Format makeFileFormat(String filename) throws IOException {
		Format format;
		if (filename.isEmpty() || filename.length() == 0) { // een demo presentatie
			format = new DemoFormat();
		} else {
			format = new XMLFormat();
		}
		return format;
	}
}
