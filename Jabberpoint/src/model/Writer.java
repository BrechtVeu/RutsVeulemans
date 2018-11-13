/**
 * 
 */
package model;

import java.io.IOException;

/**
 * @author Dominique
 *
 */
public interface Writer {
	public void saveFile(Presentation p, String filename) throws IOException;
}
