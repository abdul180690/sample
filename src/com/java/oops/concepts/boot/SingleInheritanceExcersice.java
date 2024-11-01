package com.java.oops.concepts.boot;

import com.java.oops.concepts.Course;

public class SingleInheritanceExcersice {
    public static void main(String[] args) {
        Course c=new Course();
        c.studentEnrolled("C++","Mohamed");
        System.out.println();
        c.studentEnrolled("C","Abdullah");
        System.out.println();
        c.studentEnrolled("Python","Riyas");
        System.out.println();
        c.studentEnrolled("Java","Ahamed");
    }
}
