/**
 *
 */
package controller.command;

import java.awt.Frame;

import view.AboutBox;

/**
 * About command triggered by the user to open the About box.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class AboutCommand implements Command {

	private Frame slideViewerFrame;

	/**
	 * Constructor for objects of class AboutCommand
	 * 
	 * @param slideViewerFrame
	 */
	public AboutCommand(Frame slideViewerFrame) {
		this.slideViewerFrame = slideViewerFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see controller.command.Command#execute()
	 */
	@Override
	public void execute() {
		AboutBox.show(this.slideViewerFrame);
	}

}
