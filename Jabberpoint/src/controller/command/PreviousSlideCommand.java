/**
 * 
 */
package controller.command;

import model.Displayable;

/**
 * @author Dominique
 *
 */
public class PreviousSlideCommand implements Command {

	private Displayable presentation;
	
	/**
	 * 
	 */
	public PreviousSlideCommand(Displayable presentation) {
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
