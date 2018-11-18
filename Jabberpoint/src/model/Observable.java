package model;

/**
 * Gives interface for concrete implementations of a Observable.
 * Responsible for attaching, detaching and notifying Observers.
 * 
 * @author Brecht Veulemans, Dominique Ruts
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
