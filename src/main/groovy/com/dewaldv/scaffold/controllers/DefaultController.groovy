package com.dewaldv.scaffold.controllers

import com.dewaldv.scaffold.models.DefaultResponse

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType


@Path('/')
@Produces(MediaType.APPLICATION_JSON)
class DefaultController {

    int counter = 0;

    @GET
    DefaultResponse get() {
        return new DefaultResponse(counter++, "Hello World")
    }
}
