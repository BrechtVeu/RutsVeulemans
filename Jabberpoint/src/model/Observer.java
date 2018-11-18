package model;

/**
 * Gives interface for concrete implementations of Observer.
 * Responsible for updating listeners.
 * 
 * @author Brecht Veulemans, Dominique Ruts
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
