package com.kuku.purim;

import java.util.*;

public abstract class  Employee {
    private String firstName;
    private String lastName;
    private final int id;

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    public Employee() {
        this.setFirstName("Plony");
        this.setLastName("Almony");
        this.id = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() &&
                getFirstName().equals(employee.getFirstName()) &&
                getLastName().equals(employee.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getId());
    }

    public Employee(String firstName, String lastName, int id) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }
    public abstract double earnings();
}
