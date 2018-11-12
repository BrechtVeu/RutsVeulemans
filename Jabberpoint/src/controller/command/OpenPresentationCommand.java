package controller.command;

import java.awt.Frame;
import java.io.IOException;

import javax.swing.JOptionPane;

import model.Accessor;
import model.Presentation;
import model.XMLAccessor;

public class OpenPresentationCommand implements Command {
	protected static final String TESTFILE = "test.xml";
	
	protected static final String IOEX = "IO Exception: ";
	protected static final String LOADERR = "Load Error";
	protected static final String SAVEERR = "Save Error";
	
	private Frame slideViewerFrame;
	private Presentation presentation;

	public OpenPresentationCommand(Frame slideViewerFrame, Presentation presentation) {
		this.slideViewerFrame = slideViewerFrame;
		this.presentation = presentation;
	}
	
	@Override
	public void execute() {
		this.presentation.clear();
		Accessor xmlAccessor = new XMLAccessor();
		try {
			xmlAccessor.loadFile(this.presentation, TESTFILE);
			this.presentation.setSlideNumber(0);
		} catch (IOException exc) {
			JOptionPane.showMessageDialog(this.slideViewerFrame, IOEX + exc, 
 			LOADERR, JOptionPane.ERROR_MESSAGE);
		}
		this.slideViewerFrame.repaint();
	}

}
