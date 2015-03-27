package com.dewaldv.gizzard

import com.dewaldv.gizzard.controllers.GreetingController
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class GizzardApplication extends Application<GizzardConfiguration> {

    public static void main(String[] args) {
        new GizzardApplication().run(args);
    }

    @Override
    void initialize(Bootstrap<GizzardConfiguration> bootstrap) {

    }

    @Override
    void run(GizzardConfiguration configuration, Environment environment) {
        environment.jersey().register(GreetingController.class)
    }
}
