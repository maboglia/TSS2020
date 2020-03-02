package it.bogliaccino.mavendemo.maven_web_project;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import model.Libreria;
import model.Libro;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Siamo quasi in pausa!";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/libri")
    public List<Libro> getLibri() {
  	
    	ArrayList<Libro> scaffale = (ArrayList<Libro>) Libreria.scaffale;
    	return scaffale;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/libro/{id}")
    public Response getLibri(@PathParam("id") int id) {
    	
    	Libro l = (Libro) Libreria.scaffale.get(id);
    	
    	return Response.status(404).entity(l).build();
    	
    }
    
}
