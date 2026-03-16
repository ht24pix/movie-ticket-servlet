package com.ht24.movieticket.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/movies")
public class MovieTicketController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8839877152283498192L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("Movie list");
		
	}
}
