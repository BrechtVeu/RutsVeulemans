/**
 *
 */
package controller.command;

import javax.swing.JOptionPane;

import event.CommandEventManager;
import event.GotoSlideEvent;
import event.SlideEvent;
import jabberpoint.Values;
import model.Displayable;

/**
 * @author Dominique
 *
 */
public class GotoSlideCommand implements Command {
	private CommandEventManager<SlideEvent> commandEventManager;
	private SlideEvent eventObject;

	/**
	 *
	 */
	public GotoSlideCommand(Displayable presentation) {
		this.commandEventManager = new CommandEventManager<SlideEvent>();
		this.commandEventManager.addListener(presentation);
		this.eventObject = new GotoSlideEvent(presentation);
	}

	/*
	 * (non-Javadoc)
	 *
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
