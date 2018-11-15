package model;

import java.io.IOException;

import factory.DisplayableBuilder;
import factory.DisplayableBuilderImpl;
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
	
	DisplayableBuilder builder = new DisplayableBuilderImpl();
	
	public void loadFile(Displayable presentation, String unusedFilename) {
		presentation.setTitle("Demo Presentation");
		builder.setPresentation(presentation)
				.addSlide("JabberPoint")
				.addTextItem(1, "Het Java Presentatie Tool")
				.addTextItem(2, "Copyright (c) 1996-2000: Ian Darwin")
				.addTextItem(2, "Copyright (c) 2000-now:")
				.addTextItem(2, "Gert Florijn en Sylvia Stuurman")				
				.addTextItem(4, "JabberPoint aanroepen zonder bestandsnaam")
				.addTextItem(4, "laat deze presentatie zien")
				.addTextItem(1, "Navigeren:")
				.addTextItem(3, "Volgende slide: PgDn of Enter")
				.addTextItem(3, "Vorige slide: PgUp of up-arrow")
				.addTextItem(3, "Stoppen: q or Q")
				.addSlide("Demonstratie van levels en stijlen")
				.addTextItem(1, "Level 1")
				.addTextItem(2, "Level 2")
				.addTextItem(1, "Nogmaals level 1")
				.addTextItem(1, "Level 1 heeft stijl nummer 1")				
				.addTextItem(2, "Level 2 heeft stijl nummer 2")
				.addTextItem(3, "Zo ziet level 3 er uit")
				.addTextItem(4, "En dit is level 4")
				.addSlide("De derde slide")
				.addTextItem(1, "Om een nieuwe presentatie te openen,")
				.addTextItem(2, "gebruik File->Open uit het menu.")
				.addTextItem(1, " ")
				.addTextItem(1, "Dit is het einde van de presentatie.")
				.addBitmapItem(1, "JabberPoint.jpg")				
				;
		
		builder.build();
	}

	public void saveFile(Displayable presentation, String unusedFilename) {
		throw new IllegalStateException("Save As->Demo! aangeroepen");
	}
}
