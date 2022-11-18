package com.exercise.base;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.exercise.base.actor.EchoActor;

/**
 * @author eddie.lys
 * @since 2022/11/17
 */
public class AkkaBaseMain {

    public static void main(String[] args) {

        ActorSystem system = ActorSystem.create("app");
        ActorRef echoActor = system.actorOf(Props.create(EchoActor.class), "echoActor");
        echoActor.tell("st", ActorRef.noSender());
        echoActor.tell("st", ActorRef.noSender());
        echoActor.tell("st", ActorRef.noSender());
        echoActor.tell("st", ActorRef.noSender());

    }
}
