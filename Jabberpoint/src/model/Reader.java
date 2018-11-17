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
	public void loadFile(Displayable p, String filename) throws IOException;
}
