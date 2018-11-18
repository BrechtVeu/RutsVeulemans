/**
 *
 */
package controller.command;

import javax.swing.JOptionPane;

import event.CommandEventManager;
import event.SlideEvent;
import jabberpoint.Values;
import model.Displayable;

/**
 * Goto slide command triggered by the user to switch the presentation to another slide.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class GotoSlideCommand extends Command {

	private CommandEventManager<SlideEvent> commandEventManager;
	private SlideEvent eventObject;

	/**
	 * Constructor for objects of class GotoSlideCommand
	 * 
	 * @param presentation
	 */
	public GotoSlideCommand(Displayable presentation) {
		this.commandEventManager = new CommandEventManager<SlideEvent>();
		this.commandEventManager.addListener(presentation);
		this.eventObject = eventFactory.makeGotoSlideEvent(presentation);
	}

	/* (non-Javadoc)
	 * @see controller.command.Command#execute()
	 */
	@Override
	public void execute() {
		String pageNumberStr = JOptionPane.showInputDialog(Values.PAGENR);
		int pageNumber = Integer.parseInt(pageNumberStr);

		this.eventObject.setSlideNumber(pageNumber);
		this.commandEventManager.fire(eventObject);
	}

}
