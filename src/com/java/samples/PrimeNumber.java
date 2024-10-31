package com.java.samples;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        int num;
        int c=2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find Prime or Not : ");
        num=sc.nextInt();
        if(num<=1){
            System.out.println("Its a Prime Number");
        }

        while(c*c<=num){
            if(num%c==0){
                System.out.println("Its Not a Prime Number");
            }
            c += 1;
        }
        System.out.println("Its a Prime Number");
    }
}
