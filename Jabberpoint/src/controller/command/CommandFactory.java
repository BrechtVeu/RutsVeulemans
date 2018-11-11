/**
 * 
 */
package controller.command;

/**
 * @author Dominique Ruts, Brecht Veulemans
 *
 */
public interface CommandFactory {
	Command makeOpenPresentationCommand();
	Command makeNewPresentationCommand();
	Command makeSavePresentationCommand();
	Command makeExitCommand();
}
