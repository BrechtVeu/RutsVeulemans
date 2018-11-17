package factory;

import controller.command.Command;

/**
 * @author Brecht Veulemans, Dominique Ruts
 * 
 * Gives interface for concrete implementations of a CommandFactory.
 * Responsible for creating commands.
 *
 */
public interface CommandFactory {
	
	/**
	 * Create a new empty Command
	 * 
	 * @return EmptyCommand
	 */
	Command makeEmptyCommand();
	
	/**
	 * Create a new OpenPresentation Command
	 *
	 * @return OpenPresentationCommand
	 */
	Command makeOpenPresentationCommand();
	
	/**
	 * Create a new NewPresentation Command
	 *
	 * @return NewPresentationCommand
	 */
	Command makeNewPresentationCommand();

	/**
	 * Create a new SavePresentation Command
	 * 
	 * @return SavePresentationCommand
	 */
	Command makeSavePresentationCommand();

	/**
	 * Create a new Exit Command
	 * 
	 * @return ExitCommand
	 */
	Command makeExitCommand();

	/**
	 * Create a new NextSlide Command
	 * 
	 * @return NextSlideCommand
	 */
	Command makeNextSlideCommand();

	/**
	 * Create a new PreviousSlide Command
	 * 
	 * @return PreviousSlideCommand
	 */
	Command makePreviousSlideCommand();

	/**
	 * Create a new GotoSlide Command
	 * 
	 * @return GotoSlideCommand
	 */
	Command makeGotoSlideCommand();

	/**
	 * Create a new About Command
	 * 
	 * @return AboutCommand
	 */
	Command makeAboutCommand();
	
	/**
	 * Create a new ChangeTheme Command
	 * 
	 * @param theme
	 * @return ChangeThemeCommand
	 */
	Command makeChangeThemeCommand(String theme);
}
