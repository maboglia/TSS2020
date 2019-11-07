<%@page import="controller.LibroMatricola"%>
<%@page import="model.Dipendente"%>
<%

	if (request.getParameter("inserisci")!=null){
		
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		
		Dipendente d = new Dipendente(nome, cognome);
		
		LibroMatricola lm = (LibroMatricola) session.getAttribute("libro");
		lm.aggiungiDipendente(d);
		response.sendRedirect("elenco.jsp");
		
	}


%>


