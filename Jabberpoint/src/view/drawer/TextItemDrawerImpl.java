package view.drawer;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.font.LineBreakMeasurer;
import java.awt.font.TextAttribute;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;
import java.awt.image.ImageObserver;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jabberpoint.Values;
import view.theme.Theme;

public class TextItemDrawerImpl implements TextItemDrawer {
	
	// geef de AttributedString voor het item
		public AttributedString getAttributedString(Theme myTheme, float scale, String text) {
			AttributedString attrStr = new AttributedString(text);
			attrStr.addAttribute(TextAttribute.FONT, myTheme.getSlideItemStyle().getFont(scale), 0, text.length());
			return attrStr;
		}

	// geef de bounding box van het item
		@Override
		public Rectangle getBoundingBox(Graphics g, ImageObserver observer, 
				float scale, Theme myTheme, String text) {
			List<TextLayout> layouts = getLayouts(g, myTheme, scale, text);
			int xsize = 0, ysize = (int) (myTheme.getSlideItemStyle().getLeading() * scale);
			Iterator<TextLayout> iterator = layouts.iterator();
			while (iterator.hasNext()) {
				TextLayout layout = iterator.next();
				Rectangle2D bounds = layout.getBounds();
				if (bounds.getWidth() > xsize) {
					xsize = (int) bounds.getWidth();
				}
				if (bounds.getHeight() > 0) {
					ysize += bounds.getHeight();
				}
				ysize += layout.getLeading() + layout.getDescent();
			}
			return new Rectangle((int) (myTheme.getSlideItemStyle().getIndent()*scale), 0, xsize, ysize );
		}

	// teken het item
		@Override
		public void draw(int x, int y, float scale, Graphics g, 
				Theme myTheme, ImageObserver o, String text) {
			
			List<TextLayout> layouts = getLayouts(g, myTheme, scale, text);
			Point pen = new Point(x + (int)(myTheme.getSlideItemStyle().getIndent() * scale), 
					y + (int) (myTheme.getSlideItemStyle().getLeading() * scale));
			Graphics2D g2d = (Graphics2D)g;
			g2d.setColor(myTheme.getSlideItemStyle().getColor());
			Iterator<TextLayout> it = layouts.iterator();
			while (it.hasNext()) {
				TextLayout layout = it.next();
				pen.y += layout.getAscent();
				layout.draw(g2d, pen.x, pen.y);
				pen.y += layout.getDescent();
			}
		  }

		private List<TextLayout> getLayouts(Graphics g, Theme myTheme, float scale, String text) {
			List<TextLayout> layouts = new ArrayList<TextLayout>();
			AttributedString attrStr = getAttributedString(myTheme, scale, text);
	    	Graphics2D g2d = (Graphics2D) g;
	    	FontRenderContext frc = g2d.getFontRenderContext();
	    	LineBreakMeasurer measurer = new LineBreakMeasurer(attrStr.getIterator(), frc);
	    	float wrappingWidth = (Values.WIDTH - myTheme.getSlideItemStyle().getIndent()) * scale;
	    	while (measurer.getPosition() < text.length()) {
	    		TextLayout layout = measurer.nextLayout(wrappingWidth);
	    		layouts.add(layout);
	    	}
	    	return layouts;
		}

}
