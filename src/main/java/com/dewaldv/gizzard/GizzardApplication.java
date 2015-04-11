package com.dewaldv.gizzard;

import com.dewaldv.gizzard.resources.GreetingResource;
import io.dropwizard.Application;
import io.dropwizard.java8.Java8Bundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

class GizzardApplication extends Application<GizzardConfiguration> {

    public static void main(String[] args) throws Exception {
        new GizzardApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<GizzardConfiguration> bootstrap) {
        bootstrap.addBundle(new Java8Bundle());
    }

    @Override
    public void run(GizzardConfiguration configuration, Environment environment) {
        final GreetingResource greetingResource = new GreetingResource(
                configuration.getDefaultName()
        );
        environment.jersey().register(greetingResource);
    }
}
