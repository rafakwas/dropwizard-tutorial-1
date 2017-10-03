package com.ralphigi.tutorial.resources;

import com.ralphigi.tutorial.api.Event;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Path("events")
@Produces(MediaType.APPLICATION_JSON)
public class EventResource {
    @GET
    public List<Event> allEvents() {
        Event e = new Event();
        e.setDate(new Date());
        e.setDescription("Wydarzenia w Kolbuszowej");
        e.setId(1L);
        e.setLocation("Kolbuszowa");
        e.setName("Kolbuszowa events");
        return Collections.singletonList(e);
    }
}
