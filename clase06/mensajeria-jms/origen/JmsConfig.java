// Java Program to Illustrate Task Configuration

package config;

// Importing required classes
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

// Annotations
@Configuration

// Class
public class JmsConfig<MappingJackson2MessageConverter> {

    // Class data member
    public static final String QUEUE = "greet";

    // Annotation
    @Bean

    // Class
    public Object messageConverter()
    {

        MappingJackson2MessageConverter converter
                = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");

        return converter;
    }

    // Enabling spring to take jms messages and flip it
    // to a json message. then it can read
    // that jms message as a jms text message and
    // convert it back to java object
}

