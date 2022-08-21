package com.zeecoder.tmates.experement

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class TestCatService(@Qualifier("catRepo") animalRepo: AnimalRepo): AbstractAnimal(animalRepo)