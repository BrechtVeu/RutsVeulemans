/**
 *
 */
package model;

import java.io.IOException;

/**
 * @author Dominique
 *
 */
public interface Format {
	public void loadFile(Displayable p, String filename) throws IOException;

	public void saveFile(Displayable p, String filename) throws IOException;
}
