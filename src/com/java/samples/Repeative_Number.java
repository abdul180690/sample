package com.java.samples;
import java.util.Scanner;
public class Repeative_Number {
    public static void main(String[] args){
        int n;
        int count=0;
        int f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the series of numbers with repetitive number: ");
        n=sc.nextInt();
        System.out.println("Enter the number to find: ");
        f=sc.nextInt();
//        while(n>0){
//            int rem=n%10;
//            if(rem==f){
//                count++;
//            }
//            n=n/10;
//        }
        for(int i=0; i<n; i++){
            int rem=n%10;
            if(rem==f){
                count++;
            }
            n=n/10;
        }
        System.out.println("The number "+f+" found "+count+" times");
    }
}
