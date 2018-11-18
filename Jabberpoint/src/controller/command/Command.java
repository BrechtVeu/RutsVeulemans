package controller.command;

/**
 * Gives interface for concrete implementations of a Command.
 * Responsible for defining a trigger for menu commands.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public interface Command {
	/**
	 * Execute the command
	 */
	public void execute();
}
