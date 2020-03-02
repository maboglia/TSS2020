package controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Agenda;

/**
 * Servlet implementation class Router
 */
@WebServlet("/")
public class Router extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Agenda agenda;   

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    //init viene eseguito solo la prima volta
	public void init(ServletConfig config) throws ServletException {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		agenda = new Agenda();
		if(request.getSession().getAttribute("Agenda") == null)
		request.getSession().setAttribute("Agenda", agenda);
		response.sendRedirect("Agenda.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
