package ex42.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Bao Kastan
 */

public class Person {
    private String firstName;
    private String lastName;
    private String salary;

    public Person(String newLastName, String newFirstName, String newSalary) {
        this.lastName = newLastName;
        this.firstName = newFirstName;
        this.salary = newSalary;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(String newSalary){
        this.salary = newSalary;
    }

    public String getSalary(){
        return salary;
    }
}
