<%@ page import="controller.MappaPiante" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<table>
	
	<%
	
	MappaPiante mp = new MappaPiante();
	mp.caricaPiante();
	
	//faccio un ciclo sulle chiavi
	for(   Integer i :   mp.getMappa().keySet() ) {
		%>
		<tr><td><%= mp.getMappa().get(i).famiglia %></td><td><%= mp.getMappa().get(i).specie %></td><td><%= mp.getMappa().get(i).altezza %></td></tr>
		<%
	}

	%>
</table>

</body>
</html>