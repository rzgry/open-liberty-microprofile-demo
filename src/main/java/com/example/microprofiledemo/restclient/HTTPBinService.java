package com.example.microprofiledemo.restclient;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RegisterRestClient
@ApplicationScoped
public interface HTTPBinService {

    @GET
    @Path("/status/200")
    String ok();

    @GET
    @Path("/status/404")
    String notFound();

    @GET
    @Path("/status/500")
    String internalServerError();

}
