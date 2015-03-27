package com.dewaldv.gizzard.controllers

import com.dewaldv.gizzard.models.Greeting

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import java.util.concurrent.atomic.AtomicInteger

@Path('/')
@Produces(MediaType.APPLICATION_JSON)
class GreetingController {
    static AtomicInteger counter = new AtomicInteger()

    @GET
    Greeting get() {
        new Greeting([id: counter.getAndIncrement(), content: "Hello World"])
    }
}
