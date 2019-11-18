package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Studente;

/**
 * Servlet implementation class Router
 */
@WebServlet("/router")
public class Router extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Registro r = new Registro();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		int i = 0;
		StringBuilder sb = new StringBuilder();
		
		if (request.getParameter("pagina") != null ) {
			switch (request.getParameter("pagina")) {
			case "registro":
				if (request.getParameter("presente") != null )
					r.aggiungiPresente(r.faiAppello().get(Integer.parseInt(request.getParameter("presente"))));
				sb.append("questo è il registro");
				sb.append("<table>");
				for (Studente studente : r.faiAppello()) {
					
					sb.append("<tr>")
						.append("<td>"+studente.getNome()+"</td>")
						.append("<td>"+studente.getCognome()+"</td>")
						.append("<td><a href=router?pagina=registro&presente="+i+">presente</a></td>")
						.append("<td><a href=#>assente</a></td>")
						.append("</tr>");
					i++;
				}
				sb.append("</table>");
				
				break;
			case "presenti":
				sb.append("questo è l'elenco dei presenti");
				sb.append("<table>");
				for (Studente studente : r.getPresenti()) {
					sb.append("<tr>")
						.append("<td>"+studente.getNome()+"</td>")
						.append("<td>"+studente.getCognome()+"</td>")
						.append("<td><a href=#>presente</a></td>")
						.append("<td><a href=#>assente</a></td>")
						.append("</tr>");
				}
				sb.append("</table>");				
				break;
			case "assenti":
				sb.append("questo è l'elenco degli assenti");
				sb.append("<table>");
				for (Studente studente : r.getPresenti()) {
					sb.append("<tr>")
						.append("<td>"+studente.getNome()+"</td>")
						.append("<td>"+studente.getCognome()+"</td>")
						.append("<td><a href=#>presente</a></td>")
						.append("<td><a href=#>assente</a></td>")
						.append("</tr>");
				}
				sb.append("</table>");				
				break;

			default:
				break;
			}
			response.getWriter().append(sb.toString());
		} else {
			response.getWriter().append("non hai passato parametri");
		}
		
		request.getRequestDispatcher("content.jsp").include(request, response);
		request.getRequestDispatcher("footer.jsp").include(request, response);
		
		
	}

}
