package controller.command;

import java.awt.Frame;
import java.io.IOException;

import javax.swing.JOptionPane;

import event.CommandEventManager;
import event.SlideEvent;
import jabberpoint.Values;
import model.Displayable;
import model.Reader;
import model.ReaderImpl;

/**
 * Open Presentation command triggered by the user to open an existing presentation.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class OpenPresentationCommand extends Command {
	private Frame slideViewerFrame;
	private Displayable presentation;

	private CommandEventManager<SlideEvent> frameCommandEventManager;
	private SlideEvent eventObject;

	/**
	 * Constructor for objects of class OpenPresentationCommand
	 * 
	 * @param slideViewerFrame
	 * @param presentation
	 */
	public OpenPresentationCommand(Frame slideViewerFrame, Displayable presentation) {
		this.frameCommandEventManager = new CommandEventManager<SlideEvent>();
		this.frameCommandEventManager.addListener(presentation);
		this.eventObject = eventFactory.makeOpenPresentationEvent(presentation);
		this.slideViewerFrame = slideViewerFrame;
		this.presentation = presentation;
	}

	/* (non-Javadoc)
	 * @see controller.command.Command#execute()
	 */
	@Override
	public void execute() {
		this.presentation.clear();
		Reader reader = new ReaderImpl();
		try {
			reader.loadFile(this.presentation, Values.TESTFILE);
			this.frameCommandEventManager.fire(eventObject);
		} catch (IOException exc) {
			JOptionPane.showMessageDialog(this.slideViewerFrame, Values.IOEX + exc, Values.LOADERR,
					JOptionPane.ERROR_MESSAGE);
		}
	}

}
