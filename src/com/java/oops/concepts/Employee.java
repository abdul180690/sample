package com.java.oops.concepts;

public class Employee {
    static int x=10;
    public static void getSalary(){

    }
    public static void getName(){
        getSalary();
        x=11;
        System.out.println("My name is abdullah");
    }
    public void getNameAndAge(String name,int y){
        getName();
        x=12;
        System.out.println("My name is "+name+"age is "+x);
    }

}
