package com.sagar.loosecoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("studentService")
public class StudentService {

    @Autowired
    @Qualifier("helperImpl2")
    private Helper helper;

    public Helper getHelper() {
        return helper;
    }

    public void setHelper(Helper helper) {
        this.helper = helper;
    }
}
