package factory;

import model.BitmapItem;
import model.Displayable;
import model.TextItem;
import view.drawer.BitmapItemDrawer;
import view.drawer.BitmapItemDrawerImpl;
import view.drawer.TextItemDrawer;
import view.drawer.TextItemDrawerImpl;

public class SlideItemFactoryImpl implements SlideItemFactory{
	public Displayable mkTextItem(int level, String text){
		TextItemDrawer textItemDrawer = new TextItemDrawerImpl();
		Displayable textItem = new TextItem(level, text, textItemDrawer);
		return textItem;
	}
	
	public Displayable mkBitmapItem(int level, String text){
		BitmapItemDrawer bitmapItemDrawer = new BitmapItemDrawerImpl();
		Displayable textItem = new BitmapItem(level, text, bitmapItemDrawer);
		return textItem;
	}
}
