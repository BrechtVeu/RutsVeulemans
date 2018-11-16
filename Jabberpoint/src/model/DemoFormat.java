/**
 * 
 */
package model;

import java.io.IOException;

import factory.DisplayableBuilder;
import factory.DisplayableBuilderImpl;
import view.drawer.BitmapItemDrawerImpl;
import view.drawer.SlideDrawerImpl;
import view.drawer.TextItemDrawerImpl;

/**
 * @author Dominique
 *
 */
public class DemoFormat implements Format {
	
	DisplayableBuilder builder;

	/**
	 * 
	 */
	public DemoFormat() {
		 builder = new DisplayableBuilderImpl();
	}

	/* (non-Javadoc)
	 * @see model.Format#loadFile(model.Presentation, java.lang.String)
	 */
	@Override
	public void loadFile(Displayable presentation, String unusedFilename) throws IOException {
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

	/* (non-Javadoc)
	 * @see model.Format#saveFile(model.Presentation)
	 */
	@Override
	public void saveFile(Displayable p, String unusedFilename) throws IOException {
		throw new IllegalStateException("Save As->Demo! aangeroepen");
	}

}
