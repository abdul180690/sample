package com.java.samples;
import java.util.Random;
import java.util.Scanner;

public class Mathclass_samples {
    public static void main(String[] args){
//    int x=24;
//    int y=56;
//    int a=Math.max(x,y);
//    double d=3.456;
//    System.out.println(a);
//    System.out.println(Math.min(x,y));
//    System.out.println(Math.sqrt(x));
//    System.out.println(Math.round(d));
//    System.out.println(Math.ceil(d));
//    System.out.println(Math.floor(d));


//        double x;
//        double y;
//        double z;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the side x: ");
//        x=sc.nextDouble();
//        System.out.println("Enter the side y: ");
//        y=sc.nextDouble();
//        z=Math.sqrt((x*x)+(y*y));
//        System.out.println("The side z is: "+z);

//Random number genertion
//        Random ra=new Random();
//        int x=ra.nextInt(7)+1;
//        double d=ra.nextDouble();
//        boolean b=ra.nextBoolean();
//        System.out.println(x);
//        System.out.println(d);
//        System.out.println(b);

//if statement
//        int age;
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter the Age: ");
//        age=scan.nextInt();
//        if(age>=70){
//            System.out.println("You are not allowed here!");
//        }else if(age>=18){
//            System.out.println("You are an adult");
//        }else if(age>=13){
//            System.out.println("You are a Teenager");
//        }else{
//            System.out.println("You are a child");
//        }

// Switch statement
//        String day;
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter the Day: ");
//        day=s.next();
//        switch (day){
//            case "Monday":
//                System.out.println("This is Monday!");
//                break;
//            case "Tuesday":
//                System.out.println("This is Tuesday!");
//                break;
//            case "Wednesday":
//                System.out.println("This is Wednesday!");
//                break;
//            case "Thursday":
//                System.out.println("This is Thursday!");
//                break;
//            case "Friday":
//                System.out.println("This is Friday!");
//                break;
//            case "Saturday":
//                System.out.println("This is Saturday!");
//                break;
//            case "Sunday":
//                System.out.println("This is Sunday!");
//                break;
//            default:System.out.println("Enter the correct day");
//        }

//  &&(AND) both conditions must be true
//  ||(OR) either condition must be true
//  ! (NOT) reverse boolean value of condition

// &&
//        int temp;
//        Scanner a=new Scanner(System.in);
//        System.out.println("Enter the temperature outside: ");
//        temp=a.nextInt();
//        if(temp>30){
//            System.out.println("Its too Hot");
//        }else if(temp>=20 && temp<=30){
//            System.out.println("Its warm");
//        }else{
//            System.out.println("Its cold ");
//        }

// ||
//        String response;
//        Scanner s=new Scanner(System.in);
//        System.out.println("If you want to quit the game press 'q' or 'Q' ");
//        response=s.next();
//        if(response.equals("q") || response.equals("Q")){
//            System.out.println("You quit the Game!");
//        }else{
//            System.out.println("You are still playing the Game!");
//        }


// !
//        String response;
//        Scanner s=new Scanner(System.in);
//        System.out.println("If you want to quit the game press 'q' or 'Q' ");
//        response=s.next();
//        if(!response.equals("q") && !response.equals("Q")){
//            System.out.println("You are still playing the Game!");
//        }else{
//            System.out.println("You quit the Game!");
//        }

// While Loop
        Scanner scan=new Scanner(System.in);
        String name="";
//        while(name.isBlank()){
//            System.out.print("Enter your name: ");
//            name=scan.nextLine();
//        }System.out.println("Hello "+name);
        do{
            System.out.println("Enter your name: ");
            name=scan.nextLine();
        }while(name.isBlank());
        System.out.println("Hello "+name);
    }
}
