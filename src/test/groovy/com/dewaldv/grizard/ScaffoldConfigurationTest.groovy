package com.dewaldv.grizard

import org.junit.Test

import static org.hamcrest.CoreMatchers.not
import static org.hamcrest.CoreMatchers.nullValue
import static org.hamcrest.MatcherAssert.assertThat

class GrizardConfigurationTest {

    @Test
    void shouldBeConstructed() {
        def configuration = new GrizardConfiguration()
        assertThat(configuration, not(nullValue()))
    }
}
