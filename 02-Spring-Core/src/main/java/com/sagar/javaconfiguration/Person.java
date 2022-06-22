package com.sagar.javaconfiguration;

public class Person {

    private int personId;
    private String city;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId = " + personId +
                ", city = '" + city + '\'' +
                '}';
    }
}
