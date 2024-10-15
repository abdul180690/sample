package com.java.samples;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_samples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr= new int[5];
        System.out.println("Enter the number: ");
        int input=sc.nextInt()+2;
        for(int i=0;i<arr.length;i++){
            arr[i]=input;
            input += 2;         // input=input+2
        }
        System.out.println("The next five Odd / Even numbers are below. ");
        for(int i=0; i<arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println(Arrays.toString(arr));               //another method to print arrays by converting into string
    }
}
