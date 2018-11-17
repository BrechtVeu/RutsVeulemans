package factory;

import model.BitmapItem;
import model.Displayable;
import model.Presentation;
import model.Slide;
import model.TextItem;
import view.drawer.BitmapItemDrawer;
import view.drawer.BitmapItemDrawerImpl;
import view.drawer.SlideDrawer;
import view.drawer.SlideDrawerImpl;
import view.drawer.TextItemDrawer;
import view.drawer.TextItemDrawerImpl;

public class DisplayableFactoryImpl implements DisplayableFactory {

	@Override
	public Displayable makePresentation() {
		return new Presentation();
	}

	@Override
	public Displayable makeSlide() {
		SlideDrawer slideDrawer = new SlideDrawerImpl();
		Displayable slide = new Slide(slideDrawer);
		//slide.setTitle(title);
		return slide;
	}

	@Override
	public Displayable makeTextItem(int level, String text) {
		TextItemDrawer textItemDrawer = new TextItemDrawerImpl();
		Displayable textItem = new TextItem(level, text, textItemDrawer);
		return textItem;
	}

	@Override
	public Displayable makeBitmapItem(int level, String text) {
		BitmapItemDrawer bitmapItemDrawer = new BitmapItemDrawerImpl();
		Displayable textItem = new BitmapItem(level, text, bitmapItemDrawer);
		return textItem;
	}
}
