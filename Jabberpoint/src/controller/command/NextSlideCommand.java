/**
 * 
 */
package controller.command;

import model.Presentation;

/**
 * @author Dominique
 *
 */
public class NextSlideCommand implements Command {

	private Presentation presentation;
	
	/**
	 * 
	 */
	public NextSlideCommand(Presentation presentation) {
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
