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
 * @author Dominique
 *
 */
public class CommandFactoryImpl implements CommandFactory {

	private Frame slideViewerFrame;
	private Displayable presentation;

	public CommandFactoryImpl(Frame slideViewerFrame, Displayable presentation) {
		this.slideViewerFrame = slideViewerFrame;
		this.presentation = presentation;
	}

	@Override
	public Command makeEmptyCommand() {
		return new EmptyCommand();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see controller.command.CommandFactory#makeExitCommand()
	 */
	@Override
	public Command makeExitCommand() {
		return new ExitCommand();
	}

	@Override
	public Command makeOpenPresentationCommand() {
		return new OpenPresentationCommand(this.slideViewerFrame, this.presentation);
	}

	@Override
	public Command makeNewPresentationCommand() {
		return new NewPresentationCommand(this.presentation);
	}

	@Override
	public Command makeSavePresentationCommand() {
		return new SavePresentationCommand(this.slideViewerFrame, this.presentation);
	}

	@Override
	public Command makeNextSlideCommand() {
		return new NextSlideCommand(this.presentation);
	}

	@Override
	public Command makePreviousSlideCommand() {
		return new PreviousSlideCommand(this.presentation);
	}

	@Override
	public Command makeGotoSlideCommand() {
		return new GotoSlideCommand(this.presentation);
	}

	@Override
	public Command makeAboutCommand() {
		return new AboutCommand(this.slideViewerFrame);
	}

	@Override
	public Command makeChangeThemeCommand(String theme) {
		return new ChangeThemeCommand(this.presentation, theme);
	}

}
