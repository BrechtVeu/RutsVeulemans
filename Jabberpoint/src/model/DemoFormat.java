/**
 * 
 */
package model;

import java.io.IOException;

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
	public void loadFile(Presentation p, String unusedFilename) throws IOException {
		p.setTitle("Demo Presentation");
		Slide slide;
		slide = new Slide();
		slide.setTitle("JabberPoint");
		slide.append(1, "Het Java Presentatie Tool");
		slide.append(2, "Copyright (c) 1996-2000: Ian Darwin");
		slide.append(2, "Copyright (c) 2000-now:");
		slide.append(2, "Gert Florijn en Sylvia Stuurman");
		slide.append(4, "JabberPoint aanroepen zonder bestandsnaam");
		slide.append(4, "laat deze presentatie zien");
		slide.append(1, "Navigeren:");
		slide.append(3, "Volgende slide: PgDn of Enter");
		slide.append(3, "Vorige slide: PgUp of up-arrow");
		slide.append(3, "Stoppen: q or Q");
		p.append(slide);

		slide = new Slide();
		slide.setTitle("Demonstratie van levels en stijlen");
		slide.append(1, "Level 1");
		slide.append(2, "Level 2");
		slide.append(1, "Nogmaals level 1");
		slide.append(1, "Level 1 heeft stijl nummer 1");
		slide.append(2, "Level 2 heeft stijl nummer 2");
		slide.append(3, "Zo ziet level 3 er uit");
		slide.append(4, "En dit is level 4");
		p.append(slide);

		slide = new Slide();
		slide.setTitle("De derde slide");
		slide.append(1, "Om een nieuwe presentatie te openen,");
		slide.append(2, "gebruik File->Open uit het menu.");
		slide.append(1, " ");
		slide.append(1, "Dit is het einde van de presentatie.");
		slide.append(new BitmapItem(1, "JabberPoint.jpg"));
		p.append(slide);
	}

	/* (non-Javadoc)
	 * @see model.Format#saveFile(model.Presentation)
	 */
	@Override
	public void saveFile(Presentation p, String unusedFilename) throws IOException {
		throw new IllegalStateException("Save As->Demo! aangeroepen");
	}

}
