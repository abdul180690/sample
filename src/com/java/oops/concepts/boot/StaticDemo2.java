package com.java.oops.concepts.boot;

import com.java.oops.concepts.Employees;

public class StaticDemo2 {
    public static void main(String[] args){
        Employees.setCompName("ABC Pvt Ltd");
        Employees e1=new Employees("Mohamed");
        Employees e2=new Employees("Abdullah");
        e1.getEmployeeInfo();
        System.out.println();
        e2.getEmployeeInfo();
    }
}
