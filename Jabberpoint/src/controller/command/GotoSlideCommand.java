/**
 * 
 */
package controller.command;

import javax.swing.JOptionPane;

import model.Displayable;

/**
 * @author Dominique
 *
 */
public class GotoSlideCommand implements Command {
	
	protected static final String PAGENR = "Page number?";
	
	private Displayable presentation;
	
	/**
	 * 
	 */
	public GotoSlideCommand(Displayable presentation) {
		this.presentation = presentation;
	}

	/* (non-Javadoc)
	 * @see controller.command.Command#execute()
	 */
	@Override
	public void execute() {
		String pageNumberStr = JOptionPane.showInputDialog((Object)PAGENR);
		int pageNumber = Integer.parseInt(pageNumberStr);
		presentation.setSlideNumber(pageNumber - 1);
	}

}
