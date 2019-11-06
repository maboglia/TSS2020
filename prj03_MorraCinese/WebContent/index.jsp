<%@ page import="morracinese.MorraCinese" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Hello JSP</title>
<style type="text/css">
	img {width:125px;height: 125px;border:2px solid gray; padding:5px;}
</style>
</head>
<body>

	<h1>Morra cinese</h1>

	<a href="?scelta=pietra"><img src="https://www.filastrocche.it/contenuti/wp-content/uploads/2018/05/sasso.jpg"/></a>
	<a href="?scelta=forbici"><img src="https://images-na.ssl-images-amazon.com/images/I/61XKE1qsMpL._SX425_.jpg"/></a>
	<a href="?scelta=carta"><img src="https://pandapaperroll.com/wp-content/uploads/2014/08/80mm-x-80mm-Panda-Thermal-Rolls.jpg"/></a>
	
	
	<%
		//scriptlet
		if (request.getParameter("scelta") != null){
			
		
			String s = request.getParameter("scelta");
			
			//{"carta", "forbici", "sasso"};
		int sceltaUmano;
		if (s.equals("carta"))
			sceltaUmano = 0;
		else if (s.equals("forbici"))
			sceltaUmano = 1;
		else
			sceltaUmano = 2;
		
		int sceltaMacchina = MorraCinese.sceltaComputer();
		
		String ris = MorraCinese.valuta(sceltaUmano, sceltaMacchina);
		
		out.print("<h2>umano ha scelto: " + request.getParameter("scelta") + "</h2>");
		out.print("<h2>macchina ha scelto: " + MorraCinese.scelte[sceltaMacchina] + "</h2>");
		out.print("<h2>Il risultato è: " + ris + "</h2>");
		out.print("hai giocato " + MorraCinese.contatore + " volte");
		out.print("<br>hai vinto " + MorraCinese.vittorieUmano + " volte");
		double perc = (double) MorraCinese.vittorieUmano / MorraCinese.contatore * 100;
		out.print("<br>vittorie " + perc + "%");
		
		}
		
	%>




</body>
</html>