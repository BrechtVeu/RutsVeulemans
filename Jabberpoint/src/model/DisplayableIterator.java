package model;

import java.util.ListIterator;

/**
 * Gives interface for concrete implementations of a DisplayableIterator<Displayable>.
 * Responsible for adding extra functionality to an iterator.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
@SuppressWarnings("hiding")
public interface DisplayableIterator<Displayable> extends ListIterator<Displayable> {
	/**
	 * Get the number of the Displayable
	 * 
	 * @return the number of the Displayable
	 */
	public int getDisplayableNumber();

	/**
	 * Clear the iterator
	 */
	void clear();

	/**
	 * Set the number of the current Displayable
	 * 
	 * @param displayableNumber
	 */
	void setCurrentDisplayableNumber(int displayableNumber);

	/**
	 * Get the current Displayable
	 * 
	 * @return the current Displayable
	 */
	Displayable getCurrentDisplayable();
}
