package com.java.oops.concepts;

import java.util.Arrays;

public abstract class UserNumber {
    int[] number;
    public UserNumber(int[] number){
        this.number=number;
    }

    public abstract int[] randomNumber();
    public abstract void showRandomNumber();
    public void showUserNumber(){
        System.out.println("You Are Entered : "+Arrays.toString(number));
    }
}
