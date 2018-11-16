package controller.command;

import java.awt.Frame;
import java.io.IOException;

import javax.swing.JOptionPane;

import event.CommandEventManager;
import event.OpenPresentationEvent;
import event.RepaintEvent;
import event.SlideEvent;
import jabberpoint.Values;
import model.Displayable;
import model.Reader;
import model.ReaderImpl;

public class OpenPresentationCommand implements Command {	
	private Frame slideViewerFrame;
	private Displayable presentation;
	
	private CommandEventManager<SlideEvent> frameCommandEventManager;
	private SlideEvent eventObject;

	public OpenPresentationCommand(Frame slideViewerFrame, Displayable presentation) {
		this.frameCommandEventManager = new CommandEventManager<SlideEvent>();
		this.frameCommandEventManager.addListener(presentation);
		this.eventObject = new OpenPresentationEvent(presentation);
		this.slideViewerFrame = slideViewerFrame;
		this.presentation = presentation;
	}
	
	@Override
	public void execute() {
		this.presentation.clear();
		Reader reader = new ReaderImpl();
		try {
			reader.loadFile(this.presentation, Values.TESTFILE);
			this.frameCommandEventManager.fire(eventObject);
		} catch (IOException exc) {
			JOptionPane.showMessageDialog(this.slideViewerFrame, Values.IOEX + exc, 
 			Values.LOADERR, JOptionPane.ERROR_MESSAGE);
		}
	}

}
