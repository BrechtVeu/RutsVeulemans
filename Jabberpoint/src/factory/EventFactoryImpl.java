package factory;

import event.ChangeSlideThemeEvent;
import event.GotoSlideEvent;
import event.NextSlideEvent;
import event.OpenPresentationEvent;
import event.PreviousSlideEvent;
import event.RepaintEvent;
import model.Displayable;

/**
 * Concrete implementation of EventFactory.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public class EventFactoryImpl implements EventFactory {

	/* (non-Javadoc)
	 * @see factory.EventFactory#makeChangeSlideThemeEvent(model.Displayable)
	 */
	@Override
	public ChangeSlideThemeEvent makeChangeSlideThemeEvent(Displayable presentation) {
		return new ChangeSlideThemeEvent(presentation);
	}

	/* (non-Javadoc)
	 * @see factory.EventFactory#makeGotoSlideEvent(model.Displayable)
	 */
	@Override
	public GotoSlideEvent makeGotoSlideEvent(Displayable presentation) {
		return new GotoSlideEvent(presentation);
	}

	/* (non-Javadoc)
	 * @see factory.EventFactory#makeNextSlideEvent(model.Displayable)
	 */
	@Override
	public NextSlideEvent makeNextSlideEvent(Displayable presentation) {
		return new NextSlideEvent(presentation);
	}

	/* (non-Javadoc)
	 * @see factory.EventFactory#makeOpenPresentationEvent(model.Displayable)
	 */
	@Override
	public OpenPresentationEvent makeOpenPresentationEvent(Displayable presentation) {
		return new OpenPresentationEvent(presentation);
	}

	/* (non-Javadoc)
	 * @see factory.EventFactory#makePreviousSlideEvent(model.Displayable)
	 */
	@Override
	public PreviousSlideEvent makePreviousSlideEvent(Displayable presentation) {
		return new PreviousSlideEvent(presentation);
	}

	/* (non-Javadoc)
	 * @see factory.EventFactory#makeRepaintEvent(model.Displayable)
	 */
	@Override
	public RepaintEvent makeRepaintEvent(Displayable presentation) {
		return new RepaintEvent(presentation);
	}

}
