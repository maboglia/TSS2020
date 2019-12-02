package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReportTask
 */
@WebServlet("/ReportTask")
public class ReportTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TaskController tc;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if(tc==null) {
			if(req.getSession().getAttribute("oscar")!=null)
				tc=(TaskController) req.getSession().getAttribute("oscar");
			else 
			{
			tc=new TaskController();
			req.getSession().setAttribute("oscar", tc);
			}
			
		}
		StringBuilder sb= new StringBuilder();
		
		for (String[] temp : tc.getAllTask()) {
			sb.append(temp[0]);
			sb.append(" "+temp[1]);
			sb.append(" "+temp[2]);
		}

		//includo intestazione e menu
		req.getRequestDispatcher("header.jsp").include(req, resp);
		req.getRequestDispatcher("menu.jsp").include(req, resp);
		
		//includo il report con i dati aggiornati in sessione
		req.getRequestDispatcher("reportTask.jsp").include(req, resp);
		
		//includo pié di pagina
		req.getRequestDispatcher("footer.jsp").include(req, resp);
	
	}
       

}
