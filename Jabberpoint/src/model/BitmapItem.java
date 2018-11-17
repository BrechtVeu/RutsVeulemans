package model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import jabberpoint.Values;
import view.drawer.BitmapItemDrawer;
import view.theme.SlideItemStyle;

/**
 * <p>
 * De klasse voor een Bitmap item
 * </p>
 * <p>
 * Bitmap items have the responsibility to hold information about the image.
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

public class BitmapItem extends SlideItem {
	private BufferedImage bufferedImage;
	private String imageName;
	private BitmapItemDrawer bitmapItemDrawer;

	
	/**
	 * Constructor for objects of class BitmapItem
	 * 
	 * @param level
	 * @param name
	 * @param bitmapItemDrawer
	 */
	public BitmapItem(int level, String name, BitmapItemDrawer bitmapItemDrawer) {
		super(level);
		imageName = name;
		this.bitmapItemDrawer = bitmapItemDrawer;
		try {
			bufferedImage = ImageIO.read(new File(imageName));
		} catch (IOException e) {
			System.err.println(Values.FILE + imageName + Values.NOTFOUND);
		}
	}

	/**
	 * Get the name of the image
	 * 
	 * @return name of the image
	 */
	public String getName() {
		return imageName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BitmapItem[" + getLevel() + "," + imageName + "]";
	}

	/* (non-Javadoc)
	 * @see model.Displayable#getBoundingBox(java.awt.Graphics, java.awt.image.ImageObserver, float, view.theme.SlideItemStyle)
	 */
	@Override
	public Rectangle getBoundingBox(Graphics g, ImageObserver observer, float scale, SlideItemStyle slideItemstyle) {
		return bitmapItemDrawer.getBoundingBox(g, observer, scale, getStyle(slideItemstyle), bufferedImage);
	}

	/* (non-Javadoc)
	 * @see model.Displayable#draw(java.awt.Graphics, java.awt.Rectangle, java.awt.image.ImageObserver, view.theme.SlideItemStyle)
	 */
	@Override
	public void draw(Graphics g, Rectangle area, ImageObserver observer, SlideItemStyle slideItemstyle) {
		float scale = getScale(area);
		bitmapItemDrawer.draw(area.x, area.y, scale, g, getStyle(slideItemstyle), observer, bufferedImage);
	}
}
