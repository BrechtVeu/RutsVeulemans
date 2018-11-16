package factory;

import model.Displayable;

public interface SlideDecoratorBuilder {
	public SlideDecoratorBuilder setDisplayable(Displayable displayable);
	public SlideDecoratorBuilder addLogo();
	public SlideDecoratorBuilder addBackground();
	public SlideDecoratorBuilder addPageNumber();
	public Displayable build();
}
