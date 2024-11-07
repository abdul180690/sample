package com.java.oops.concepts.boot;

import com.java.oops.concepts.Invoice;

public class AbstractExcercise3 {
    public static void main(String[] args) {
        Invoice item1=new Invoice("Soap", 1,6,12.65,5);

        item1.itemInfo();
        System.out.println("Before Tax : "+item1.beforeTax());
        System.out.println("Tax Amount : "+item1.taxAmount());
        System.out.println("Grand Total: "+item1.grandTotal());
    }
}
