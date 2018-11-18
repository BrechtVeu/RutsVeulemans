/**
 *
 */
package model;

import java.io.IOException;

import factory.FormatFactory;
import factory.FormatFactoryImpl;

/**
 * Concrete implementation of Reader.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class ReaderImpl implements Reader {

	/* (non-Javadoc)
	 * @see model.Reader#loadFile(model.Displayable, java.lang.String)
	 */
	@Override
	public void loadFile(Displayable p, String filename) throws IOException {
		FormatFactory formatFactory = new FormatFactoryImpl();
		Format format = formatFactory.makeFileFormat(filename);
		format.loadFile(p, filename);
	}

}
