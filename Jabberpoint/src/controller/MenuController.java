package controller;
import java.awt.MenuBar;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import controller.command.Command;
import controller.command.CommandFactory;
import controller.command.CommandFactoryImpl;
import model.Displayable;
import model.Presentation;

/** <p>De controller voor het menu</p>
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 */
public class MenuController extends MenuBar {

	private static final long serialVersionUID = 227L;
	
	protected static final String ABOUT = "About";
	protected static final String FILE = "File";
	protected static final String EXIT = "Exit";
	protected static final String GOTO = "Go to";
	protected static final String HELP = "Help";
	protected static final String NEW = "New";
	protected static final String NEXT = "Next";
	protected static final String OPEN = "Open";
	protected static final String PAGENR = "Page number?";
	protected static final String PREV = "Prev";
	protected static final String SAVE = "Save";
	protected static final String THEME = "Theme";
	protected static final String VIEW = "View";
	
	protected static final String TESTFILE = "test.xml";
	protected static final String SAVEFILE = "dump.xml";
	
	protected static final String IOEX = "IO Exception: ";
	protected static final String LOADERR = "Load Error";
	protected static final String SAVEERR = "Save Error";

	public MenuController(Frame slideViewerFrame, Displayable presentation) {
		CommandFactory commandFactory = new CommandFactoryImpl(slideViewerFrame,presentation);
		
		Menu fileMenu = new Menu(FILE);
		fileMenu.add(mkMenuItem(OPEN, commandFactory.makeOpenPresentationCommand()));
		fileMenu.add(mkMenuItem(NEW, commandFactory.makeNewPresentationCommand()));
		fileMenu.add(mkMenuItem(SAVE, commandFactory.makeSavePresentationCommand()));
		fileMenu.addSeparator();
		fileMenu.add(mkMenuItem(EXIT, commandFactory.makeExitCommand()));
		add(fileMenu);
		
		Menu viewMenu = new Menu(VIEW);
		viewMenu.add(mkMenuItem(NEXT, commandFactory.makeNextSlideCommand()));
		viewMenu.add(mkMenuItem(PREV, commandFactory.makePreviousSlideCommand()));
		viewMenu.add(mkMenuItem(GOTO, commandFactory.makeGotoSlideCommand()));
		add(viewMenu);
		
		Menu themeMenu = new Menu(THEME);
		
		add(themeMenu);
		
		Menu helpMenu = new Menu(HELP);
		helpMenu.add(mkMenuItem(ABOUT, commandFactory.makeAboutCommand()));
		setHelpMenu(helpMenu);		// nodig for portability (Motif, etc.).
	}

	// een menu-item aanmaken
	public MenuItem mkMenuItem(String name, final Command command) {
		MenuItem item = new MenuItem(name, new MenuShortcut(name.charAt(0)));
		item.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent actionEvent) {						
						command.execute();
					}
				});
				
		return item;
	}
}
