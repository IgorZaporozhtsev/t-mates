package com.zeecoder.tmates

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class MyFirstPr{

    @Test
    fun `should eq3`(){

        val size = 3
        assertThat(size).isGreaterThanOrEqualTo(3)

    }
}