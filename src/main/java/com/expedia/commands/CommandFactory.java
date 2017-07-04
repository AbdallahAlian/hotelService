package com.expedia.commands;

/**
 * Singleton class to Create command related business class
 * 
 * @author abd
 * @since V1.0
 */
public class CommandFactory {

	private CommandFactory() {

	}

	public static CommandModel getCommand(String command) {

		if (command.equals("Search")) {
			return new SearchCommand();
		}
		return null;

	}
}
