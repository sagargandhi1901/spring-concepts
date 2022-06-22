package com.sagar.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        StudentService bean = context.getBean("studentService", StudentService.class);
        bean.getHelper().help();
    }
}
