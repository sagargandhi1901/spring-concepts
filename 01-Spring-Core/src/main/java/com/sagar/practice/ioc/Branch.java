package com.sagar.practice.ioc;

public class Branch {

    private String name;
    private Student student;

    public Branch() {
    }

    public Branch(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Branch {" +
                "name = '" + name + '\'' +
                ", student = " + student +
                '}';
    }
}
