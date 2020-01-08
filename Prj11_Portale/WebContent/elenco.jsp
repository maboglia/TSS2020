<%@page import="java.util.List"%>
<% 

List<String> s = (List<String>) request.getAttribute("serie");

%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Elenco</title>

<style>
.titolo {padding:1em;display:block; font-size: 1.0em;color:blue;}

</style>

</head>
<body>

<h1>Vista elenco</h1>

<div class="elenco">
<% for(int i =0; i < s.size(); i++) { %>
    <div class="titolo"><a href="dettaglio?id=<%=i%>"><%=s.get(i)%></a></div>
<% } %>
</div>


</body>
</html>