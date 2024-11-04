package com.java.oops.concepts.boot;

import com.java.oops.concepts.Employee;

public class StaticDemo {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.getNameAndAge("Abdullah", 34);
        Employee.getName();

    }
}
