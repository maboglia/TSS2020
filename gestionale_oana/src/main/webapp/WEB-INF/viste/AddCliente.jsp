<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Cliente</title>
</head>
<body>

<h1>Inserisci nuovo cliente</h1>
<form action="aggiungiCliente" method="post">
<input type="text" name="id" placeholder="id">
<input type="text" name="cognome" placeholder="cognome">
<input type="text" name="nome" placeholder="nome">
<input type="text" name="telefono" placeholder="telefono">
<input type="text" name="email" placeholder="email">
<input type="text" name="indirizzo" placeholder="indirizzo">
<input type="text" name="citta" placeholder="citta">
<input type="text" name="regione" placeholder="regione">
<input type="text" name="credito" placeholder="credito">
<input type="submit" value="aggiungi">
</form>
<div>
${msg}
<a href="mostraClienti">Elenco Clienti</a>
</div>


</body>
</html>