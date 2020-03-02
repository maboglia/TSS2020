
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<form action="clienti" method="post">
<input type="text" name="nome" placeholder="inserisci un nome">
<input type="text" name="cognome" placeholder="inserisci un cognome">
<input type="submit" value="invia">
</form>

<table id="tabella">
	<tr><th>Nome</th> <th>Cognome</th> </tr>
	

</table>

<script
  src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous"></script>
<script>
	$.ajax({
		url:'http://localhost:9090/Prj19_Magazzino/clienti',
		success:function(html){
			console.log(html);
			$('#tabella').append(html)
		}
		
	});
	

</script>
</body>
</html>