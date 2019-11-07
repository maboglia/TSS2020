

<%@ include file="header.jsp" %>

	<h1>inserisci nuovo dipendente</h1>

	<form method="post" action="doInserisci.jsp">
		<input type="text" name="nome" placeholder="nome">
		<input type="text" name="cognome" placeholder="cognome">
		<input type="submit" name="inserisci" value="inserisci">
		
	</form>


<%@ include file="footer.jsp" %>

