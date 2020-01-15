<%@page import="java.util.Set"%>
<%@page import="model.Autore"%>
<%@page import="model.Libro"%>
<%@page import="java.util.List"%>
<% String messaggio = (request.getAttribute("messaggio")!=null)? (String) request.getAttribute("messaggio"):"ciao";  %>
<% List<Libro> elenco = (request.getAttribute("elenco")!=null)? (List<Libro>) request.getAttribute("elenco"):null;  %>
<% Libro libro = (request.getAttribute("libro")!=null)? (Libro) request.getAttribute("libro"):null;  %>
<% Set<Autore> elencoAutori = (request.getAttribute("elencoAutori")!=null)? (Set<Autore>) request.getAttribute("elencoAutori"):null;  %>
<% Set<String> elencoGeneri = (request.getAttribute("elencoGeneri")!=null)? (Set<String>) request.getAttribute("elencoGeneri"):null;  %>

<h1><%= messaggio %></h1> 

<%

	if (libro != null) {
		
		%>
<div class="card" style="width: 18rem;">
  <img src="..." class="card-img-top" alt="...">
  <div class="card-body">
    <p class="card-text"><%= libro.getTitolo() %></p>
    <p class="card-text"><%= libro.getAutore() %></p>
    <p class="card-text"><%= libro.getGenere() %></p>
    <button onclick="prestito(<%= libro.getId() %>)">Richiedi in prestito</button>    
  </div>
  <div id="risposta"></div>
</div>
		
		
		<%
	}


%>



<table class="table table-striped table-sm">
<% 
	if (elenco != null) {
		int i = 0;
		for ( Libro l : elenco ){
			i++;
			%>
			
			<tr>
				<td><%= i %></td><td><a href="dettaglio?id=<%= l.getId() %>"><%= l.getTitolo() %></a></td>
				<td><%= l.getAutore().get(0).getNome() %></td>
				<td><%= l.getGenere() %></td>
			</tr>
			
			<%
		} 
	}
%>
<% 
	if (elencoAutori != null) {

		elencoAutori.stream()
			.filter(a -> a.getNome().length() > 5)
			.forEach( 
					a -> out.print("<tr><td>"+ a.getNome() +"</td></tr>")
					);
		
	}
%>
<% 
	if (elencoGeneri != null) {
		int i = 0;
		for ( String g : elencoGeneri ){
			i++;
			%>
			
			<tr>
				<td><%= i %></td><td><%= g %></td>
			</tr>
			
			<%
		} 
	}
%>
</table>