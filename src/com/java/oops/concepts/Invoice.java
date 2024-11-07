package com.java.oops.concepts;

public class Invoice extends Items{
    int quantity;
    double itemAmount;
    double taxPercentage;
    public Invoice(String itemName, int itemNo, int quantity, double itemAmount, double taxPercentage) {
        super(itemName, itemNo);
        this.quantity=quantity;
        this.itemAmount=itemAmount;
        this.taxPercentage=taxPercentage;
    }

    double beforeTax;
    double taxAmount;
    double grandTotal;

    @Override
    public double beforeTax() {
        beforeTax=quantity*itemAmount;
        return beforeTax;
    }

    @Override
    public double taxAmount() {
        taxAmount=beforeTax*taxPercentage/100;
        return taxAmount;
    }

    @Override
    public double grandTotal() {
        grandTotal=beforeTax+taxAmount;
        return grandTotal;
    }
}
