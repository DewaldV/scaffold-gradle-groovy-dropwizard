package com.dewaldv.grizard

import com.dewaldv.grizard.controllers.DefaultController
import io.dropwizard.jersey.setup.JerseyEnvironment
import io.dropwizard.setup.Environment
import org.junit.Before
import org.junit.Test

import static org.mockito.Mockito.*

class GrizardApplicationTest {

    def application = new GrizardApplication()
    def envMock = mock(Environment.class)
    def jerseyMock = mock(JerseyEnvironment.class)

    @Before
    void setup() {
        when(envMock.jersey()).thenReturn(jerseyMock);
    }

    @Test
    void shouldRegisterDefaultController() {
        def conf = new GrizardConfiguration()
        application.run(conf, envMock)
        verify(jerseyMock, atLeastOnce()).register(DefaultController.class)
    }
}
