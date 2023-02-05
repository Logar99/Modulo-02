// Java Program to Illustrate Receiving JMS Messages

package com.anuanu.springjms.listener;

// Importing required classes
import com.anuanu.springjms.config.JmsConfig;
import com.anuanu.springjms.model.GreetingMessage;
import javax.jms.Message;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

// Annotation
@Component

// Class
public class MessageListener {

    @JmsListener(destination = JmsConfig.QUEUE)

    public void
    listen(@Payload GreetingMessage greetingMessage,
           @Headers MessageHeaders messageHeaders,
           Message message)
    {

        // Display command
        System.out.println("Greeting Received!!!");

        System.out.println(greetingMessage);
    }
}