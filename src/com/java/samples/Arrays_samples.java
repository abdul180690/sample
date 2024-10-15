package com.java.samples;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_samples {
    public static void main(String[] args) {

    //    next5_OddorEven();
        array_Addition();
    }

    static void next5_OddorEven() {
        int[] arr= new int[5];
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt()+2;
        for(int i=0;i<arr.length;i++){
            arr[i]=input;
            input += 2;         // input=input+2
        }
        System.out.println("The next five Odd / Even numbers are below. ");
        for(int i=0; i<arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println(Arrays.toString(arr));               //another method to print arrays by converting into string
        for (int a : arr) {                                     // Enhanced for loop
            System.out.print(a+" ");
        }
    }
    static void array_Addition(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Size of the Arrays: ");
        int size=in.nextInt();
        int[] a1=new int[size];
        int[] a2=new int[size];
        int[] result=new int[size];
        System.out.println("Enter Value for the First Array: ");
        for(int i=0;i<size;i++) {
            System.out.print("Value at index " + i + ": ");
            a1[i] = in.nextInt();
        }
        System.out.println("Enter the second array values: ");
        for(int i=0;i<size;i++) {
            System.out.print("Value at index " + i + ": ");
            a2[i] = in.nextInt();
        }
        for(int i=0;i<size;i++) {
            result[i]=a1[i]+a2[i];
        }
        System.out.print("Result : " + Arrays.toString(result) );
    }
}
