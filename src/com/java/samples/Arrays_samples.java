package com.java.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Arrays_samples {
    //int x=10;
    public static void main(String[] args) {


        //next5_OddorEven();
//        array_Addition();
//        Array_2D();
//        Array_List();
//        Multi_Al();
//        Swap();
//        Find_Max();

    }

     void next5_OddorEven() {
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

    static void Array_2D(){
        Scanner in=new Scanner(System.in);
        int num[][]= new int[3][3];
        //getting the array values
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j]=in.nextInt();
            }
        }
//        System.out.println(Arrays.deepToString(num));
//        System.out.println(Arrays.toString(num[0]));
//        System.out.println(Arrays.toString(num[1]));
//        System.out.println(Arrays

        // showing the array values

//        for (int[] ints : num) {
//            System.out.println(Arrays.toString(ints));
//        }
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void Array_List(){
        Scanner in=new Scanner (System.in);
        // syntax
        // ArrayList<data_type> name = new ArrayList<>(size);
        ArrayList<Integer> list=new ArrayList<>(10);
//        list.add(34);
//        list.add(39);
//        list.add(78);
//        list.add(45);
//        list.add(23);
//        list.add(37);
//        list.add(67);
//        list.add(55);
//        list.add(45);
//        list.add(33);
//        list.add(3);
//        list.add(4);
//
//        System.out.println(list);
//        System.out.println(list.contains(37));
//        list.set(0, 90);
//        list.remove(2);
//        System.out.println(list);
//      input
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }

//      get item by any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }

        System.out.println(list);

    }

    static void Multi_Al(){
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        //initialisation
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        //add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }

    static void Swap(){
        int[] arr={1, 3, 23, 9, 18};
        int temp;
        int index1=0;
        int index2=1;

        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        System.out.println(Arrays.toString(arr));
    }

    static void Find_Max(){
        int[] arr={1, 3, 23, 9, 18};
        System.out.println(maxRange(arr,1,3));
    }

    //work on edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end){
        int maxVal=arr[start];
        for(int i=start; i<=end; i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }



}

