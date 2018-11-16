/**
 * 
 */
package controller.command;

import event.CommandEventManager;
import event.RepaintEvent;
import event.SlideEvent;
import model.Displayable;

/**
 * @author Dominique
 *
 */
public class NewPresentationCommand implements Command {

	private CommandEventManager<SlideEvent> frameCommandEventManager;
	private SlideEvent eventObject;
	
	public NewPresentationCommand(Displayable presentation) {
		this.frameCommandEventManager = new CommandEventManager<SlideEvent>();
		this.frameCommandEventManager.addListener(presentation);
		this.eventObject = new RepaintEvent(presentation);
	}
	
	@Override
	public void execute() {
		frameCommandEventManager.fire(eventObject);
	}
}
