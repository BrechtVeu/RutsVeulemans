/**
 * 
 */
package controller.command;

import java.awt.Frame;

import model.Presentation;

/**
 * @author Dominique
 *
 */
public class CommandFactoryImpl implements CommandFactory {

	private Frame slideViewerFrame;
	private Presentation presentation;
	
	public CommandFactoryImpl(Frame slideViewerFrame, Presentation presentation) {
		this.slideViewerFrame = slideViewerFrame;
		this.presentation = presentation;
	}
	
	@Override
	public Command makeEmptyCommand() {
		return new EmptyCommand();
	}
	
	/* (non-Javadoc)
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
		return new NewPresentationCommand(this.slideViewerFrame, this.presentation);
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

}
