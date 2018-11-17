/**
 *
 */
package controller.command;

import event.ChangeSlideThemeEvent;
import event.CommandEventManager;
import event.SlideEvent;
import model.Displayable;

/**
 * @author Dominique
 *
 */
public class ChangeThemeCommand implements Command {
	private CommandEventManager<SlideEvent> commandEventManager;
	private SlideEvent eventObject;
	private String theme;

	/**
	 *
	 */
	public ChangeThemeCommand(Displayable presentation, String theme) {
		this.commandEventManager = new CommandEventManager<SlideEvent>();
		this.commandEventManager.addListener(presentation);
		this.eventObject = new ChangeSlideThemeEvent(presentation);
		this.theme = theme;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see controller.command.Command#execute()
	 */
	@Override
	public void execute() {
		System.out.println("ChangeThemeCommand - execute");

		this.eventObject.setTheme(this.theme);
		this.commandEventManager.fire(eventObject);
	}

}
