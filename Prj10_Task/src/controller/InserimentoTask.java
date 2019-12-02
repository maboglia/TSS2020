package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

/**
 * Servlet implementation class InserimentoTask
 */
@WebServlet("/addTask")
public class InserimentoTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TaskController tc;
     
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("task") != null && request.getParameter("categoria") != null)
		{
			if(tc==null) {
				if(request.getSession().getAttribute("oscar")!=null)
					tc=(TaskController) request.getSession().getAttribute("oscar");
				else 
				{
				tc=new TaskController();
				request.getSession().setAttribute("oscar", tc);
				}
				
			}
			
			
			if(tc.addTask(request.getParameter("categoria"),request.getParameter("task"))) {
				//response.getWriter().append("inserito");
				request.setAttribute("inserimento", "effettuato");

				request.getRequestDispatcher("header.jsp").include(request, response);
				request.getRequestDispatcher("menu.jsp").include(request, response);
				request.getRequestDispatcher("viewInserimento.html").include(request, response);
				request.getRequestDispatcher("footer.jsp").include(request, response);
			
							
			}
				else
				response.getWriter().append("non inserito");
		}
	}

	
	
	

}
