package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Agenda;

//Rotta
@WebServlet("/add")
public class AddImpegno extends HttpServlet {
	Agenda agenda;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String argomento = req.getParameter("argomento");
		String luogo = req.getParameter("luogo");
		String priorita = req.getParameter("priorita");
		String ora = req.getParameter("ora");
		String dayWeek = req.getParameter("dayWeek");
		
		if(req.getSession().getAttribute("Agenda")!= null) {
			agenda = (Agenda)req.getSession().getAttribute("Agenda"); 
		agenda.definisci(argomento, luogo, Integer.parseInt(priorita), Integer.parseInt(ora), Integer.parseInt(dayWeek));
		resp.sendRedirect("Agenda.jsp");
		}else {
			resp.getWriter().append("Errore");
		}
	}
}
