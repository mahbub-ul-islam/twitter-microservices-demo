package com.microservices.demo.twitter.to.kafka.service.exception;

/**
 * Created by mahbub.islam on 24/6/2024.
 */
public class TwitterToKafkaServiceException extends RuntimeException {

    public TwitterToKafkaServiceException() {
        super();
    }

    public TwitterToKafkaServiceException(String message) {
        super(message);
    }

    public TwitterToKafkaServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}

















