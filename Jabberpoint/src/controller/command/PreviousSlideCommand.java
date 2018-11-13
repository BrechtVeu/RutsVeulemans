/**
 * 
 */
package controller.command;

import model.Presentation;

/**
 * @author Dominique
 *
 */
public class PreviousSlideCommand implements Command {

	private Presentation presentation;
	
	/**
	 * 
	 */
	public PreviousSlideCommand(Presentation presentation) {
		this.presentation = presentation;
	}

	/* (non-Javadoc)
	 * @see controller.command.Command#execute()
	 */
	@Override
	public void execute() {
		this.presentation.prevSlide();
	}

}
