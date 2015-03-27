package com.dewaldv.gizzard

import org.junit.Test

import static org.hamcrest.CoreMatchers.not
import static org.hamcrest.CoreMatchers.nullValue
import static org.hamcrest.MatcherAssert.assertThat

class GizzardConfigurationTest {

    @Test
    void shouldBeConstructed() {
        def configuration = new GizzardConfiguration()
        assertThat(configuration, not(nullValue()))
    }
}
