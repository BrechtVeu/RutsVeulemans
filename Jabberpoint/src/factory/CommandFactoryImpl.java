/**
 *
 */
package factory;

import java.awt.Frame;

import controller.command.AboutCommand;
import controller.command.ChangeThemeCommand;
import controller.command.Command;
import controller.command.EmptyCommand;
import controller.command.ExitCommand;
import controller.command.GotoSlideCommand;
import controller.command.NewPresentationCommand;
import controller.command.NextSlideCommand;
import controller.command.OpenPresentationCommand;
import controller.command.PreviousSlideCommand;
import controller.command.SavePresentationCommand;
import model.Displayable;

/**
 * Concrete implementation of CommandFactory.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 * 
 */
public class CommandFactoryImpl implements CommandFactory {

	private Frame slideViewerFrame;
	private Displayable presentation;
	
	/**
	 * Constructor for objects of class CommandFactoryImpl
	 * 
	 * @param slideViewerFrame
	 * @param presentation
	 */
	public CommandFactoryImpl(Frame slideViewerFrame, Displayable presentation) {
		this.slideViewerFrame = slideViewerFrame;
		this.presentation = presentation;
	}

	@Override
	public Command makeEmptyCommand() {
		return new EmptyCommand();
	}
	
	/* (non-Javadoc)
	 * @see factory.CommandFactory#makeExitCommand()
	 */
	@Override
	public Command makeExitCommand() {
		return new ExitCommand();
	}

	/* (non-Javadoc)
	 * @see factory.CommandFactory#makeOpenPresentationCommand()
	 */
	@Override
	public Command makeOpenPresentationCommand() {
		return new OpenPresentationCommand(this.slideViewerFrame, this.presentation);
	}

	/* (non-Javadoc)
	 * @see factory.CommandFactory#makeNewPresentationCommand()
	 */
	@Override
	public Command makeNewPresentationCommand() {
		return new NewPresentationCommand(this.presentation);
	}

	/* (non-Javadoc)
	 * @see factory.CommandFactory#makeSavePresentationCommand()
	 */
	@Override
	public Command makeSavePresentationCommand() {
		return new SavePresentationCommand(this.slideViewerFrame, this.presentation);
	}

	/* (non-Javadoc)
	 * @see factory.CommandFactory#makeNextSlideCommand()
	 */
	@Override
	public Command makeNextSlideCommand() {
		return new NextSlideCommand(this.presentation);
	}

	/* (non-Javadoc)
	 * @see factory.CommandFactory#makePreviousSlideCommand()
	 */
	@Override
	public Command makePreviousSlideCommand() {
		return new PreviousSlideCommand(this.presentation);
	}

	/* (non-Javadoc)
	 * @see factory.CommandFactory#makeGotoSlideCommand()
	 */
	@Override
	public Command makeGotoSlideCommand() {
		return new GotoSlideCommand(this.presentation);
	}

	/* (non-Javadoc)
	 * @see factory.CommandFactory#makeAboutCommand()
	 */
	@Override
	public Command makeAboutCommand() {
		return new AboutCommand(this.slideViewerFrame);
	}

	/* (non-Javadoc)
	 * @see factory.CommandFactory#makeChangeThemeCommand(java.lang.String)
	 */
	@Override
	public Command makeChangeThemeCommand(String theme) {
		return new ChangeThemeCommand(this.presentation, theme);
	}

}
