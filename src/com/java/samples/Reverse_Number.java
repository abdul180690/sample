package com.java.samples;
import java.util.Scanner;
public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int ans=0;
        System.out.print("Enter the number to reverse: ");
        n=sc.nextInt();
//        while(n>0){
//            int rem=n%10;
//            n=n/10;
//            ans=ans*10+rem;
//        }
        for(int i=0;i<n;i++){
            int rem=n%10;
            n=n/10;
            ans=ans*10+rem;
        }
        System.out.println("Reverse order: "+ans);
    }
}
