
</div> <!-- chiusura container bootstrap -->
<script src="https://code.jquery.com/jquery-3.4.1.min.js"  crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

<script>

/* 	const bottone = document.getElementById('btnCerca');
	
	
	bottone.onclick = function(e){
		
		const testo = document.getElementById('txtCerca').value;
		
		e.preventDefault();
		console.log(testo);
		
		
	};
 */

 	$("#btnCerca").click(function(e){
		e.preventDefault();
 		console.log($('#txtCerca').val());
 		let testo = $('#txtCerca').val();
 		$('tr').not($('td:contains('+testo+')').parents('tr')).hide(3000);


	});
 
 	function prestito(id){
 		
 		$.ajax({
 			  method: "GET",
 			  url: "prestito",
 			  data: { identificativo: id }
 			})
 			  .done(function( msg ) {
 			    console.log( "Prestito: " + msg );
 			    $("#risposta").html("<h1>" + msg + "</h1>");
 			    
 			  });
 		
 		
 		//alert(id);
 	}
	

</script>


</body>
</html>