package com.dewaldv.scaffold

import org.junit.Test

import static org.hamcrest.CoreMatchers.not
import static org.hamcrest.CoreMatchers.nullValue
import static org.hamcrest.MatcherAssert.assertThat

class ScaffoldConfigurationTest {
    @Test
    void shouldBeConstructed() {
        def configuration = new ScaffoldConfiguration()
        assertThat(configuration, not(nullValue()))
    }
}
