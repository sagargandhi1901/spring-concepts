package com.sagar.javaconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class, Config2.class);

        Person bean = context.getBean("person", Person.class);
        System.out.println(bean);

        Student bean2 = context.getBean("student", Student.class);
        System.out.println(bean2);

        User bean3 = context.getBean("user", User.class);
        System.out.println(bean3);

        Teacher bean4 = context.getBean("teacher", Teacher.class);
        System.out.println(bean4);

        StudentService bean5 = context.getBean("studentService", StudentService.class);
        System.out.println(bean5);
    }
}
