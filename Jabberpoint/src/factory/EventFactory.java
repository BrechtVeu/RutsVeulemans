package factory;

import event.SlideEvent;
import model.Displayable;

/**
 * Gives interface for concrete implementations of a EventFactory.
 * Responsible for creating SlideEvent objects.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public interface EventFactory {
	/**
	 * Creates a ChangeSlideThemeEvent
	 * 
	 * @param presentation
	 * @return ChangeSlideThemeEvent
	 */
	public SlideEvent makeChangeSlideThemeEvent(Displayable presentation);
	/**
	 * Creates a GotoSlideEvent
	 * 
	 * @param presentation
	 * @return GotoSlideEvent
	 */
	public SlideEvent makeGotoSlideEvent(Displayable presentation);
	/**
	 * Creates a NextSlideEvent
	 * 
	 * @param presentation
	 * @return NextSlideEvent
	 */
	public SlideEvent makeNextSlideEvent(Displayable presentation);
	/**
	 * Creates a OpenPresentationEvent
	 * 
	 * @param presentation
	 * @return OpenPresentationEvent
	 */
	public SlideEvent makeOpenPresentationEvent(Displayable presentation);
	/**
	 * Creates a PreviousSlideEvent
	 * 
	 * @param presentation
	 * @return PreviousSlideEvent
	 */
	public SlideEvent makePreviousSlideEvent(Displayable presentation);
	/**
	 * Creates a RepaintEvent
	 * 
	 * @param presentation
	 * @return RepaintEvent
	 */
	public SlideEvent makeRepaintEvent(Displayable presentation);
}
