/**
 *
 */
package controller.command;

/**
 * Empty command that can be used in case no immediate action is needed by a keystroke or menu action.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class EmptyCommand implements Command {

	/*
	 * (non-Javadoc)
	 *
	 * @see controller.command.Command#execute()
	 */
	@Override
	public void execute() {
		// No Action will happen
	}

}
