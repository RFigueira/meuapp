package br.com.rodrigofreitas.meuapp.resource;

import br.com.rodrigofreitas.meuapp.service.HelloWordService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWordResource {

    @Inject
    HelloWordService helloWordService;


    @GET
    @Path("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWithName(@PathParam("name") String name) {
        return helloWordService.getHelloWithName(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Seja bem-vindo ao quarkus";
    }
}