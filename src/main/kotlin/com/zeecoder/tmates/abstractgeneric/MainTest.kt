package com.zeecoder.tmates.abstractgeneric

fun main() {
    val repo1 = Repository<Pair<String, String>>()
    val repo2 = Repository<List<Pair<String, String>>>()

    val zooService = ZooService(repo1)
    zooService.invoke(listOf("jis", "lam"))
    zooService.invoke(listOf("jis", "lam"))

}