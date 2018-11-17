package model;

/**
 * @author Brecht Veulemans, Dominique Ruts
 * 
 * Gives interface for concrete implementations of Observer.
 * Responsible for updating listeners.
 *
 */
public interface Observer {
	/**
	 * Update a listener
	 * 
	 * @param presenation
	 * @param slide
	 */
	public void update(Displayable presenation, Displayable slide);
}
