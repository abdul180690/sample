package com.java.oops.concepts;

public class RateChart extends UtensilsAbstract{
    int amount;
    int quantity;
    public RateChart(String name, int numberOf, int amount, int quantity) {
        super(name, numberOf);
        this.amount=amount;
        this.quantity=quantity;
    }

    @Override
     public void calculate() {
        System.out.println("Item Value : Rs."+amount+"/-");
        System.out.println("Quantity : "+quantity);
        System.out.println("Total Amount : Rs."+amount*quantity+"/-");
        System.out.println();
    }
}
