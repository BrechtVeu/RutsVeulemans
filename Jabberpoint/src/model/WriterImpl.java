/**
 * 
 */
package model;

import java.io.IOException;

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
		Format format;
		
		// TODO Rectify check on which type to save to.		
		format = new XMLFormat();		
		format.saveFile(p, filename);
	}

}
