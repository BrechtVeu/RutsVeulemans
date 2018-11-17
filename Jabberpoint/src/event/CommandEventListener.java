/**
 *
 */
package event;

import java.util.EventListener;
import java.util.EventObject;

/**
 * @author Dominique
 *
 */
public interface CommandEventListener<EventType extends EventObject> extends EventListener {
	void eventTriggered(EventType event);
}
