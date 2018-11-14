/**
 * 
 */
package controller.command;

import java.awt.Frame;

import model.Displayable;

/**
 * @author Dominique
 *
 */
public class NewPresentationCommand implements Command {

	private Frame slideViewerFrame;
	private Displayable presentation;

	public NewPresentationCommand(Frame slideViewerFrame, Displayable presentation) {
		this.slideViewerFrame = slideViewerFrame;
		this.presentation = presentation;
	}
	
	@Override
	public void execute() {
		this.presentation.clear();
		this.slideViewerFrame.repaint();
	}
}
