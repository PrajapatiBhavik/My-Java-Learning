package com.springframework.avoidXml;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationcConfig
{
    @Bean
    public Student student()
    {
        return new Student();
    }
}
