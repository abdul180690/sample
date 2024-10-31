package com.java.oops.concepts.boot;
import com.java.oops.concepts.ArithmeticOperations;
import java.util.Scanner;


public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Simple Calculator used 1. Integer / 2. Float :");
        int choice=in.nextInt();
        switch (choice) {
            case 1:
                intCalculator();
                break;
            case 2:
                floatCalculator();
                break;
            default:
                System.out.println("Wrong choice");
        }
    }

    static void intCalculator(){
        int a,b;
        ArithmeticOperations arithmeticOperations=new ArithmeticOperations();
        Scanner in=new Scanner(System.in);
        System.out.println("Simple Calculator by Integer values");
        System.out.println("===================================");
        System.out.println("Enter the first number:");
        a=in.nextInt();
        System.out.println("Enter the second number:");
        b=in.nextInt();
        System.out.println("Select the operation by selecting the number. ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice=in.nextInt();
        switch (choice){
            case 1: System.out.println("Addition Value :"+arithmeticOperations.addition(a,b));
                    break;
            case 2: System.out.println("Subtraction Value :"+arithmeticOperations.subtraction(a,b));
                    break;
            case 3: System.out.println("Multiplication Value :"+arithmeticOperations.multiplication(a,b));
                    break;
            case 4:
                    if(a<b){
                        System.out.println("Cannot show the result hence number 1 smaller than number 2");
                    }
                    System.out.println("Division Value :"+arithmeticOperations.division(a,b));
                    break;
            default: System.out.println("xxx Wrong choice xxx");
        }
    }
    static void floatCalculator(){
        float x,y;
        ArithmeticOperations arithmeticOperations=new ArithmeticOperations();
        Scanner in=new Scanner(System.in);
        System.out.println("Simple Calculator by Float values");
        System.out.println("===================================");
        System.out.println("Enter the first number:");
        x=in.nextFloat();
        System.out.println("Enter the second number:");
        y=in.nextFloat();
        System.out.println("Select the operation by selecting the number. ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice=in.nextInt();
        switch (choice){
            case 1: System.out.println("Addition Value :"+arithmeticOperations.addition(x,y));
                break;
            case 2: System.out.println("Subtraction Value :"+arithmeticOperations.subtraction(x,y));
                break;
            case 3: System.out.println("Multiplication Value :"+arithmeticOperations.multiplication(x,y));
                break;
            case 4:
                if(x<y){
                    System.out.println("Cannot show the result hence number 1 smaller than number 2");
                }
                System.out.println("Division Value :"+arithmeticOperations.division(x,y));
                break;
            default: System.out.println("xxx Wrong choice xxx");
        }
    }
}
