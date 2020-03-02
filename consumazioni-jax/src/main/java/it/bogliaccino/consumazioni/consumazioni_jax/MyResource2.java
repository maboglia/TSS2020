package it.bogliaccino.consumazioni.consumazioni_jax;

import java.util.Collection;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import controller.StudentiCtrl;
import model.Studente;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("studenti")
public class MyResource2 {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Studente> getIt() {
        
    	StudentiCtrl sc = new StudentiCtrl();
    	System.out.println(sc.getStudenti().size());
    	return  sc.getStudenti().values();
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Studente getStudente(@PathParam("id") long identificativo) {
    	
    	StudentiCtrl sc = new StudentiCtrl();
//    	System.out.println(sc.getStudenti().size());
    	Studente studente = sc.getStudenti().get(identificativo);
		return  studente;
    }
}
