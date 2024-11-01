package com.java.oops.concepts;

public class Employees {
    String name;
    int empId;
    static String compName;
    static int count=0;

    public Employees(String name){
        this.name=name;
        this.empId=setEmpId();
    }

    static int setEmpId(){
        count++;
        return count;
    }
    public static void setCompName(String name){
        compName=name;
    }
    public void getEmployeeInfo(){
        System.out.println("Name : "+this.name);
        System.out.println("Employee ID : "+this.empId);
        System.out.println("Company Name : "+compName);
    }
}
