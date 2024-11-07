package com.java.oops.concepts.boot;

import com.java.oops.concepts.RateChart;

import java.util.Scanner;

public class AbstractExcecise1 {
    public static void main(String[] args) {
        RateChart item1=new RateChart("Plate",101,90,10);
        RateChart item2=new RateChart("Spoon",102,25,15);
        RateChart item3=new RateChart("Tumbler",103,30,9);

        item1.showNameAndNumber();
        item1.calculate();

        item2.showNameAndNumber();
        item2.calculate();

        item3.showNameAndNumber();
        item3.calculate();

    }
}
