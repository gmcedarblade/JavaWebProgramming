package edu.cvtc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class About
 */
@WebServlet("/About")
public class About extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public About() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		final PrintWriter out = response.getWriter();
		
		out.append("<!doctype html>\n<html>\n<head>\n\t<title>Greg's Website</title>\n</head>\n<body>");
		out.append("\n\t<h1>About me</h1>");
		out.append("\n\t<nav>\n\t\t<li><a href=\"Home\">Home</a></li>"
				+ "\n\t\t<li><a href=\"About\">About</a></li>"
				+ "\n\t\t<li><a href=\"Contact\">Contact</a></li>\n\t</nav>");
		out.append("\n\t<p>I am currently a student at Chippewa Valley Technical College. I working on a "
				+ "dual degree in IT - Software Developer and Mobile Developer. I am also one of the educational"
				+ " application programmers and designers for the ARISE project at Chippewa Valley Technical"
				+ " College.</p>");
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
