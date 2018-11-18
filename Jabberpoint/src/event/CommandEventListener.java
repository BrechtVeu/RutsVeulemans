/**
 *
 */
package event;

import java.util.EventListener;
import java.util.EventObject;

/**
 * Gives interface for concrete implementations of a CommandEventListener.
 * Responsible for defining an event listener that listens to menu command.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 * @param <EventType>
 */
public interface CommandEventListener<EventType extends EventObject> extends EventListener {
	/**
	 * Trigger the event execution
	 * 
	 * @param event
	 */
	public void eventTriggered(EventType event);
}
