/**
 *
 */
package controller.command;

import event.CommandEventManager;
import event.RepaintEvent;
import event.SlideEvent;
import model.Displayable;

/**
 * New Presentation command triggered by the user create an empty presentation.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class NewPresentationCommand implements Command {

	private CommandEventManager<SlideEvent> frameCommandEventManager;
	private SlideEvent eventObject;

	/**
	 * Constructor for objects of class NewPresentationCommand
	 * 
	 * @param presentation
	 */
	public NewPresentationCommand(Displayable presentation) {
		this.frameCommandEventManager = new CommandEventManager<SlideEvent>();
		this.frameCommandEventManager.addListener(presentation);
		this.eventObject = new RepaintEvent(presentation);
	}

	/* (non-Javadoc)
	 * @see controller.command.Command#execute()
	 */
	@Override
	public void execute() {
		frameCommandEventManager.fire(eventObject);
	}
}
