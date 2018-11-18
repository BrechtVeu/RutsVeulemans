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
	public Command makeEmptyCommand();
	
	/**
	 * Create a new OpenPresentation Command
	 *
	 * @return OpenPresentationCommand
	 */
	public Command makeOpenPresentationCommand();
	
	/**
	 * Create a new NewPresentation Command
	 *
	 * @return NewPresentationCommand
	 */
	public Command makeNewPresentationCommand();

	/**
	 * Create a new SavePresentation Command
	 * 
	 * @return SavePresentationCommand
	 */
	public Command makeSavePresentationCommand();

	/**
	 * Create a new Exit Command
	 * 
	 * @return ExitCommand
	 */
	public Command makeExitCommand();

	/**
	 * Create a new NextSlide Command
	 * 
	 * @return NextSlideCommand
	 */
	public Command makeNextSlideCommand();

	/**
	 * Create a new PreviousSlide Command
	 * 
	 * @return PreviousSlideCommand
	 */
	public Command makePreviousSlideCommand();

	/**
	 * Create a new GotoSlide Command
	 * 
	 * @return GotoSlideCommand
	 */
	public Command makeGotoSlideCommand();

	/**
	 * Create a new About Command
	 * 
	 * @return AboutCommand
	 */
	public Command makeAboutCommand();
	
	/**
	 * Create a new ChangeTheme Command
	 * 
	 * @param theme
	 * @return ChangeThemeCommand
	 */
	public Command makeChangeThemeCommand(String theme);
}
