
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
import model.User;
import stockage.DaoUser;




@Stateless
@Path("")
public class UserRest {

    /**
     * This is a sample web service operation
     */
        @EJB
        private DaoUser user;

	
	@GET
	@Path("/user")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Garage> findAll(){
		return user.findAll();
	}
	
	@POST
	@Path("/user")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addPersonne(User u){
		user.inserer(u);
	}
           
	@GET
	@Path("/user/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User find(@PathParam(value="id") int id){
		return (User) user.find(id);
	}
	
	@PUT
	@Path("/user")
	@Produces(MediaType.APPLICATION_JSON)
	public void modifier(User u){
		user.modifier(u);
	}
	
	@DELETE
	@Path("/user")
	@Produces(MediaType.APPLICATION_JSON)
	public void supprimer(@FormParam(value="id") int id){
		user.supprimer(id);
	}
}

