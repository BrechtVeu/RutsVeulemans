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
public class WriterImpl implements Writer {

	/**
	 * 
	 */
	public WriterImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveFile(Displayable p, String filename) throws IOException {
		FormatFactory formatFactory = new FormatFactoryImpl();
		Format format = formatFactory.makeFileFormat(filename);
		format.saveFile(p, filename);
	}

}
