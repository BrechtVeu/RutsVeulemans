/**
 * 
 */
package controller.command;

/**
 * @author Dominique
 *
 */
public class CommandFactoryImpl implements CommandFactory {

	/* (non-Javadoc)
	 * @see controller.command.CommandFactory#makeExitCommand()
	 */
	@Override
	public Command makeExitCommand() {
		return new ExitCommand();
	}

	@Override
	public Command makeOpenPresentationCommand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Command makeNewPresentationCommand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Command makeSavePresentationCommand() {
		// TODO Auto-generated method stub
		return null;
	}

}
