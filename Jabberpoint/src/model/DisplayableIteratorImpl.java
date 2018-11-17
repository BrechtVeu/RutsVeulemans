package model;

import java.util.ArrayList;

public class DisplayableIteratorImpl<Displayable> implements DisplayableIterator<Displayable> {

	private int currentSlideNumber;
	private ArrayList<Displayable> displayableIteratorList = new ArrayList<Displayable>();

	public DisplayableIteratorImpl(ArrayList<Displayable> displayableList, int currentSlideNumber) {
		this.displayableIteratorList = displayableList;
		this.currentSlideNumber = currentSlideNumber;
	}

	@Override
	public boolean hasNext() {
		if (currentSlideNumber < displayableIteratorList.size() - 1) {
			return true;
		}
		return false;
	}

	@Override
	public Displayable next() {
		if (hasNext()) {
			currentSlideNumber += 1;
		}
		return displayableIteratorList.get(currentSlideNumber - 1);
	}

	@Override
	public void add(Displayable arg0) {
		this.displayableIteratorList.add(arg0);
	}

	@Override
	public boolean hasPrevious() {
		if (currentSlideNumber > 0) {
			return true;
		}
		return false;
	}

	@Override
	public int nextIndex() {
		return 0;
	}

	@Override
	public int previousIndex() {
		return 0;
	}

	@Override
	public void remove() {
	}

	@Override
	public void clear() {
		displayableIteratorList.clear();
		currentSlideNumber = -1;
	}

	@Override
	public void set(Displayable arg0) {
	}

	@Override
	public Displayable previous() {
		if (hasPrevious()) {
			currentSlideNumber -= 1;
		}
		return displayableIteratorList.get(currentSlideNumber);
	}

	@Override
	public void setSlideNumber(int displayableNumber) {
		this.currentSlideNumber = displayableNumber;
	}

	@Override
	public int getSlideNumber() {
		return currentSlideNumber;
	}

	@Override
	public Displayable getCurrentDisplayable() {
		return displayableIteratorList.get(currentSlideNumber);
	}

}
