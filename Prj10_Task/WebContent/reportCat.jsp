<%@page import="controller.TaskController"%>
<h1>Elenco Categorie</h1>
<table>
	<%
		TaskController tc=(TaskController)session.getAttribute("oscar");
		for(String temp: tc.getCategorie())
		{

		%>
		<tr>
			<td><%=temp%></td>
		</tr>
		<%
		}
	%>
</table>