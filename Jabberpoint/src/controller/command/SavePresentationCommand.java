/**
 * 
 */
package controller.command;

import java.awt.Frame;
import java.io.IOException;

import javax.swing.JOptionPane;

import model.Presentation;
import model.Writer;
import model.WriterImpl;

/**
 * @author Dominique
 *
 */
public class SavePresentationCommand implements Command {
	protected static final String SAVEFILE = "dump.xml";
	
	protected static final String IOEX = "IO Exception: ";
	protected static final String LOADERR = "Load Error";
	protected static final String SAVEERR = "Save Error";
	
	private Frame slideViewerFrame;
	private Presentation presentation;

	public SavePresentationCommand(Frame slideViewerFrame, Presentation presentation) {
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
			writer.saveFile(this.presentation, SAVEFILE);
		} catch (IOException exc) {
			JOptionPane.showMessageDialog(this.slideViewerFrame, IOEX + exc, 
					SAVEERR, JOptionPane.ERROR_MESSAGE);
		}
	}
}
