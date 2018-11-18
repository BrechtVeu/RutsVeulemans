/**
 *
 */
package controller.command;

import event.CommandEventManager;
import event.PreviousSlideEvent;
import event.SlideEvent;
import model.Displayable;


/**
 * Previous Slide Command triggered by the user to navigate to the previous slide in the presentation.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class PreviousSlideCommand implements Command {

	private CommandEventManager<SlideEvent> commandEventManager;
	private SlideEvent eventObject;

	/**
	 * Constructor for objects of class PreviousSlideCommand
	 * 
	 * @param presentation
	 */
	public PreviousSlideCommand(Displayable presentation) {
		this.commandEventManager = new CommandEventManager<SlideEvent>();
		this.commandEventManager.addListener(presentation);
		this.eventObject = new PreviousSlideEvent(presentation);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see controller.command.Command#execute()
	 */
	/* (non-Javadoc)
	 * @see controller.command.Command#execute()
	 */
	@Override
	public void execute() {
		this.commandEventManager.fire(eventObject);
	}

}
