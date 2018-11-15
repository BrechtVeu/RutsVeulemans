/**
 * 
 */
package controller.command;

import event.CommandEventManager;
import event.NextSlideEvent;
import event.PreviousSlideEvent;
import event.SlideEvent;
import model.Presentation;

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
	public PreviousSlideCommand(Presentation presentation) {		
		this.commandEventManager = new CommandEventManager<SlideEvent>();
		this.commandEventManager.addListener(presentation);
		this.eventObject = new PreviousSlideEvent(presentation);
	}

	/* (non-Javadoc)
	 * @see controller.command.Command#execute()
	 */
	@Override
	public void execute() {
		//this.presentation.prevSlide();
		System.out.println("PrevSlideCommand - execute");
		this.commandEventManager.fire(eventObject);
	}

}
