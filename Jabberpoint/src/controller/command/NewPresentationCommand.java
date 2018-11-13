/**
 * 
 */
package controller.command;

import java.awt.Frame;

import model.Presentation;

/**
 * @author Dominique
 *
 */
public class NewPresentationCommand implements Command {

	private Frame slideViewerFrame;
	private Presentation presentation;

	public NewPresentationCommand(Frame slideViewerFrame, Presentation presentation) {
		this.slideViewerFrame = slideViewerFrame;
		this.presentation = presentation;
	}
	
	@Override
	public void execute() {
		this.presentation.clear();
		this.slideViewerFrame.repaint();
	}
}
