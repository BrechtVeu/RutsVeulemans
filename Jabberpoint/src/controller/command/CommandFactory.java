/**
 * 
 */
package controller.command;

/**
 * @author Dominique Ruts, Brecht Veulemans
 *
 */
public interface CommandFactory {
	Command makeEmptyCommand();
	Command makeOpenPresentationCommand();
	Command makeNewPresentationCommand();
	Command makeSavePresentationCommand();
	Command makeExitCommand();
	Command makeNextSlideCommand();
	Command makePreviousSlideCommand();
	Command makeGotoSlideCommand();
	Command makeAboutCommand();
}
