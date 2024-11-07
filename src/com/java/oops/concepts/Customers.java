package com.java.oops.concepts;

public abstract class Customers {
    String name;
    long accountNo;
    public Customers(String name, long accountNo){
        this.name=name;
        this.accountNo=accountNo;
    }
    public abstract void eligibleChecker();
    public abstract void loanChecker();
    public void display(){
        System.out.println("Account Holder name : "+name);
        System.out.println(("Account Number : "+accountNo));
    }
}
