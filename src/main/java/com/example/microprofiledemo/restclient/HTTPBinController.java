package com.example.microprofiledemo.restclient;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/service")
@ApplicationScoped
public class HTTPBinController {

    @Inject
	@RestClient
    private HTTPBinService service;

    @GET
    @Path("/200")
    public String ok() {
        return service.ok();
    }

    @GET
    @Path("/404")
    public String notFound() {
        return service.notFound();
    }

    @GET
    @Path("/500")
    public String internalServerError() {
        return service.internalServerError();
    }
}
