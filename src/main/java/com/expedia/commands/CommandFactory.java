package com.expedia.commands;

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
