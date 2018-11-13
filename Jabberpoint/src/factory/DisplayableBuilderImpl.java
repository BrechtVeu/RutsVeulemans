package factory;

import model.Displayable;

public class DisplayableBuilderImpl implements DisplayableBuilder{

	private SlideFactory slideFactory;
	private SlideItemFactory slideItemFactory;
	
	private Displayable displayable;
	
	public DisplayableBuilderImpl() {
		super();
		this.slideFactory = new SlideFactory();
		this.slideItemFactory = new SlideItemFactory();
	}

	@Override
	public DisplayableBuilder mkPresentation(Displayable presentation) {
		displayable = presentation;
		return this;
	}

	@Override
	public DisplayableBuilder addSlide(String title) {
		displayable.append(slideFactory.makeSlide(title));
		return this;
	}

	@Override
	public DisplayableBuilder addTextItem(int level, String text) {
		displayable.append(slideItemFactory.mkTextItem(level, text));		
		return this;
	}

	@Override
	public DisplayableBuilder addBitmapItem(int level, String text) {
		displayable.append(slideItemFactory.mkBitmapItem(level, text));		
		return this;
	}

	@Override
	public Displayable build() {
		// TODO Auto-generated method stub
		return displayable;
	}

}
