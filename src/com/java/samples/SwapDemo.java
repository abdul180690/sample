package com.java.samples;

public class SwapDemo {
    public static void main(String[] args) {
        // method over loading demo
        int x=10,y=20;
        doSwap(x,y);
        int z=addTwoNumbers(x,y);
        System.out.println("Addition="+z);
        doSwap();
    }

    private static int addTwoNumbers(int x, int y) {
        return x+y;
    }

    private static void doSwap(int x, int y){

        int temp=0;
       temp=x;
       x=y;
        y=temp;
        System.out.println("X="+x+"y="+y);

    }
    private static void doSwap(){
        int x=30,y=40;
        int temp=0;
        temp=x;
        x=y;
        y=temp;
        System.out.println("X="+x+"y="+y);

    }
}
