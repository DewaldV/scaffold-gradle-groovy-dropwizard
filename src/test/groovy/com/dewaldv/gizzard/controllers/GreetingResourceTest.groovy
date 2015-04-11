package com.dewaldv.gizzard.resources

import org.junit.Test

import static org.hamcrest.CoreMatchers.is
import static org.hamcrest.MatcherAssert.assertThat

class GreetingResourceTest {

    @Test
    void shouldReturnDefaultResponse() {
        def defaultController = new GreetingResource(defaultName)
        def response = defaultController.get()
        assertThat(response.id, is(0))
        assertThat(response.name, is("Hello World"))
    }
}

