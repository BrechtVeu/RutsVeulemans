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
	public void loadFile(Presentation p, String filename) throws IOException;
	public void saveFile(Presentation p, String filename) throws IOException;
}
