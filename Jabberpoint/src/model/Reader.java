/**
 * 
 */
package model;

import java.io.IOException;

/**
 * @author Dominique
 *
 */
public interface Reader {
	public void loadFile(Displayable presentation, String filename) throws IOException;
}
