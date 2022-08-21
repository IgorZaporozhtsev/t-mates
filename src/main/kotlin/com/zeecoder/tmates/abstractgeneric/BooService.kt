package com.zeecoder.tmates.abstractgeneric

import org.springframework.stereotype.Component

@Component
class BooService(
    override val repo: Repository<List<Pair<String, String>>>
): AbstractService<List<Pair<String, String>>>(repo) {

    fun getCache(){
        val parameters = listOf("jis", "lam")

        val calculate = calculate("one", "two")
        toCache(parameters, calculate)

    }


    fun calculate(one: String, two: String): List<Pair<String, String>>{
        return listOf(Pair(one, two))
    }
}