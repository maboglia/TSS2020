<%@page import="model.Libro"%>
<%@page import="java.util.List"%>
<% String messaggio = (request.getAttribute("messaggio")!=null)? (String) request.getAttribute("messaggio"):"ciao";  %>
<% List<Libro> elenco = (request.getAttribute("elenco")!=null)? (List<Libro>) request.getAttribute("elenco"):null;  %>

<h1><%= messaggio %></h1> 


<table class="table table-striped table-sm">
<% 
	if (elenco != null) {
		int i = 0;
		for ( Libro l : elenco ){
			i++;
			%>
			
			<tr><td><%= i %></td><td><%= l.getTitolo() %></td><td><%= l.getAutore() %></td></tr>
			
			<%
		} 
	}
%>
</table>