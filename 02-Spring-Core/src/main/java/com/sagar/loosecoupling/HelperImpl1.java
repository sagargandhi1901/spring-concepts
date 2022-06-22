package com.sagar.loosecoupling;

import org.springframework.stereotype.Component;

@Component("helperImpl1")
public class HelperImpl1 implements Helper {

    @Override
    public void help() {
        System.out.println("Helping first time");
    }
}
