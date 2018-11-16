package factory;

import model.Displayable;
import view.decorator.BackgroundDecorator;
import view.decorator.LogoDecorator;
import view.decorator.PageNumberDecorator;

public class SlideDecoratorBuilderImpl implements SlideDecoratorBuilder{

	private Displayable displayable;

	@Override
	public SlideDecoratorBuilder setDisplayable(Displayable displayable) {
		this.displayable = displayable;
		return this;
	}
	
	@Override
	public SlideDecoratorBuilder addLogo() {
		displayable = new LogoDecorator(displayable);
		return this;
	}

	@Override
	public SlideDecoratorBuilder addBackground() {
		displayable = new BackgroundDecorator(displayable);
		return this;
	}

	@Override
	public SlideDecoratorBuilder addPageNumber() {
		displayable = new PageNumberDecorator(displayable);
		return this;
	}

	@Override
	public Displayable build() {
		return displayable;
	}
}
