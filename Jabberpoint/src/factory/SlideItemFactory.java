package factory;

import model.Displayable;

public interface SlideItemFactory {
	public Displayable mkTextItem(int level, String text);
	public Displayable mkBitmapItem(int level, String text);
}
