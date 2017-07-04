package com.expedia.commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Command Interface has execute method only
 * 
 * @author abd
 * @since V1.0
 */
public interface CommandModel {

	/**
	 * Method to execute the business logic
	 * 
	 * @param request
	 * @param response
	 * @author abd
	 * @since V1.0
	 */
	public void execute(HttpServletRequest request, HttpServletResponse response);
}
