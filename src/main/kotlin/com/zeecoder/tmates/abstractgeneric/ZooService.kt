package com.zeecoder.tmates.abstractgeneric

import org.springframework.stereotype.Component

@Component
class ZooService(
    override val repo: Repository<Pair<String, String>>
): AbstractService<Pair<String, String>>(repo) {

    fun invoke(parameters: List<String>){
        val fromCache = fromCache(parameters)
        println("invoke-fromCache: $fromCache")
        val pair = fromCache ?: calculate(parameters)
        println("invoke-calculate: $pair")
    }

    fun calculate(parameters: List<String>): Pair<String, String>{
        val pair = Pair("one", "two")
        toCache(parameters, pair)
        return pair
    }
}
