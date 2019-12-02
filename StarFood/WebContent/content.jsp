<%@page import="controller.OrdinatorePrezzo"%>
<%@page import="java.util.Comparator"%>
<%@page import="model.Prodotto"%>
<%@page import="java.util.Collections"%>
<%@ page errorPage="error_page.jsp" %>
<%@ page import="java.util.List"%>

<% 
	String titolo = (request.getAttribute("pagina") != null)?
		(String)request.getAttribute("pagina"):
		"home"; 
		
	List<Prodotto> prodotti = (List<Prodotto>)request.getAttribute("prodotti");

%>

<h1> <%=titolo%> </h1>
<table>
<%
	
	for(Prodotto prodotto: prodotti){
		
		%>
		<tr>
			<td><%=prodotto %></td>
		</tr>
		<% 
	}

%>
</table>
	
