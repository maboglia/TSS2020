<!DOCTYPE html>
<%@page import="model.Agenda"%>
<html>
<head>
<meta charset="utf-8">
<title>Agenda</title>
<style type="text/css">
#sidebar{
width: 20%;
border: 1px solid black;
flaot: left;
}
#content{
width: 75%;
margin-left: 1em;
border: 1px solid black;
flaot: left;
}

#tabella{
border: 1px solid red;
padding: 5px;
margin: 0 auto;
width: 90%;
}
#tabella td{
padding: 3px;
}
   
</style>
</head>
<body>
<div id="sidebar">
<form method="post" action="add">

<input type="text" name="argomento" value="" placeholder="argomento">
<input type="text" name="luogo" value="" placeholder="luogo">
<input type="number" name="priorita" value="" placeholder="priorita">
<input type="range" name="ora" min=8 max=18 placeholder="ora">

<select name="dayWeek">
<option value="0">lunedi</option>
<option value="1">martedi</option>
<option value="2">mercoledi</option>
<option value="3">giovedi</option>
<option value="4">venerdi</option>
</select>

<input type="submit" value="registra">

</form>
</div>
<div id="content">

<h1>Agenda</h1>
<table id="tabella">
<tr>
	<th></th>	
	<th>lunedi</th>	
	<th>martedi</th>	
	<th>mercoledi</th>	
	<th>giovedi</th>	
	<th>venerdi</th>	
</tr>

<%

if(request.getSession().getAttribute("Agenda")!= null) {
	Agenda agenda = (Agenda)request.getSession().getAttribute("Agenda");
	for (int i = 0; i < 5; i++) {
		for (String string :agenda.visualizza()[i]) {
	   out.println("<tr><td>" +string + "</td></tr>");
	}
	   out.println();
    }
}

%>

</table>

</div>
</body>
</html>