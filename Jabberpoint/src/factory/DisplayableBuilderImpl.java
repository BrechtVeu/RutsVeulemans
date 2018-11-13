package factory;

import model.Displayable;

public class DisplayableBuilderImpl implements DisplayableBuilder{

	private DisplayableFactoryImpl displayableFactory;
	
	private Displayable displayable;
	
	public DisplayableBuilderImpl() {
		this.displayableFactory = new DisplayableFactoryImpl();
	}

	@Override
	public DisplayableBuilder makePresentation(Displayable presentation) {
		displayable = displayableFactory.makePresentation();
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
