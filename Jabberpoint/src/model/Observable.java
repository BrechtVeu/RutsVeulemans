package model;

/**
 * @author Brecht Veulemans, Dominique Ruts
 * 
 * Gives interface for concrete implementations of a Observable.
 * Responsible for attaching, detaching and notifying Observers.
 *
 */
public interface Observable {
	/**
	 * Attach an Observer
	 * 
	 * @param observer
	 */
	public void attach(Observer observer);

	/**
	 * Detach an Observer
	 * 
	 * @param observer
	 */
	public void detach(Observer observer);

	/**
	 * Notify Observers
	 */
	public void notifyObservers();
}
