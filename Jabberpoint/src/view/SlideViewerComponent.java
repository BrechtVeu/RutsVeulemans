package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JComponent;
import javax.swing.JFrame;

import jabberpoint.Values;
import model.Displayable;
import model.Observer;

/**
 * <p>
 * SlideViewerComponent is een grafische component die Slides kan laten zien.
 * </p>
 * 
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 */

public class SlideViewerComponent extends JComponent implements Observer {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Displayable slide; // de huidige slide
	private Displayable presentation = null; // de presentatie
	private JFrame frame = null;

	public SlideViewerComponent(Displayable pres, JFrame frame) {
		setBackground(Values.BGCOLOR);
		presentation = pres;
		this.frame = frame;
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(Values.WIDTH, Values.HEIGHT);
	}

	@Override
	public void update(Displayable presentation, Displayable data) {
		if (data == null) {
			repaint();
			return;
		}
		this.presentation = presentation;
		this.slide = data;
		repaint();
		frame.setTitle(presentation.getTitle());
	}

// teken de slide
	@Override
	public void paintComponent(Graphics g) {
		if (presentation.getSlideNumber() < 0 || slide == null) {
			return;
		}

		// TODO area verandert van:
		// Rectangle area = new Rectangle(0, Values.YPOS, getWidth(), (getHeight() -
		// Values.YPOS));
		Rectangle area = new Rectangle(0, Values.YPOS, getWidth(), getHeight());

		if (presentation.getSlideNumber() == 0) {
			slide = presentation.getTheme().getSlideStyle().wrapDecorator(slide);
		} else {
			slide = presentation.getTheme().getSlideStyleOthers().wrapDecorator(slide);
		}
		slide.decorate(g, area, this, presentation);
	}
}
