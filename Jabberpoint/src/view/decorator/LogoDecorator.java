package view.decorator;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import jabberpoint.Values;
import model.Displayable;
import view.theme.SlideStyle;

/**
 * Extends abstract class DisplayableDecorator to decorate the logo on a slide. 
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class LogoDecorator extends DisplayableDecorator {

	private BufferedImage bufferedImage;

	/**
	 * Constructor for objects of class LogoDecorator
	 * 
	 * @param displayable
	 */
	public LogoDecorator(Displayable displayable) {
		super(displayable);
	}

	/* (non-Javadoc)
	 * @see view.decorator.DisplayableDecorator#decorate(java.awt.Graphics, java.awt.Rectangle, java.awt.image.ImageObserver, model.Displayable)
	 */
	@Override
	public void decorate(Graphics g, Rectangle area, ImageObserver view, Displayable presentation) {
		draw(g, area, view, presentation);
		displayable.decorate(g, area, view, presentation);
	}

	/**
	 * Draws the logo of the presentation 
	 * 
	 * @param g
	 * @param area
	 * @param view
	 * @param presentation
	 */
	private void draw(Graphics g, Rectangle area, ImageObserver view, Displayable presentation) {
		SlideStyle style = getCorrectSlideStyle(presentation);
		String logo = style.getLogo();
		try {
			bufferedImage = ImageIO.read(new File(logo));
		} catch (IOException e) {
			System.err.println(Values.FILE + logo + Values.NOTFOUND);
		}

		int distanceFromSides = 20;
		int x = (int) (area.width - (bufferedImage.getWidth(view)) * getScale(area)) - distanceFromSides;
		int y = (int) (area.height - (bufferedImage.getHeight(view)) * getScale(area)) - distanceFromSides;

		g.drawImage(bufferedImage, x, y, (int) (bufferedImage.getWidth(view) * getScale(area)),
				(int) (bufferedImage.getHeight(view) * getScale(area)), view);

	}
}
