package com.ralphigi.tutorial;

import com.ralphigi.tutorial.resources.EventResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class eventsApplication extends Application<eventsConfiguration> {

    public static void main(final String[] args) throws Exception {
        new eventsApplication().run(args);
    }

    @Override
    public String getName() {
        return "events";
    }

    @Override
    public void initialize(final Bootstrap<eventsConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final eventsConfiguration configuration,
                    final Environment environment) {
        EventResource eventResource = new EventResource();
        environment.jersey().register(eventResource);
    }

}
