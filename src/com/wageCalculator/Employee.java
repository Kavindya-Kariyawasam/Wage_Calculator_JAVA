package com.wageCalculator;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;    //Declaring a static field.
    // These are used when the value is independent of the objects where it is shared across all objects.

    public Employee(int baseSalary, int hourlyRate) {   //Here we have created a custom constructor instead of default constructor created by JAVA compiler
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;    //This increments the number of employees each time we create an Employee object.
    }
    public Employee(int baseSalary) {
        this(baseSalary,0);
    }

    public static void printNumberOfEmployees() {    //Declaring a static method.
        System.out.println("Number of employees : " + numberOfEmployees);
    }


    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }
    public int calculateWage() {
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary<=0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate<0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative.");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}
