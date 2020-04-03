package com.koor.hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		if (login == null) login = "";
		if (password == null) password = "";
		
		response.setContentType( "text/html" );
		try ( PrintWriter out = response.getWriter() ){
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title> Veuillez vous identifier </title>");
			out.println( "<link rel='stylesheet' type='text/css' href='style.css'>" );
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Veuillez vous identifier</h1>");
			out.println("<h2>" + new Date() + "</h2>");
			out.println("<form method='post'>");
			out.println("<label for='txtLogin'> Login : </label>");
			out.println("<input id='txtLogin' name='txtLogin' type='text' value='" + login  + "' autofocus /> <br/>");
			out.println("<label for='txtPassword'> Password : </label>");
			out.println("<input id='txtPassword' name='txtPassword' type='password' value = '"+ password +"' /> <br/>");
			out.println("<br>");
			out.println("<input name='BtnConnect' type='submit' /> <br/>");
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		if (login.equals( "bond") && password.equals("007")) {
			try ( PrintWriter out = response.getWriter() ){
				out.println("ok");
			}
		} else {
			doGet(request, response);
		}
		
		
	}

}
