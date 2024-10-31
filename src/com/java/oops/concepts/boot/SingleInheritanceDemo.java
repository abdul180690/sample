package com.java.oops.concepts.boot;

import com.java.oops.concepts.SubClass;
import com.java.oops.concepts.SuperClass;

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.addTwoNumbers(2,3);
        SubClass subClass = new SubClass();
        subClass.addTwoNumbers(4,5);
        superClass = new SubClass(); //litscov substitutes principles
        //subClass = new SuperClass();

        // SOLID PRINCIPLE
        // S - Single responsibility
        // O - Open for extension Close for modification
        // L - Litscov substitutes principles
        // I - Interface segregation principle
        // D - Dependency Injection principle
    }
}
