package factory;

import model.Displayable;

public class DisplayableBuilderImpl implements DisplayableBuilder{

	private DisplayableFactory displayableFactory;
	private ThemeFactory themeFactory;
	private Displayable displayable;
	
	public DisplayableBuilderImpl() {
		this.displayableFactory = new DisplayableFactoryImpl();
		this.themeFactory = new ThemeFactoryImpl();
	}

	@Override
	public DisplayableBuilder setPresentation(Displayable presentation) {
		displayable = presentation;
		presentation.setTheme(themeFactory.makeTheme1());
		return this;
	}

	@Override
	public DisplayableBuilder addSlide(String title) {
		displayable.append(displayableFactory.makeSlide(title));
		return this;
	}

	@Override
	public DisplayableBuilder addTextItem(int level, String text) {
		if(displayable.getLastItem() == null){
			addSlide(" ");
		}
		displayable.getLastItem().append(displayableFactory.makeTextItem(level, text));		
		return this;
	}

	@Override
	public DisplayableBuilder addBitmapItem(int level, String text) {
		if(displayable.getLastItem() == null){
			addSlide(" ");
		}
		displayable.getLastItem().append(displayableFactory.makeBitmapItem(level, text));		
		return this;
	}

	@Override
	public Displayable build() {
		displayable.setSlideNumber(0);
		return displayable;
	}

}
