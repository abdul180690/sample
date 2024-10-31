package com.java.samples;
import java.util.Scanner;
public class Fibonacci_Series {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        int count=2;
        System.out.println("Enter the number to find the Fibonacci Series: ");
        int n= sc.nextInt();
//        while(count<=n){
//            int temp=b;
//            b=b+a;
//            a=temp;
//            count++;
//        }
        for(int i=2;i<=n;i++){
            int temp=b;
            b=b+a;
            a=temp;
        }
        System.out.println(b);
    }
}
