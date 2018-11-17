package factory;

import model.Displayable;
import view.decorator.BackgroundDecorator;
import view.decorator.LogoDecorator;
import view.decorator.PageNumberDecorator;

/**
 * @author Brecht Veulemans, Dominique Ruts
 *
 * Concrete implementation of SlideDecoratorBuilder.
 *
 */
public class SlideDecoratorBuilderImpl implements SlideDecoratorBuilder {

	private Displayable displayable;

	/* (non-Javadoc)
	 * @see factory.SlideDecoratorBuilder#setDisplayable(model.Displayable)
	 */
	@Override
	public SlideDecoratorBuilder setDisplayable(Displayable displayable) {
		this.displayable = displayable;
		return this;
	}
	
	/* (non-Javadoc)
	 * @see factory.SlideDecoratorBuilder#addLogo()
	 */
	@Override
	public SlideDecoratorBuilder addLogo() {
		displayable = new LogoDecorator(displayable);
		return this;
	}

	/* (non-Javadoc)
	 * @see factory.SlideDecoratorBuilder#addBackground()
	 */
	@Override
	public SlideDecoratorBuilder addBackground() {
		displayable = new BackgroundDecorator(displayable);
		return this;
	}

	/* (non-Javadoc)
	 * @see factory.SlideDecoratorBuilder#addPageNumber()
	 */
	@Override
	public SlideDecoratorBuilder addPageNumber() {
		displayable = new PageNumberDecorator(displayable);
		return this;
	}

	/* (non-Javadoc)
	 * @see factory.SlideDecoratorBuilder#build()
	 */
	@Override
	public Displayable build() {
		return displayable;
	}
}
