package com.java.oops.concepts;

public class AddNumbers {
    int x,y;// instance variable
    static int a,b;// class variable /static variable
    public AddNumbers(){
        System.out.println("Loading my class");
    }
    public void addNumbers(int x,int y){
        int z=x+y;
        System.out.println("Addition="+z);
    }
    public float addNumbers(float x,float y){
        float z=x+y;
        return z;
    }
}
