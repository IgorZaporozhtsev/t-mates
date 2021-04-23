package com.zeecoder.tmates

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

internal class TempTest{

    @Test
    fun `should eq3`(){

        val size = 3
        assertThat(size).isGreaterThanOrEqualTo(3)

    }
}