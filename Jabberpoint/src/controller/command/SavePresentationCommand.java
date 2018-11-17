/**
 *
 */
package controller.command;

import java.awt.Frame;
import java.io.IOException;

import javax.swing.JOptionPane;

import jabberpoint.Values;
import model.Displayable;
import model.Writer;
import model.WriterImpl;

/**
 * Save Presentation command triggered by the user to save the active presentation to the file system.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class SavePresentationCommand implements Command {
	private Frame slideViewerFrame;
	private Displayable presentation;

	/**
	 * Constructor for objects of class SavePresentationCommand
	 * 
	 * @param slideViewerFrame
	 * @param presentation
	 */
	public SavePresentationCommand(Frame slideViewerFrame, Displayable presentation) {
		this.slideViewerFrame = slideViewerFrame;
		this.presentation = presentation;
	}

	/* (non-Javadoc)
	 * @see controller.command.Command#execute()
	 */
	@Override
	public void execute() {
		Writer writer = new WriterImpl();
		try {
			writer.saveFile(this.presentation, Values.SAVEFILE);
		} catch (IOException exc) {
			JOptionPane.showMessageDialog(this.slideViewerFrame, Values.IOEX + exc, Values.SAVEERR,
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
