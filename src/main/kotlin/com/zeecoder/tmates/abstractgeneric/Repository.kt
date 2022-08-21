package com.zeecoder.tmates.abstractgeneric

import org.springframework.stereotype.Component

@Component
class Repository<T> {

    val map: MutableMap<String, T>? = mutableMapOf()

}