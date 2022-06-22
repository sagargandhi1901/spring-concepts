package com.sagar.javaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.sagar.javaconfiguration"})
public class Config {

    @Bean("person")
    public Person getPerson() {
        Person person = new Person();
        person.setPersonId(123);
        person.setCity("Pune");

        return person;
    }

    @Bean("student")
    public Student getStudent() {
        Student student = new Student();
        student.setName("Sagar");

        return student;
    }
}
