package com.zeecoder.tmates.experement


abstract class AbstractAnimal(private val animalRepo: AnimalRepo?) {

    fun test(animal: Animal){
        animalRepo?.add(animal)
    }

}