package jabberpoint;

import java.awt.Color;
import java.awt.Font;

public class Values {

	private static final long serialVersionUID = 227L;

	/** JabberPoint */
	public static final String IOERR = "IO Error: ";
	public static final String JABERR = "Jabberpoint Error ";
	public static final String JABVERSION = "Jabberpoint 1.6 - OU version";
	public static final String JABTITLE = "Jabberpoint 1.6 - OU";

	public static final Color BGCOLOR = Color.white;
	public static final Color COLOR = Color.black;
	public static final String FONTNAME = "Dialog";
	public static final int FONTSTYLE = Font.BOLD;
	public static final int FONTHEIGHT = 10;
	public static final int XPOS = 1100;
	public static final int YPOS = 20;
	public final static int WIDTH = 1200;
	public final static int HEIGHT = 800;

	/** XML FORMAT */
	/** Default API to use. */
	protected static final String DEFAULT_API_TO_USE = "dom";

	/** namen van xml tags of attributen */
	public static final String SHOWTITLE = "showtitle";
	public static final String SLIDETITLE = "title";
	public static final String SLIDE = "slide";
	public static final String ITEM = "item";
	public static final String LEVEL = "level";
	public static final String KIND = "kind";
	public static final String TEXT = "text";
	public static final String IMAGE = "image";

	/** tekst van messages */
	public static final String PCE = "Parser Configuration Exception";
	public static final String UNKNOWNTYPE = "Unknown Element type";
	public static final String NFE = "Number Format Exception";

	/** MenuController + Commands */
	public static final String ABOUT = "About";
	public static final String FILE = "File";
	public static final String EXIT = "Exit";
	public static final String GOTO = "Go to";
	public static final String HELP = "Help";
	public static final String NEW = "New";
	public static final String NEXT = "Next";
	public static final String OPEN = "Open";
	public static final String PAGENR = "Page number?";
	public static final String PREV = "Prev";
	public static final String SAVE = "Save";
	public static final String THEME = "Theme";
	public static final String VIEW = "View";

	public static final String TESTFILE = "test.xml";
	public static final String SAVEFILE = "dump.xml";

	public static final String IOEX = "IO Exception: ";
	public static final String LOADERR = "Load Error";
	public static final String SAVEERR = "Save Error";

	public static final String NOTFOUND = " niet gevonden";

	/** Accessor */
	public static final String DEMO_NAME = "Demonstratie presentatie";
	public static final String DEFAULT_EXTENSION = ".xml";

	/** Themes */
	public static final String THEME1 = "1 - Theme 1";
	public static final String THEME2 = "2 - Theme 2";
	public static final String THEME3 = "3 - Theme 3";
	public static final String THEME4 = "4 - Theme 4";
}
