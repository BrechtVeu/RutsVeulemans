package view.decorator;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import jabberpoint.Values;
import model.Displayable;
import view.theme.SlideStyle;
import view.theme.Theme;

public class LogoDecorator extends DisplayableDecorator{

	private BufferedImage bufferedImage;
	
	public LogoDecorator(Displayable displayable) {
		super(displayable);
	}

	@Override
	public void decorate(Graphics g, Rectangle area, ImageObserver view, Displayable presentation) {
		draw(g, area, view, presentation);
		displayable.decorate(g, area, view, presentation);
	}
	
	private void draw(Graphics g, Rectangle area, ImageObserver view, Displayable presentation){
		SlideStyle style = getCorrectSlideStyle(presentation);
		String logo = style.getLogo();
		try {
			bufferedImage = ImageIO.read(new File(logo));
		}
		catch (IOException e) {
			System.err.println(Values.FILE + logo + Values.NOTFOUND) ;
		}
		
		int distanceFromSides = 20;
		int x = (int) (area.width -  (bufferedImage.getWidth(view))*getScale(area)) - distanceFromSides;
		int y = (int) (area.height - (bufferedImage.getHeight(view))*getScale(area)) - distanceFromSides;
		
		g.drawImage(bufferedImage, x, y,(int) (bufferedImage.getWidth(view)*getScale(area)),
                (int) (bufferedImage.getHeight(view)*getScale(area)), view);	
		
	}
}
