// Java Program to Illustrate Sending JMS Messages

package com.anuanu.springjms.sender;

// Importing required classes
import com.anuanu.springjms.config.JmsConfig;
import com.anuanu.springjms.model.GreetingMessage;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

// Annotations
@RequiredArgsConstructor
@Component

// Class
public class MessageSender {

    // Class data member
    private final JmsTemplate jmsTemplate;
    private static Integer ID = 1;

    // Annotation
    @Scheduled(fixedRate = 2000)

    // Method
    public void sendMessage()
    {
        // Display command
        System.out.println("Greetings user");

        GreetingMessage message
                = GreetingMessage.builder()
                .id(UUID.randomUUID())
                .message("Greetings user " + ID++)
                .build();

        jmsTemplate.convertAndSend(JmsConfig.QUEUE,
                message);

        // Display command
        System.out.println("Message sent!!!");
    }
}
