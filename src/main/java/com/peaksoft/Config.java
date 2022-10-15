package com.peaksoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


    @Configuration
    @ComponentScan(basePackages = "com.peaksoft")
    @PropertySource("classpath:app.properties")
    public class Config {

        @Bean
        Horse horse() {
            return new Horse();
        }

        @Bean
        Parrot parrot() {
            return new Parrot();
        }

        @Bean
        Person person() {
            return new Person(horse());

    }

}
