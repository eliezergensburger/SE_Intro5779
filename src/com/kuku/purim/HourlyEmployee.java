package com.kuku.purim;

import java.util.Objects;

public class HourlyEmployee extends  Employee {
    private int hours;
    private double wage;

    public HourlyEmployee() {
        super();
        this.hours = 0;
        this.wage = 0;
    }

    public HourlyEmployee(String firstName, String lastName, int id, int hours, double wage) {
        super(firstName, lastName, id);
        this.hours = hours;
        this.wage = wage;
    }

    @Override
    public String toString() {
        String result =super.toString();
        result += "\n";
        result +="HourlyEmployee{" +
                "hours=" + hours +
                ", wage=" + wage +
                '}';
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HourlyEmployee)) return false;
        if (!super.equals(o)) return false;
        HourlyEmployee that = (HourlyEmployee) o;
        return getHours() == that.getHours() &&
                Double.compare(that.getWage(), getWage()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHours(), getWage());
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public double earnings() {
        return hours * wage;
    }
}
