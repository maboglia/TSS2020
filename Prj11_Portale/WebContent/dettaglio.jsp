
<%@page import="model.Serie"%>
<% 

Serie s = (Serie) request.getAttribute("serie");


%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Dettaglio</title>

<style>
.scheda {border:1px solid #ccc; width: 75%; margin: 0 auto;}
.titolo {padding:1em;display:block; font-size: 1.3em;color:crimson;}
.testo {font: 1.1em;padding:1em;}
img { border: 1px solid #ccc; padding:.5em; width: 300px; }

</style>

</head>
<body>

<h1>Scheda dettaglio</h1>

<div class="scheda">
    <div class="titolo"><%=s.getName() %></div>
    <div class="testo"><%= s.getSummary() %></div>
    <img src="<%=s.getImage() %>" alt="<%=s.getName() %>">
</div>


</body>
</html>