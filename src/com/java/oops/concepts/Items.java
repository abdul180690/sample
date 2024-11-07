package com.java.oops.concepts;

public abstract class Items {
    String itemName;
    int itemNo;
    public Items(String itemName, int itemNo){
        this.itemName=itemName;
        this.itemNo=itemNo;
    }
    public abstract double beforeTax();
    public abstract double taxAmount();
    public abstract double grandTotal();
    public void itemInfo(){
        System.out.println("Item Name : "+itemName);
        System.out.println("Item Number : "+itemNo);
    }
}
