<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Mostra Clienti</title>
</head>
<body>

	<table>
		<tr>
			<th>id</th>
			<th>cognome</th>
			<th>nome</th>
			<th>telefono</th>
			<th>email</th>
			<th>indirizzo</th>
			<th>citta</th>
			<th>regione</th>
			<th>credito</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach items="${clienti}" var="cliente">
			<tr>
				<td>${cliente.id}</td>
				<td>${cliente.cognome}</td>
				<td>${cliente.nome}</td>
				<td>${cliente.telefono}</td>
				<td>${cliente.email}</td>
				<td>${cliente.indirizzo}</td>
				<td>${cliente.citta}</td>
				<td>${cliente.regione}</td>
				<td>${cliente.credito}</td>
				<td>
					<a href="deleteCliente?id=${cliente.id}">Elimina</a>
				</td>
				<td>
					<a href="aggiornaCliente?id=${cliente.id}">Aggiorna</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="aggiungiC">Aggiungi Cliente</a>

</body>
</html>