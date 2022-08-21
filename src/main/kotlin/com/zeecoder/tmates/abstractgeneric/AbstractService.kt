package com.zeecoder.tmates.abstractgeneric


abstract class AbstractService<T>(
    open val repo: Repository<T>
) {
    fun toCache(param: List<String>, data: T){
        val key = assembleKey(param)
        repo.map?.put(key, data)
    }

    fun fromCache(parameters: List<String>): T?{
        val assembleKey = assembleKey(parameters)
        return repo.map?.get(assembleKey)
    }

    fun assembleKey(param: List<String>): String{
        return param.joinToString("_")
    }


}