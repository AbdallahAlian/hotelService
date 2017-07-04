package com.expedia.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.expedia.commands.CommandFactory;
import com.expedia.commands.CommandModel;
import com.expedia.utils.UrlReaderUtils;

public class Controller extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if (req.getParameter("cmd") != null) {
			CommandModel commandModel = CommandFactory.getCommand(req.getParameter("cmd"));
			if (commandModel != null) {
				req.setAttribute("endPoint", UrlReaderUtils.handleQueryParameters(req));
				commandModel.execute(req, resp);
			}
		}
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
