package com.dewaldv.gizzard.resources;

import com.dewaldv.gizzard.models.Greeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class GreetingResource {
    private static AtomicInteger counter = new AtomicInteger();
    private final String defaultName;

    public GreetingResource(String defaultName) {
        this.defaultName = defaultName;
    }

    @GET
    public Greeting get(@QueryParam("name") Optional<String> name) {
        return new Greeting(counter.incrementAndGet(), name.orElse(defaultName));
    }
}
