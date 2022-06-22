package com.sagar.practice.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");

        EmployeeService bean = context.getBean("employeeService", EmployeeService.class);
        System.out.println(bean);
    }
}
