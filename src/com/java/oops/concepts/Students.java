package com.java.oops.concepts;

public class Students {
    int rollNo=0;
    String sName;
    String courseName;
    public String getStudentName(String sName){
        this.sName=sName;
        return sName;
    }

    public int countRollNo(){
        this.rollNo++;
        return this.rollNo;
    }
}
