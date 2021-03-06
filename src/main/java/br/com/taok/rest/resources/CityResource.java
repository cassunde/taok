package br.com.taok.rest.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.taok.dao.CityDao;
import br.com.taok.rest.conf.ControllerRest;


@Path("/citys")
@ControllerRest
public class CityResource {

	@Inject
	private CityDao cityDao;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response citys() {        
     
    	return Response.ok( cityDao.getAllCitys() ).build();
    }
}
