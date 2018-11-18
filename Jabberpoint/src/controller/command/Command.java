package controller.command;

import factory.EventFactory;
import factory.EventFactoryImpl;

/**
 * Gives interface for concrete implementations of a Command.
 * Responsible for defining a trigger for menu commands.
 * 
 * @author Brecht Veulemans, Dominique Ruts
 *
 */
public abstract class Command {
	
	protected EventFactory eventFactory = new EventFactoryImpl();
	/**
	 * Execute the command
	 */
	public abstract void execute();
}
