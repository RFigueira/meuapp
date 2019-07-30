package br.com.rodrigofreitas.meuapp.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWordResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Seja bem-vindo ao quarkus";
    }
}