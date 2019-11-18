<!DOCTYPE html>
<%@page import="java.util.ArrayList, model.*"%>
<html lang="it">
<head>
<meta charset="utf-8">
<title>Siamo tutti piastrellisti</title>
</head>
<body>

	<h1>Piastrella</h1>

	<form method="post" action="PiastrelleController">
		<input type="text" name="camera" placeholder="camera" />
		<br>
		<label for="forma">Forma</label>

		<input type="radio" name="forma" value="Triangolo" /> Triangolo
		<input type="radio" name="forma" value="Quadrato" /> Quadrato
		<input type="radio" name="forma" value="Rettangolo" /> Rettangolo
		<br>
		
		<input type="number" name="base" id="base" placeholder="base">
		<br>
		<input type="number" name="altezza" id="altezza" placeholder="altezza">
	
		<br>
		<input type="submit" value="aggiungi camera">

	
	</form>
	
	<%
	String camera="";
	String forma="";
	int base=0;			
	int altezza=0;
	ArrayList<Figura> stanze = null ;
	if (session.getAttribute("stanze")==null){
		stanze = new ArrayList<>();
		session.setAttribute("stanze", stanze);
	}
		if (request.getParameter("camera")!=null){
			stanze = (ArrayList<Figura>) session.getAttribute("stanze");
			//camera
			 camera = request.getParameter("camera");
			//forma: quale oggetto istanziare
			 forma = request.getParameter("forma");
			//valori di riferimento per base, altezza 
			 base = Integer.parseInt(request.getParameter("base"));
			 altezza = Integer.parseInt(request.getParameter("altezza"));
			//inserisci forma nella collection
			switch(forma){
			case "Triangolo":
				stanze.add(new Triangolo(camera, base, altezza));
				break;
			case "Rettangolo":
				stanze.add(new Rettangolo(camera, base, altezza));
				break;
			case "Quadrato":
				stanze.add(new Quadrato(camera, base));
				break;
			}
			//stampa collection
			
		}
		
	
	%>


	<%
	
		double totale=0;
		if (stanze != null && stanze.size() > 0 ){
			for(Figura f : stanze){
			totale+=f.area();
				%><h2><%= f %></h2><%	
			}
			%><h3>superficie totale: <%= totale %></h3><%	
		}
			
	
	%>


		

</body>
</html>