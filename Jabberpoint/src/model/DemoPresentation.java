package model;

import view.drawer.BitmapItemDrawerImpl;
import view.drawer.SlideDrawerImpl;
import view.drawer.TextItemDrawer;
import view.drawer.TextItemDrawerImpl;

/** Een ingebouwde demo-presentatie
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 */

class DemoPresentation extends Accessor {

	public void loadFile(Displayable presentation, String unusedFilename) {
		presentation.setTitle("Demo Presentation");
		Displayable slide;
		slide = new Slide(new SlideDrawerImpl());
		slide.setTitle("JabberPoint");
		TextItemDrawer textItemDrawer = new TextItemDrawerImpl();
		slide.append(new TextItem(1,"Het Java Presentatie Tool", textItemDrawer));
		slide.append(new TextItem(2, "Copyright (c) 1996-2000: Ian Darwin", textItemDrawer));
		slide.append(new TextItem(2, "Copyright (c) 2000-now:", textItemDrawer));
		slide.append(new TextItem(2, "Gert Florijn en Sylvia Stuurman", textItemDrawer));
		slide.append(new TextItem(4, "JabberPoint aanroepen zonder bestandsnaam", textItemDrawer));
		slide.append(new TextItem(4, "laat deze presentatie zien", textItemDrawer));
		slide.append(new TextItem(1, "Navigeren:", textItemDrawer));
		slide.append(new TextItem(3, "Volgende slide: PgDn of Enter", textItemDrawer));
		slide.append(new TextItem(3, "Vorige slide: PgUp of up-arrow", textItemDrawer));
		slide.append(new TextItem(3, "Stoppen: q or Q", textItemDrawer));
		presentation.append(slide);

		slide = new Slide(new SlideDrawerImpl());
		slide.setTitle("Demonstratie van levels en stijlen");
		slide.append(new TextItem(1, "Level 1", textItemDrawer));
		slide.append(new TextItem(2, "Level 2", textItemDrawer));
		slide.append(new TextItem(1, "Nogmaals level 1", textItemDrawer));
		slide.append(new TextItem(1, "Level 1 heeft stijl nummer 1", textItemDrawer));
		slide.append(new TextItem(2, "Level 2 heeft stijl nummer 2", textItemDrawer));
		slide.append(new TextItem(3, "Zo ziet level 3 er uit", textItemDrawer));
		slide.append(new TextItem(4, "En dit is level 4", textItemDrawer));
		presentation.append(slide);

		slide = new Slide(new SlideDrawerImpl());
		slide.setTitle("De derde slide");
		slide.append(new TextItem(1, "Om een nieuwe presentatie te openen,", textItemDrawer));
		slide.append(new TextItem(2, "gebruik File->Open uit het menu.", textItemDrawer));
		slide.append(new TextItem(1, " ", textItemDrawer));
		slide.append(new TextItem(1, "Dit is het einde van de presentatie.", textItemDrawer));
		slide.append(new BitmapItem(1, "JabberPoint.jpg", new BitmapItemDrawerImpl()));
		presentation.append(slide);
	}

	public void saveFile(Displayable presentation, String unusedFilename) {
		throw new IllegalStateException("Save As->Demo! aangeroepen");
	}
}
