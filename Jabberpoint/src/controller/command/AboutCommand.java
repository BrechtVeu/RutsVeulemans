/**
 * 
 */
package controller.command;

import java.awt.Frame;

import view.AboutBox;

/**
 * @author Dominique
 *
 */
public class AboutCommand implements Command {

	private Frame slideViewerFrame;
	
	/**
	 * 
	 */
	public AboutCommand(Frame slideViewerFrame) {
		this.slideViewerFrame = slideViewerFrame;
	}

	/* (non-Javadoc)
	 * @see controller.command.Command#execute()
	 */
	@Override
	public void execute() {
		AboutBox.show(this.slideViewerFrame);
	}

}
