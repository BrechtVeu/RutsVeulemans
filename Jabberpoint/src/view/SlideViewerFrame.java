package view;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controller.KeyController;
import controller.MenuController;
import jabberpoint.Values;
import model.Displayable;
import model.Reader;
import model.ReaderImpl;

/**
 * <p>Het applicatiewindow voor een slideviewcomponent</p>
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
*/

public class SlideViewerFrame extends JFrame {
	private static final long serialVersionUID = 3227L;
		
	public final static int WIDTH = 1200;
	public final static int HEIGHT = 800;
		
	public SlideViewerFrame(String title, Displayable presentation) {
		super(title);
		SlideViewerComponent slideViewerComponent = new SlideViewerComponent(presentation, this);
		presentation.attach(slideViewerComponent);
		setupWindow(slideViewerComponent, presentation);
	}

	// De GUI opzetten
	public void setupWindow(SlideViewerComponent 
			slideViewerComponent, Displayable presentation) {
		setTitle(Values.JABTITLE);
		addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
		
		getContentPane().add(slideViewerComponent);
		addKeyListener(new KeyController(this, presentation)); // een controller toevoegen
		setMenuBar(new MenuController(this, presentation));	// nog een controller toevoegen
		setSize(new Dimension(WIDTH, HEIGHT)); // Dezelfde maten als Slide hanteert.
		setVisible(true);
	}
}
