package com.sagar.loosecoupling;

import org.springframework.stereotype.Component;

@Component("helperImpl2")
public class HelperImpl2 implements Helper {

    @Override
    public void help() {
        System.out.println("Helping second time");
    }
}
