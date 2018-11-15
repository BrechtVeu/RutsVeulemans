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
	public void saveFile(Displayable p, String filename) throws IOException;
}
