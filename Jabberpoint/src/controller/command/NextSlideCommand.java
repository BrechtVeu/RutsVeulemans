/**
 *
 */
package controller.command;

import event.CommandEventManager;
import event.NextSlideEvent;
import event.SlideEvent;
import model.Displayable;

/**
 * Next Slide command triggered by the user to navigate to the next slide in the presentation.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class NextSlideCommand implements Command {
	private CommandEventManager<SlideEvent> commandEventManager;
	private SlideEvent eventObject;

	/**
	 * Constructor for objects of class NextSlideCommand
	 * 
	 * @param presentation
	 */
	public NextSlideCommand(Displayable presentation) {
		this.commandEventManager = new CommandEventManager<SlideEvent>();
		this.commandEventManager.addListener(presentation);
		this.eventObject = new NextSlideEvent(presentation);
	}

	/* (non-Javadoc)
	 * @see controller.command.Command#execute()
	 */
	@Override
	public void execute() {
		System.out.println("NextSlideCommand - execute");
		this.commandEventManager.fire(eventObject);
	}
}
