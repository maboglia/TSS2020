<%@page import="controller.LibroMatricola"%>
<%

if (session.getAttribute("libro")==null){
	LibroMatricola lm = new LibroMatricola();
	session.setAttribute("libro", lm);
}

%>

<%@ include file="header.jsp" %>

	<h1>Gestionale dipendenti</h1>


<%@ include file="footer.jsp" %>

