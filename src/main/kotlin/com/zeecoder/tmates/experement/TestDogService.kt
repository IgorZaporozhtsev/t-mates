package com.zeecoder.tmates.experement

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class TestDogService(@Qualifier("dogRepo") animalRepo: AnimalRepo): AbstractAnimal(animalRepo)
