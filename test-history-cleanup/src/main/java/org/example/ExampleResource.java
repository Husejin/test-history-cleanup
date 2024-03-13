package org.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("secret")
    public String secret() {
        return "***REMOVED***";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("feature")
    public String feature() {
        return "JUST A FEATURE ENDPOINT";
    }
}
