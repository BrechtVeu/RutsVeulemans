/**
 * 
 */
package model;

import java.io.IOException;

import view.drawer.BitmapItemDrawerImpl;
import view.drawer.SlideDrawerImpl;
import view.drawer.TextItemDrawerImpl;

/**
 * @author Dominique
 *
 */
public class DemoFormat implements Format {

	/**
	 * 
	 */
	public DemoFormat() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see model.Format#loadFile(model.Presentation, java.lang.String)
	 */
	@Override
	public void loadFile(Displayable p, String unusedFilename) throws IOException {
		p.setTitle("Demo Presentation");
		Displayable slide;
		slide = new Slide(new SlideDrawerImpl());
		slide.setTitle("JabberPoint");
		slide.append(new TextItem(1, "Het Java Presentatie Tool", new TextItemDrawerImpl()));
		slide.append(new TextItem(2, "Copyright (c) 1996-2000: Ian Darwin", new TextItemDrawerImpl()));
		slide.append(new TextItem(2, "Copyright (c) 2000-now:", new TextItemDrawerImpl()));
		slide.append(new TextItem(2, "Gert Florijn en Sylvia Stuurman", new TextItemDrawerImpl()));
		slide.append(new TextItem(4, "JabberPoint aanroepen zonder bestandsnaam", new TextItemDrawerImpl()));
		slide.append(new TextItem(4, "laat deze presentatie zien", new TextItemDrawerImpl()));
		slide.append(new TextItem(1, "Navigeren:", new TextItemDrawerImpl()));
		slide.append(new TextItem(3, "Volgende slide: PgDn of Enter", new TextItemDrawerImpl()));
		slide.append(new TextItem(3, "Vorige slide: PgUp of up-arrow", new TextItemDrawerImpl()));
		slide.append(new TextItem(3, "Stoppen: q or Q", new TextItemDrawerImpl()));
		p.append(slide);

		slide = new Slide(new SlideDrawerImpl());
		slide.setTitle("Demonstratie van levels en stijlen");
		slide.append(new TextItem(1, "Level 1", new TextItemDrawerImpl()));
		slide.append(new TextItem(2, "Level 2", new TextItemDrawerImpl()));
		slide.append(new TextItem(1, "Nogmaals level 1", new TextItemDrawerImpl()));
		slide.append(new TextItem(1, "Level 1 heeft stijl nummer 1", new TextItemDrawerImpl()));
		slide.append(new TextItem(2, "Level 2 heeft stijl nummer 2", new TextItemDrawerImpl()));
		slide.append(new TextItem(3, "Zo ziet level 3 er uit", new TextItemDrawerImpl()));
		slide.append(new TextItem(4, "En dit is level 4", new TextItemDrawerImpl()));
		p.append(slide);

		slide = new Slide(new SlideDrawerImpl());
		slide.setTitle("De derde slide");
		slide.append(new TextItem(1, "Om een nieuwe presentatie te openen,", new TextItemDrawerImpl()));
		slide.append(new TextItem(2, "gebruik File->Open uit het menu.", new TextItemDrawerImpl()));
		slide.append(new TextItem(1, " ", new TextItemDrawerImpl()));
		slide.append(new TextItem(1, "Dit is het einde van de presentatie.", new TextItemDrawerImpl()));
		slide.append(new BitmapItem(1, "JabberPoint.jpg", new BitmapItemDrawerImpl()));
		p.append(slide);
	}

	/* (non-Javadoc)
	 * @see model.Format#saveFile(model.Presentation)
	 */
	@Override
	public void saveFile(Displayable p, String unusedFilename) throws IOException {
		throw new IllegalStateException("Save As->Demo! aangeroepen");
	}

}
