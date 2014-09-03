package com.dewaldv.grizard

import com.dewaldv.grizard.controllers.DefaultController
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class GrizardApplication extends Application<GrizardConfiguration> {

    public static void main(String[] args) {
        new GrizardApplication().run(args);
    }

    @Override
    void initialize(Bootstrap<GrizardConfiguration> bootstrap) {

    }

    @Override
    void run(GrizardConfiguration configuration, Environment environment) {
        environment.jersey().register(DefaultController.class)
    }
}
