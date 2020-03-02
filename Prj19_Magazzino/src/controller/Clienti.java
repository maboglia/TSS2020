package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDAOImpl;
import model.Cliente;

@WebServlet("/clienti")
public class Clienti extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ClienteDAOImpl cdi = new ClienteDAOImpl();
//		try {
//			Cliente c = cdi.findById(3);
//		System.out.println(c.getCognome() + " " + c.getNome());
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		StringBuilder sb = new StringBuilder();
		
		try {
			List<Cliente> clienti = cdi.clientiAll();
			for (Cliente cliente : clienti) {
				sb.append( " <tr><td>" + cliente.getNome() + "</td><td> " + cliente.getCognome() + "</td></tr>");
				System.out.println(cliente.getNome()+ " " + cliente.getCognome());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		resp.getWriter().append(sb.toString());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ClienteDAOImpl cdi = new ClienteDAOImpl();
		if(req.getParameter("nome") != null && req.getParameter("cognome") != null ) {
			String nome = req.getParameter("nome");
			String cognome = req.getParameter("cognome");
			
			Cliente c = new Cliente();
			c.setNome(nome);
			c.setCognome(cognome);
			try {
				cdi.insert(c);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		resp.sendRedirect("index.jsp");
	}
	
	

}
