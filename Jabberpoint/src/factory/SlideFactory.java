package factory;

import model.Displayable;

public interface SlideFactory {
	public Displayable makeSlide(String title);
}
