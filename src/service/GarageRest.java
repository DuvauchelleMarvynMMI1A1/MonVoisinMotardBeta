package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Garage;
import stockage.DaoGarage;


@Stateless
@Path("")
public class GarageRest {

    /**
     * This is a sample web service operation
     */
        @EJB
        private DaoGarage garage;

	
	@GET
	@Path("/garages")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Garage> findAll(){
		return garage.findAll();
	}
	
	@POST
	@Path("/garages")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addPersonne(Garage g){
		garage.inserer(g);
	}
           
	@GET
	@Path("/garages/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Garage find(@PathParam(value="id") int id){
		return (Garage) garage.find(id);
	}
	
	@PUT
	@Path("/garages")
	@Produces(MediaType.APPLICATION_JSON)
	public void modifier(Garage g){
		garage.modifier(g);
	}
	
	@DELETE
	@Path("/garages")
	@Produces(MediaType.APPLICATION_JSON)
	public void supprimer(@FormParam(value="id") int id){
		garage.supprimer(id);
	}
}

