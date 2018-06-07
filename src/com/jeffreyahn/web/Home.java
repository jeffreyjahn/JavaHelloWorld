package com.jeffreyahn.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName;
		String lastName;
		String favoriteLanguage;
		String hometown;
		if(request.getParameter("firstName") != null) {
	        firstName = request.getParameter("firstName");
		} else {
			firstName = "unknown";
		}
		if(request.getParameter("lastName") != null) {
	        lastName = request.getParameter("lastName");
		} else {
			lastName = "unknown";
		}
		if(request.getParameter("favoriteLanguage") != null) {
			favoriteLanguage = request.getParameter("favoriteLanguage");
		} else {
			favoriteLanguage = "unknown";
		}

		if(request.getParameter("hometown") != null) {
			hometown = request.getParameter("hometown");
		} else {
			hometown = "unknown";
		}
        
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write("<h1>Welcome, " + firstName + " " + lastName+ "</h1>");
        out.write("<h3>Your favorite language is: " + favoriteLanguage + "</h3>");
        out.write("<h3>Your hometown is: " + hometown + "</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
