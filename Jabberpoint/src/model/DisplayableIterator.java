package model;

import java.util.ListIterator;

@SuppressWarnings("hiding")
public interface DisplayableIterator<Displayable> extends ListIterator<Displayable> {
	public int getSlideNumber();

	void clear();

	void setSlideNumber(int displayableNumber);

	Displayable getCurrentDisplayable();
}
