package com.java.oops.concepts;

public class PrintNumbers {
    public static void numbersPrint(int n){
        if(n == 10){
            System.out.println(10);
            return;
        }
        System.out.println(n);
        numbersPrint(n+1);
    }
}
