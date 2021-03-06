/**
 *
 */
package model;

import java.io.IOException;

import factory.FormatFactory;
import factory.FormatFactoryImpl;

/**
 * Concrete implementation of Writer.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class WriterImpl implements Writer {

	/* (non-Javadoc)
	 * @see model.Writer#saveFile(model.Displayable, java.lang.String)
	 */
	@Override
	public void saveFile(Displayable p, String filename) throws IOException {
		FormatFactory formatFactory = new FormatFactoryImpl();
		Format format = formatFactory.makeFileFormat(filename);
		format.saveFile(p, filename);
	}

}
