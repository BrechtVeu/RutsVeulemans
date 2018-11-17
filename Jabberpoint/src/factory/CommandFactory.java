/**
 *
 */
package factory;

import controller.command.Command;

/**
 * @author Dominique Ruts, Brecht Veulemans
 *
 */
public interface CommandFactory {
	/**
	 * 
	 * 
	 * @return EmptyCommand
	 */
	Command makeEmptyCommand();

	/**
	 * @return OpenPresentationCommand
	 */
	Command makeOpenPresentationCommand();

	/**
	 * @return NewPresentationCommand
	 */
	Command makeNewPresentationCommand();

	/**
	 * @return SavePresentationCommand
	 */
	Command makeSavePresentationCommand();

	/**
	 * @return ExitCommand
	 */
	Command makeExitCommand();

	/**
	 * @return 
	 */
	Command makeNextSlideCommand();

	/**
	 * @return
	 */
	Command makePreviousSlideCommand();

	/**
	 * @return
	 */
	Command makeGotoSlideCommand();

	/**
	 * @return
	 */
	Command makeAboutCommand();

	/**
	 * @param Theme
	 * @return
	 */
	Command makeChangeThemeCommand(String Theme);
}
