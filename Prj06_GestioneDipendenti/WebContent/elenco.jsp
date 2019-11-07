<%@ page import="model.*, controller.*" %>

<%@ include file="header.jsp" %>

	<h1>elenco dipendenti</h1>

<table>

	<tr><th>mat.</th><th>nome</th><th>cognome</th></tr>

<%

	LibroMatricola lm = (LibroMatricola) session.getAttribute("libro");
	for (Dipendente d : lm.stampaElenco() ){
		%>
		<tr>
			<td><%= d.getnMat() %></td>
			<td><%= d.getNome() %></td> 
			<td><%= d.getCognome() %></td> 
		</tr>
		
	<%	
	}


%>


</table>




<%@ include file="footer.jsp" %>

