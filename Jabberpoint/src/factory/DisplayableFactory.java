package factory;

import model.Displayable;

public interface DisplayableFactory {
	public Displayable makePresentation();

	public Displayable makeSlide();

	public Displayable makeTextItem(int level, String text);

	public Displayable makeBitmapItem(int level, String text);
}
