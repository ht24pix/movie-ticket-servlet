package com.ht24.movieticket.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/purchase")
public class PurchaseController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2080044989051616468L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String seat = req.getParameter("seat");
		
		
	}
}
