<%@page import="controller.TaskController"%>
<h1>Elenco Task</h1>
<table>
	<%
		TaskController tc=(TaskController)session.getAttribute("oscar");
		for(String[] temp: tc.getAllTask())
		{

		%>
		<tr>
			<td><%=temp[0]%></td>
			<td><%=temp[1]%></td>
			<td><%=temp[2]%></td>
		</tr>
		<%
		}
	%>
</table>