package com.zeecoder.tmates.service

import org.springframework.stereotype.Service

@Service
class TestService {

    fun sum(a: Int, b: Int): Int{
        return a + b;
    }
}