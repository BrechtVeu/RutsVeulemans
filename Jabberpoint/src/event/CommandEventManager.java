/**
 *
 */
package event;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;

/**
 * @author Dominique
 *
 */
public class CommandEventManager<EventType extends EventObject> {

	private List<CommandEventListener<EventType>> commandEventList = new ArrayList<CommandEventListener<EventType>>();

	public void addListener(CommandEventListener<EventType> listener) {
		commandEventList.add(listener);
	}

	public void removeListener(CommandEventListener<EventType> listener) {
		commandEventList.remove(listener);
	}

	public void fire(EventType event) {
		for (CommandEventListener<EventType> listener : commandEventList) {
			System.out.println("CommandEventManager - fire - " + event.getClass());
			listener.eventTriggered(event);
		}
	}

}
