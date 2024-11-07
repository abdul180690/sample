package com.java.oops.concepts.boot;

import com.java.oops.concepts.RandomNumber;

public class AbstractExcercise4 {
    public static void main(String[] args) {
        int[] number={8,5,7};
        RandomNumber num=new RandomNumber(number);

        num.showUserNumber();
        num.showRandomNumber();
        num.result();
    }
}
