package controller.command;

/**
 * Exit command triggered by the user to close the application.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class ExitCommand implements Command {

	/* (non-Javadoc)
	 * @see controller.command.Command#execute()
	 */
	@Override
	public void execute() {
		System.exit(0);
	}

}
