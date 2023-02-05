// Java Program to Illustrate Task Configuration

package com.anuanu.springjms.config;

// Importing required classes
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

// Annotations
@EnableScheduling
@EnableAsync
@Configuration

// Class
public class TaskConfig {

    // Task Configuration
    @Bean TaskExecutor taskExecutor()
    {
        return new SimpleAsyncTaskExecutor();
    }

    // taskExecutor bean is injected into spring context,
    // and spring will use it to execute tasks for us
}