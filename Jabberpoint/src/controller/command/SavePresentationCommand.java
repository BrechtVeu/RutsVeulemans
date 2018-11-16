/**
 * 
 */
package controller.command;

import java.awt.Frame;
import java.io.IOException;

import javax.swing.JOptionPane;

import jabberpoint.Values;
import model.Displayable;
import model.Presentation;
import model.Writer;
import model.WriterImpl;

/**
 * @author Dominique
 *
 */
public class SavePresentationCommand implements Command {
	private Frame slideViewerFrame;
	private Displayable presentation;

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
			JOptionPane.showMessageDialog(this.slideViewerFrame, Values.IOEX + exc, 
					Values.SAVEERR, JOptionPane.ERROR_MESSAGE);
		}
	}
}
