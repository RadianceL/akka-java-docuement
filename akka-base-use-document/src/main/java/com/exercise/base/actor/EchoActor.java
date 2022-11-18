package com.exercise.base.actor;

import akka.actor.AbstractActor;

/**
 * @author eddie.lys
 * @since 2022/11/17
 */
public class EchoActor extends AbstractActor {
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(String.class, s -> {
                    System.out.println("Received String message: " +  s);
                })
                .matchAny(o -> System.out.println("Received unknown message"))
                .build();
    }
}
