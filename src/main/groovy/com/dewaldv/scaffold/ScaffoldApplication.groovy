package com.dewaldv.scaffold

import com.dewaldv.scaffold.controllers.DefaultController
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class ScaffoldApplication extends Application<ScaffoldConfiguration> {

    public static void main(String[] args) {
        new ScaffoldApplication().run(args);
    }

    @Override
    void initialize(Bootstrap<ScaffoldConfiguration> bootstrap) {

    }

    @Override
    void run(ScaffoldConfiguration configuration, Environment environment) {
        environment.jersey().register(DefaultController.class)
    }
}
