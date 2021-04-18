package com.zeecoder.tmates.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/meet")
class MeetingController {

    @GetMapping
    fun getMeetings(): List<String>{
        return listOf("poker", "football" , "mafia")
    }
}