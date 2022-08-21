package com.zeecoder.tmates.service

import com.fasterxml.jackson.databind.ObjectMapper
import com.zeecoder.tmates.model.CustomerAccount
import org.apache.kafka.clients.producer.ProducerRecord
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component


@Component
class Producer
(
    private val kafkaTemplate: KafkaTemplate<String, String>,
)
{
    val eventTopic: String = "EVENT_TOPIC"
    private val mapper: ObjectMapper = ObjectMapper()

    @Async
    fun publishCommand(account: CustomerAccount) {
        val commandMsg = mapper.writeValueAsString("send plain text to kafka topic")
        //kafkaTemplate.send(commandTopic, "some info", commandMsg.toByteArray().toString())
        val account = """{
  "customerUuid" : "d2941ce7-4ce0-4d61-a329-c5d3b481beca",
  "accountUuid" : "d2941ce7-4ce0-4d61-a329-c5d3b481beca",
  "accountName" : "test automation account",
  "individual" : true,
  "accountType" : "PREPAID",
  "accountStatus" : "ACTIVE",
  "currencyId" : "USD",
  "parentAccount" : "23ebea46-2bf5-4847-a130-1fabf09e4269",
  "offers" : {
    "primaryOfferId" : "44b6d9a0-38e0-4ac0-be73-548fda565bfd",
    "addOnOffersIds" : [ "bad546ba-dd42-4faf-b4a5-1a77e349bd1d" ]
  }
}"""

        val record = ProducerRecord<String, String>(eventTopic, "ACCOUNT_CREATE", account)
        record.headers().add("Spring", "Boot".toByteArray())

        kafkaTemplate.send(  record)


        print(account)
        //kafkaTemplate.send(eventTopic, "account", account)
    }
}