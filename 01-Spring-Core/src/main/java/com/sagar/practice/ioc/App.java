package com.sagar.practice.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");

        Student bean1 = context.getBean("student", Student.class);
        System.out.println(bean1);

        Branch bean2 = context.getBean("branch", Branch.class);
        System.out.println(bean2);
    }
}
