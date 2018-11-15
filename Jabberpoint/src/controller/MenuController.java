package controller;
import java.awt.MenuBar;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import controller.command.Command;
import factory.CommandFactory;
import factory.CommandFactoryImpl;
import jabberpoint.Values;
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

	public MenuController(Frame slideViewerFrame, Presentation presentation) {
		CommandFactory commandFactory = new CommandFactoryImpl(slideViewerFrame,presentation);
		
		Menu fileMenu = new Menu(Values.FILE);
		fileMenu.add(mkMenuItem(Values.OPEN, commandFactory.makeOpenPresentationCommand()));
		fileMenu.add(mkMenuItem(Values.NEW, commandFactory.makeNewPresentationCommand()));
		fileMenu.add(mkMenuItem(Values.SAVE, commandFactory.makeSavePresentationCommand()));
		fileMenu.addSeparator();
		fileMenu.add(mkMenuItem(Values.EXIT, commandFactory.makeExitCommand()));
		add(fileMenu);
		
		Menu viewMenu = new Menu(Values.VIEW);
		viewMenu.add(mkMenuItem(Values.NEXT, commandFactory.makeNextSlideCommand()));
		viewMenu.add(mkMenuItem(Values.PREV, commandFactory.makePreviousSlideCommand()));
		viewMenu.add(mkMenuItem(Values.GOTO, commandFactory.makeGotoSlideCommand()));
		add(viewMenu);
		
		Menu themeMenu = new Menu(Values.THEME);
		
		add(themeMenu);
		
		Menu helpMenu = new Menu(Values.HELP);
		helpMenu.add(mkMenuItem(Values.ABOUT, commandFactory.makeAboutCommand()));
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
