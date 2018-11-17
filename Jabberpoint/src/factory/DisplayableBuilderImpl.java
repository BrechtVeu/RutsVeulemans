package factory;

import jabberpoint.Values;
import model.Displayable;

/**
 * @author Brecht Veulemans, Dominique Ruts
 *
 * Concrete implementation of DisplayableBuilder.
 *
 */
public class DisplayableBuilderImpl implements DisplayableBuilder {

	private DisplayableFactory displayableFactory;
	private Displayable displayable;
	
	/**
	 * Constructor for objects of class DisplayableBuilderImpl
	 */
	public DisplayableBuilderImpl() {
		this.displayableFactory = new DisplayableFactoryImpl();
	}

	/* (non-Javadoc)
	 * @see factory.DisplayableBuilder#setPresentation(model.Displayable)
	 */
	@Override
	public DisplayableBuilder setPresentation(Displayable presentation) {
		displayable = presentation;
		presentation.setTheme(Values.THEME1);
		return this;
	}

	/* (non-Javadoc)
	 * @see factory.DisplayableBuilder#addSlide(java.lang.String)
	 */
	@Override
	public DisplayableBuilder addSlide() {
		Displayable slide = displayableFactory.makeSlide();
		displayable.append(slide);
		return this;
	}

	/* (non-Javadoc)
	 * @see factory.DisplayableBuilder#addTextItem(int, java.lang.String)
	 */
	@Override
	public DisplayableBuilder addTextItem(int level, String text) {
		if (displayable.getLastItem() == null) {
			addSlide();
		}
		displayable.getLastItem().append(displayableFactory.makeTextItem(level, text));
		return this;
	}

	/* (non-Javadoc)
	 * @see factory.DisplayableBuilder#addBitmapItem(int, java.lang.String)
	 */
	@Override
	public DisplayableBuilder addBitmapItem(int level, String text) {
		if (displayable.getLastItem() == null) {
			addSlide();
		}
		displayable.getLastItem().append(displayableFactory.makeBitmapItem(level, text));
		return this;
	}

	/* (non-Javadoc)
	 * @see factory.DisplayableBuilder#build()
	 */
	@Override
	public Displayable build() {
		displayable.setDisplayableNumber(0);
		displayable.setIterator();
		return displayable;
	}
}
