package model;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import view.drawer.BitmapItemDrawer;
import view.theme.Theme;


/** <p>De klasse voor een Bitmap item</p>
 * <p>Bitmap items hebben de verantwoordelijkheid om zichzelf te tekenen.</p>
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
*/

public class BitmapItem extends SlideItem {
  private BufferedImage bufferedImage;
  private String imageName;
  private BitmapItemDrawer bitmapItemDrawer;
  
  protected static final String FILE = "Bestand ";
  protected static final String NOTFOUND = " niet gevonden";

// level staat voor het item-level; name voor de naam van het bestand met de afbeelding
	public BitmapItem(int level, String name, BitmapItemDrawer bitmapItemDrawer) {
		super(level);
		imageName = name;
		this.bitmapItemDrawer = bitmapItemDrawer;
		try {
			bufferedImage = ImageIO.read(new File(imageName));
		}
		catch (IOException e) {
			System.err.println(FILE + imageName + NOTFOUND) ;
		}
	}

// geef de bestandsnaam van de afbeelding
	public String getName() {
		return imageName;
	}


	public String toString() {
		return "BitmapItem[" + getLevel() + "," + imageName + "]";
	}

	@Override
	public Rectangle getBoundingBox(Graphics g, ImageObserver observer, float scale, Theme theme) {
		return bitmapItemDrawer.getBoundingBox(g, observer, scale, getStyle(theme), bufferedImage);
	}

	@Override
	public void draw(Graphics g, Rectangle area, ImageObserver observer, Theme theme) {
		// TODO Auto-generated method stub
		float scale = getScale(area);
		bitmapItemDrawer.draw(area.x, area.y, scale, g, getStyle(theme), observer, bufferedImage);
	}
}
