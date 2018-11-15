/**
 * 
 */
package controller.command;

import event.CommandEventManager;
import event.NextSlideEvent;
import event.SlideEvent;
import model.Displayable;

/**
 * @author Dominique
 *
 */
public class NextSlideCommand extends SlideEvent implements Command {
	private CommandEventManager<SlideEvent> commandEventManager;
	private SlideEvent eventObject;
	
	/**
	 * 
	 */
	public NextSlideCommand(Displayable presentation) {
		super(presentation);
		this.commandEventManager = new CommandEventManager<SlideEvent>();
		this.commandEventManager.addListener(presentation);
		//this.eventObject = new NextSlideEvent(presentation);
		this.eventObject = this;
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
