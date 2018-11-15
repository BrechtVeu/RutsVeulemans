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
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadFile(Presentation p, String filename) throws IOException {
		FormatFactory formatFactory = new FormatFactoryImpl();
		Format format = formatFactory.makeFileFormat(filename);
		format.loadFile(p, filename);
	}

}
