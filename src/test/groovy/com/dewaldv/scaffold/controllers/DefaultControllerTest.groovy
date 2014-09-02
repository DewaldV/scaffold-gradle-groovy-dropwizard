package com.dewaldv.scaffold.controllers

import org.junit.Test

import static org.hamcrest.CoreMatchers.is
import static org.hamcrest.MatcherAssert.assertThat

class DefaultControllerTest {

    @Test
    void shouldReturnDefaultResponse() {
        def defaultController = new DefaultController()
        def response = defaultController.get()
        assertThat(response.id, is(0))
        assertThat(response.content, is("Hello World"))
    }
}

