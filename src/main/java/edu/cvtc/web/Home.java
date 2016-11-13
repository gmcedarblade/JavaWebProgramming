package edu.cvtc.web;

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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		final PrintWriter out = response.getWriter();
		
		out.append("<!doctype html>\n<html>\n<head>\n\t<title>Greg's Website</title>\n</head>\n<body>");
		out.append("\n\t<h1>Welcome to my website</h1>");
		out.append("\n\t<nav>\n\t<li><a href=\"Home\">Home</a></li>"
				+ "\n\t<li><a href=\"About\">About</a></li>"
				+ "\n\t<li><a href=\"Contact\">Contact</a></li></nav>");
		out.append("\n\t<p>This is my initial website for the Java Web Programming at Chippewa Valley Technical College."
				+ " This is a website that is about myself. You can look at the about me section to find out more about"
				+ " me and if you wish to contact me then please go to the contact me page.</p>");
		out.append("\n\t<footer>&copy; Copyright 2016 Greg Cedarblade</footer>\n</body>\n</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
