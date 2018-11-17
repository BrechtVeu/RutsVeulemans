/**
 *
 */
package controller.command;

import event.CommandEventManager;
import event.PreviousSlideEvent;
import event.SlideEvent;
import model.Displayable;

/**
 * @author Dominique
 *
 */
public class PreviousSlideCommand implements Command {

	private CommandEventManager<SlideEvent> commandEventManager;
	private SlideEvent eventObject;

	/**
	 *
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
	@Override
	public void execute() {
		System.out.println("PrevSlideCommand - execute");
		this.commandEventManager.fire(eventObject);
	}

}
