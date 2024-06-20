package com.microservices;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by mahbub.islam on 20/6/2024.
 */
@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaServiceApplication.class);
    }

    @Override
    public void run(String... args) {
        System.out.println("App Starts...");
    }
}
