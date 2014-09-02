package com.dewaldv.scaffold

import com.dewaldv.scaffold.controllers.DefaultController
import io.dropwizard.jersey.setup.JerseyEnvironment
import io.dropwizard.setup.Environment
import org.junit.Before
import org.junit.Test

import static org.mockito.Mockito.atLeastOnce
import static org.mockito.Mockito.mock
import static org.mockito.Mockito.when
import static org.mockito.Mockito.verify

class ScaffoldApplicationTest {

    def application = new ScaffoldApplication()
    def envMock = mock(Environment.class)
    def jerseyMock = mock(JerseyEnvironment.class)

    @Before
    void setup() {
        when(envMock.jersey()).thenReturn(jerseyMock);
    }

    @Test
    void shouldRegisterDefaultController() {
        def conf = new ScaffoldConfiguration()
        application.run(conf, envMock)
        verify(jerseyMock, atLeastOnce()).register(DefaultController.class)
    }
}
