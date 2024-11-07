package com.java.oops.concepts;

import java.util.Arrays;
import java.util.Random;

public class RandomNumber extends UserNumber{

    int[] randomNumber=new int[3];
    public RandomNumber(int[] number) {
        super(number);
    }

    @Override
    public int[] randomNumber() {
        Random random=new Random();
        for(int i=0;i<3;i++){
            randomNumber[i]= random.nextInt(10);
        }
        return randomNumber;
    }

    @Override
    public void showRandomNumber() {
        System.out.println("Randomly Generated array : "+Arrays.toString(randomNumber()));
    }

    public void result(){
        if(number[0]==randomNumber[0]){
            System.out.println("==First Number True==");
        } else if (number[1]==randomNumber[1]) {
            System.out.println("==Second Number True==");
        } else if (number[2]==randomNumber[2]) {
            System.out.println("==Third Number Ture==");
        }else{
            System.out.println(">>>None of them are true<<<");
        }
    }
}
