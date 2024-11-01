package com.java.oops.concepts;

import javax.swing.plaf.IconUIResource;

public class Course extends Students {
    String courseName;
    public String getCourse(String courseName){
        this.courseName=courseName;
        return courseName;
    }
    public void studentEnrolled(String courseName,  String sName){
        System.out.println("Course Name: "+getCourse(courseName));
        System.out.println("Student Roll No : "+countRollNo());
        System.out.println("Student Name: "+getStudentName(sName));
    }
}
