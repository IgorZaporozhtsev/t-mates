//package com.zeecoder.tmates.service
//
//import org.springframework.kafka.annotation.KafkaListener
//import org.springframework.stereotype.Component
//
//@Component
//class Consumer {
//
//    @KafkaListener(topics = ["EVENT_TOPIC"], groupId = "group_id")
//    fun consumeMessage(message: String){
//        print(message)
//    }
//}