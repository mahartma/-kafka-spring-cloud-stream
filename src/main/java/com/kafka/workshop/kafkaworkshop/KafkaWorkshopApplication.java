package com.kafka.workshop.kafkaworkshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class KafkaWorkshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaWorkshopApplication.class, args);
    }

    @Bean
    public Consumer<String> myConsumer() {
        return (value) -> System.out.println("Consumer Received : " + value);
    }
}
