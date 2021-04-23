package com.zeecoder.tmates

import com.zeecoder.tmates.service.TestService
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class MyFirstPr{

    @Test
    fun `should eq3`(){

        val service = TestService()

        val a = 3
        val b = 3

        assertThat(service.sum(a, b)).isEqualTo(6)

    }
}