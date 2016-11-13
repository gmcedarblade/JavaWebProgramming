package edu.cvtc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final PrintWriter out = response.getWriter();
		
		out.append("<!doctype html>\n<html>\n<head>\n\t<title>Greg's Website</title>\n</head>\n<body>");
		out.append("\n\t<h1>Contact me</h1>");
		out.append("\n\t<nav>\n\t\t<li><a href=\"Home\">Home</a></li>"
				+ "\n\t\t<li><a href=\"About\">About</a></li>"
				+ "\n\t\t<li><a href=\"Contact\">Contact</a></li>\n\t</nav>");
		out.append("\n\t<form>"
				+ "\n\t<h2>Contact Form</h2>"
				+ "\n\t\t<div>"
				+ "\n\t\t\t<label>First Name</label>"
				+ "\n\t\t\t<input type=\"text\" />"
				+ "\n\t\t</div>"
				+ "\n\t\t<div>"
				+ "\n\t\t\t<label>Last Name</label>"
				+ "\n\t\t\t<input type=\"text\" />"
				+ "\n\t\t</div>"
				+ "\n\t\t<div>"
				+ "\n\t\t\t<label>E-Mail Address</label>"
				+ "\n\t\t\t<input type=\"email\" />"
				+ "\n\t\t</div>"
				+ "\n\t\t<div>"
				+ "\n\t\t\t<button type=\"submit\">Submit</button>"
				+ "\n\t\t</div>"
				+ "\n\t</form>");
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
