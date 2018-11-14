/**
 * 
 */
package controller.command;

import model.Displayable;

/**
 * @author Dominique
 *
 */
public class NextSlideCommand implements Command {

	private Displayable presentation;
	
	/**
	 * 
	 */
	public NextSlideCommand(Displayable presentation) {
		this.presentation = presentation;
	}

	/* (non-Javadoc)
	 * @see controller.command.Command#execute()
	 */
	@Override
	public void execute() {
		this.presentation.nextSlide();
	}

}
