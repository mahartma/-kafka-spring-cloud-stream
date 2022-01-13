package com.kafka.workshop.kafkaworkshop;

import org.apache.kafka.streams.kstream.KStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class KafkaWorkshopApplication {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaWorkshopApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(KafkaWorkshopApplication.class, args);
    }

    @Bean
    public Consumer<String> myConsumer() {
        return (value) -> System.out.println("Consumer Received : " + value);
    }

    /*@Bean
    public Consumer<KStream<Object, String>> myConsumer() {
        return input -> input
                .groupBy((key, value) -> value)
                .count()
                .toStream().foreach((key, value) -> LOG.info("Value: " + key + ", Count: " + value));
    }*/
}
