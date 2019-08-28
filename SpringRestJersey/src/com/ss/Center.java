package com.ss;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

// http://localhost:8080/SpringRestJersey/rest/main
@Path(value = "/main")
public class Center {

            @GET
            public String name() {
                return "SS.555";
            }
}
