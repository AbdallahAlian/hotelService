package com.expedia.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CommandModel {

	public void execute(HttpServletRequest request, HttpServletResponse response);
}
