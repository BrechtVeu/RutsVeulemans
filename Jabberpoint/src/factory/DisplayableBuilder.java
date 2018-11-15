package factory;

import model.Displayable;

public interface DisplayableBuilder {
	public DisplayableBuilder setPresentation(Displayable presentation);
	public DisplayableBuilder addSlide(String title);
	public DisplayableBuilder addTextItem(int level, String text);
	public DisplayableBuilder addBitmapItem(int level, String text);
	
	public Displayable build();
	
	
	
}
