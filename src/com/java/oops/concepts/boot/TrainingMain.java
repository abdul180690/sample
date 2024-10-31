package com.java.oops.concepts.boot;

import com.java.oops.concepts.AddNumbers;

public class TrainingMain {
    public static void main(String[] args) {
        AddNumbers addNumber;//reference variable
        AddNumbers addNumbers = new AddNumbers();
        int x=10,y=20;
        float a=10.0f,b=20.0f;
        addNumbers.addNumbers(x,y);
        float z=addNumbers.addNumbers(a,b);
        System.out.println("Float="+z);
    }
}
