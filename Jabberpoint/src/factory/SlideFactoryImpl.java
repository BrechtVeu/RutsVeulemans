package factory;

import model.Displayable;
import model.Slide;
import view.drawer.SlideDrawer;
import view.drawer.SlideDrawerImpl;

public class SlideFactoryImpl implements SlideFactory {
	public Displayable makeSlide(String title){
		SlideDrawer slideDrawer = new SlideDrawerImpl();
		Displayable slide = new Slide(slideDrawer);
		slide.setTitle(title);
		return slide;
	}
}
