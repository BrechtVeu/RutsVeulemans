/**
 * 
 */
package controller.command;

import javax.swing.JOptionPane;

import event.CommandEventManager;
import event.GotoSlideEvent;
import event.SlideEvent;
import model.Presentation;

/**
 * @author Dominique
 *
 */
public class GotoSlideCommand implements Command {
	private CommandEventManager<SlideEvent> commandEventManager;
	private SlideEvent eventObject;
	
	protected static final String PAGENR = "Page number?";
		
	/**
	 * 
	 */
	public GotoSlideCommand(Presentation presentation) {
		this.commandEventManager = new CommandEventManager<SlideEvent>();
		this.commandEventManager.addListener(presentation);
		this.eventObject = new GotoSlideEvent(presentation);
	}

	/* (non-Javadoc)
	 * @see controller.command.Command#execute()
	 */
	@Override
	public void execute() {
		String pageNumberStr = JOptionPane.showInputDialog((Object)PAGENR);
		int pageNumber = Integer.parseInt(pageNumberStr);
		
		this.eventObject.setSlideNumber(pageNumber);
		this.commandEventManager.fire(eventObject);
	}

}
