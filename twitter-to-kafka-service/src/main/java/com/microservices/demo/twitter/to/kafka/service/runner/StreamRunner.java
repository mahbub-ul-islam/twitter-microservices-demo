package com.microservices.demo.twitter.to.kafka.service.runner;

import twitter4j.TwitterException;

/**
 * Created by mahbub.islam on 22/6/2024.
 */
public interface StreamRunner {
    void start() throws TwitterException;
}
