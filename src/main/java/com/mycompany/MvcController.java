package com.mycompany;

import org.jooby.Result;
import org.jooby.Results;
import org.jooby.mvc.GET;
import org.jooby.mvc.Path;

@Path("/")
public class MvcController {
  
  @GET
  public Result helloworld() {
    return Results.html("helloworld");
  }
}
