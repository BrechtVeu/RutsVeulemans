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
 * SlideViewerComponent is a graphical component that can display Slides.
 * </p>
 *
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 * @version 1.7 2018/11/17 Brecht Veulemans, Dominique Ruts
 */
public class SlideViewerComponent extends JComponent implements Observer {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Displayable slide;
	private Displayable presentation = null;
	private JFrame frame = null;

	/**
	 * Constructor for objects of class SlideViewerComponent
	 * 
	 * @param pres
	 * @param frame
	 */
	public SlideViewerComponent(Displayable pres, JFrame frame) {
		setBackground(Values.BGCOLOR);
		presentation = pres;
		this.frame = frame;
	}

	/* (non-Javadoc)
	 * @see javax.swing.JComponent#getPreferredSize()
	 */
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(Values.WIDTH, Values.HEIGHT);
	}

	/* (non-Javadoc)
	 * @see model.Observer#update(model.Displayable, model.Displayable)
	 */
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

	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	public void paintComponent(Graphics g) {
		if (presentation.getDisplayableNumber() < 0 || slide == null) {
			return;
		}

		Rectangle area = new Rectangle(0, Values.YPOS, getWidth(), getHeight());

		if (presentation.getDisplayableNumber() == 0) {
			slide = presentation.getTheme().getSlideStyle().wrapDecorator(slide);
		} else {
			slide = presentation.getTheme().getSlideStyleOthers().wrapDecorator(slide);
		}
		slide.decorate(g, area, this, presentation);
	}
}
