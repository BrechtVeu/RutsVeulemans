package model;

import java.util.ArrayList;

/**
 * Concrete implementation of DisplayableIterator<Displayable>.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class DisplayableIteratorImpl<Displayable> implements DisplayableIterator<Displayable> {

	private int currentDisplayableNumber;
	private ArrayList<Displayable> displayableIteratorList = new ArrayList<Displayable>();

	/**
	 * Constructor for objects of class DisplayableIteratorImpl
	 * 
	 * @param displayableList
	 * @param currentSlideNumber
	 */
	public DisplayableIteratorImpl(ArrayList<Displayable> displayableList, int currentSlideNumber) {
		this.displayableIteratorList = displayableList;
		this.currentDisplayableNumber = currentSlideNumber;
	}

	/* (non-Javadoc)
	 * @see java.util.ListIterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		if (currentDisplayableNumber < displayableIteratorList.size() - 1) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.util.ListIterator#next()
	 */
	@Override
	public Displayable next() {
		if (hasNext()) {
			currentDisplayableNumber += 1;
		}
		return displayableIteratorList.get(currentDisplayableNumber - 1);
	}

	/* (non-Javadoc)
	 * @see java.util.ListIterator#add(java.lang.Object)
	 */
	@Override
	public void add(Displayable arg0) {
		this.displayableIteratorList.add(arg0);
	}

	/* (non-Javadoc)
	 * @see java.util.ListIterator#hasPrevious()
	 */
	@Override
	public boolean hasPrevious() {
		if (currentDisplayableNumber > 0) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.util.ListIterator#nextIndex()
	 */
	@Override
	public int nextIndex() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.util.ListIterator#previousIndex()
	 */
	@Override
	public int previousIndex() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.util.ListIterator#remove()
	 */
	@Override
	public void remove() {
	}

	/* (non-Javadoc)
	 * @see model.DisplayableIterator#clear()
	 */
	@Override
	public void clear() {
		displayableIteratorList.clear();
		currentDisplayableNumber = -1;
	}

	/* (non-Javadoc)
	 * @see java.util.ListIterator#set(java.lang.Object)
	 */
	@Override
	public void set(Displayable arg0) {
	}

	/* (non-Javadoc)
	 * @see java.util.ListIterator#previous()
	 */
	@Override
	public Displayable previous() {
		if (hasPrevious()) {
			currentDisplayableNumber -= 1;
		}
		return displayableIteratorList.get(currentDisplayableNumber);
	}

	/* (non-Javadoc)
	 * @see model.DisplayableIterator#setCurrentDisplayableNumber(int)
	 */
	@Override
	public void setCurrentDisplayableNumber(int displayableNumber) {
		this.currentDisplayableNumber = displayableNumber;
	}

	/* (non-Javadoc)
	 * @see model.DisplayableIterator#getDisplayableNumber()
	 */
	@Override
	public int getDisplayableNumber() {
		return currentDisplayableNumber;
	}

	/* (non-Javadoc)
	 * @see model.DisplayableIterator#getCurrentDisplayable()
	 */
	@Override
	public Displayable getCurrentDisplayable() {
		return displayableIteratorList.get(currentDisplayableNumber);
	}

}
