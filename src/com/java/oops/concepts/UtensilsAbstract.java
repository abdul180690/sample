package com.java.oops.concepts;

public abstract class UtensilsAbstract {
    String name;
    int numberOf;
    public UtensilsAbstract(String name, int numberOf){
        this.name=name;
        this.numberOf=numberOf;
    }
    public abstract void calculate();
    public void showNameAndNumber(){
        System.out.println("Item Name : "+name);
        System.out.println("Item-number : "+numberOf);
    }
}
