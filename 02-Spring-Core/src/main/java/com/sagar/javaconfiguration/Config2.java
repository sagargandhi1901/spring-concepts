package com.sagar.javaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {

    @Bean("user")
    public User getUser() {
        User user = new User();
        user.setUserName("Gandhi");

        return user;
    }
}
