package com.java.samples;

import java.util.Scanner;

public class For_Loop_Samples {
    public static void main(String[] args){
        // for loop executes a block of code a limited amount of times
//        for(int i=0;i<=10;i++){
//            System.out.println(i);
//        }
//        System.out.println();
//        for(int i=10;i>=0;i--){
//            System.out.println(i);
//        }

// Nested loop - a loop inside of a loop
    Scanner sc=new Scanner(System.in);
    int row;
    int column;
    String symbol;

    System.out.println("Enter the no of rows: ");
    row=sc.nextInt();
    System.out.println("Enter the no of columns: ");
    column=sc.nextInt();
    System.out.println("Enter the Symbol : ");
    symbol=sc.next();
    for(int i=1;i<=row;i++){
        System.out.println();
        for(int j=1;j<=column;j++){
            System.out.print(" "+symbol);
        }
    }
    }
}
