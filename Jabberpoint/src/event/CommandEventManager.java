/**
 *
 */
package event;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

/**
 * Manages the event listeners that are created to execute menu or key commands.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 * @param <EventType>
 */
public class CommandEventManager<EventType extends EventObject> {

	private List<CommandEventListener<EventType>> commandEventList = new ArrayList<CommandEventListener<EventType>>();

	/**
	 * Adds an event listener to the CommandEventManager
	 * 
	 * @param listener
	 */
	public void addListener(CommandEventListener<EventType> listener) {
		commandEventList.add(listener);
	}

	/**
	 * Removes an event from the CommandEventManager
	 * 
	 * @param listener
	 */
	public void removeListener(CommandEventListener<EventType> listener) {
		commandEventList.remove(listener);
	}

	/**
	 * Enables the trigger for event execution 
	 * 
	 * @param event
	 */
	public void fire(EventType event) {
		for (CommandEventListener<EventType> listener : commandEventList) {
			listener.eventTriggered(event);
		}
	}

}
