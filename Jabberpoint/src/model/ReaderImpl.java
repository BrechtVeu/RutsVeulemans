/**
 *
 */
package model;

import java.io.IOException;

import factory.FormatFactory;
import factory.FormatFactoryImpl;

/**
 * @author Dominique
 *
 */
public class ReaderImpl implements Reader {

	/**
	 *
	 */
	public ReaderImpl() {
	}

	@Override
	public void loadFile(Displayable p, String filename) throws IOException {
		FormatFactory formatFactory = new FormatFactoryImpl();
		Format format = formatFactory.makeFileFormat(filename);
		format.loadFile(p, filename);
	}

}
