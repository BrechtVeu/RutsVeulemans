/**
 * 
 */
package controller.command;

import javax.swing.JOptionPane;

import model.Presentation;

/**
 * @author Dominique
 *
 */
public class GotoSlideCommand implements Command {
	
	protected static final String PAGENR = "Page number?";
	
	private Presentation presentation;
	
	/**
	 * 
	 */
	public GotoSlideCommand(Presentation presentation) {
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
