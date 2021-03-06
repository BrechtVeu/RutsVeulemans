package controller;

import java.awt.event.KeyEvent;

import controller.command.Command;
import factory.CommandFactory;
import factory.CommandFactoryImpl;
import model.Displayable;

import java.awt.Frame;
import java.awt.event.KeyAdapter;

/**
 * <p>
 * This is the KeyController (KeyListener) that listens to keystrokes from the
 * keyboard.
 * </p>
 *
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 * @version 1.7 2018/11/17 Brecht Veulemans, Dominique Ruts
 */

public class KeyController extends KeyAdapter {
	/**
	 * 
	 */
	private CommandFactory commandFactory;

	/**
	 * Constructor for KeyController
	 * 
	 * @param slideViewerFrame
	 * @param p
	 */
	public KeyController(Frame slideViewerFrame, Displayable p) {
		this.commandFactory = new CommandFactoryImpl(slideViewerFrame, p);
	}

	/* (non-Javadoc)
	 * @see java.awt.event.KeyAdapter#keyPressed(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyPressed(KeyEvent keyEvent) {
		Command commandToExecute = this.commandFactory.makeEmptyCommand();
		switch (keyEvent.getKeyCode()) {
		case KeyEvent.VK_PAGE_DOWN:
		case KeyEvent.VK_DOWN:
		case KeyEvent.VK_ENTER:
		case '+':
			commandToExecute = this.commandFactory.makeNextSlideCommand();
			break;
		case KeyEvent.VK_PAGE_UP:
		case KeyEvent.VK_UP:
		case '-':
			commandToExecute = this.commandFactory.makePreviousSlideCommand();
			break;
		case 'q':
		case 'Q':
			commandToExecute = this.commandFactory.makeExitCommand();
			break;
		default:
			break;
		}

		commandToExecute.execute();
	}
}
