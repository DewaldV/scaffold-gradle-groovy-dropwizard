package com.dewaldv.gizzard

import com.dewaldv.gizzard.resources.GreetingResource
import io.dropwizard.jersey.setup.JerseyEnvironment
import io.dropwizard.setup.Environment
import org.junit.Before
import org.junit.Test

import static org.mockito.Mockito.mock
import static org.mockito.Mockito.when
import static org.mockito.Mockito.verify
import static org.mockito.Mockito.atLeastOnce

class GizzardApplicationTest {

    def application = new GizzardApplication()
    def envMock = mock(Environment.class)
    def jerseyMock = mock(JerseyEnvironment.class)

    @Before
    void setup() {
        when(envMock.jersey()).thenReturn(jerseyMock);
    }

    @Test
    void shouldRegisterDefaultController() {
        def conf = new GizzardConfiguration()
        application.run(conf, envMock)
        verify(jerseyMock, atLeastOnce()).register(GreetingResource.class)
    }
}
