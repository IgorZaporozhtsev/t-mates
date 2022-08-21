package com.zeecoder.tmates.controller

import com.zeecoder.tmates.model.CustomerAccount
import com.zeecoder.tmates.service.Producer
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/meet")
class MeetingController(
    val producer: Producer
) {

    @GetMapping
    fun getMeetings(): List<String>{
        return listOf("poker", "football" , "mafia")
    }

    @PostMapping("/publish")
    fun messageToTopic(@RequestBody account: CustomerAccount) = producer.publishCommand(account)

}