package com.rupak.controller;

import com.rupak.Echo;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("ping")
@RequestScoped
@Named
public class ResourceController {

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response echo(){
        return Response.ok(new Echo("Hello Docker World")).build();
    }
}
