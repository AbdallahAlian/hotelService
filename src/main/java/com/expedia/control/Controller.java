package com.expedia.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.expedia.commands.CommandFactory;
import com.expedia.commands.CommandModel;

/**
 * Controller Servlet Handle all passed request and send the command to the
 * corresponding business class
 * 
 * @author abd
 * @since V1.0
 */
public class Controller extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * Service method execute the passed request through the command attribute
	 */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if (req.getParameter("cmd") != null) {
			CommandModel commandModel = CommandFactory.getCommand(req.getParameter("cmd"));
			if (commandModel != null) {
				commandModel.execute(req, resp);
			}
		}
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
