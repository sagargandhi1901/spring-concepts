package com.sagar.practice.autowiring;

public class EmployeeService {

    private Employee employee;
    private Address address;

    public EmployeeService() {
    }

    public EmployeeService(Employee employee, Address address) {
        this.employee = employee;
        this.address = address;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeService{" +
                "employee = " + employee +
                ", address = " + address +
                '}';
    }
}
