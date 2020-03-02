<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Cliente</title>
</head>
<body>

<h1>Inserisci nuovo cliente</h1>
<form action="modificaCliente" method="post">
<input type="text" name="id" value="${cliente.id}" placeholder="id">
<input type="text" name="cognome" value="${cliente.cognome}" placeholder="cognome">
<input type="text" name="nome" value="${cliente.nome}" placeholder="nome">
<input type="text" name="telefono" value="${cliente.telefono}" placeholder="telefono">
<input type="text" name="email" value="${cliente.email}" placeholder="email">
<input type="text" name="indirizzo" value="${cliente.indirizzo}" placeholder="indirizzo">
<input type="text" name="citta" value="${cliente.citta}" placeholder="citta">
<input type="text" name="regione" value="${cliente.regione}" placeholder="regione">
<input type="text" name="credito" value="${cliente.credito}" placeholder="credito">
<input type="submit" value="aggiungi">
</form>

<div>
${msg}
</div>


</body>
</html>