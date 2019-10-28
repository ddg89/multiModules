package it.ddg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "myServlet", urlPatterns = "myServlet")
public class MyServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6148666945310263790L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		renderPage(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		renderPage(request, response);
	}

	private void renderPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get the data
		PrintWriter out = response.getWriter();
//		out.write("<html><head><title>MyServlet</title></head><body>");
//		out.write("<h2>Add a new person</h2>");
//		out.write("<form name=\"myform\" method=\"POST\">");
//		out.write("ID:<input type=\"text\" name=\"id\"/><br/>");
//		out.write("Name:<input type=\"text\" name=\"name\"/><br/>");
//		out.write("Age:<input type=\"text\" name=\"age\"/><br/>");
//		out.write("<input type=\"submit\" name=\"submit\" value=\"add\"/>");
//		out.write("</form>");
//		out.write("<h2>People in the cache now</h2>");
//		out.write("<table><tr><th>ID</th><th>Name</th><th>Age</th></tr>");
//		// for each person in data
//		out.write("</table>");
//		out.write("</body></html>");
		out.write("CANAGLIA");
	}

}
