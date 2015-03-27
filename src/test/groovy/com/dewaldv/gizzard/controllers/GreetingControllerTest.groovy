package com.dewaldv.gizzard.controllers

import org.junit.Test

import static org.hamcrest.CoreMatchers.is
import static org.hamcrest.MatcherAssert.assertThat

class GreetingControllerTest {

    @Test
    void shouldReturnDefaultResponse() {
        def defaultController = new GreetingController()
        def response = defaultController.get()
        assertThat(response.id, is(0))
        assertThat(response.content, is("Hello World"))
    }
}

