package com.java.oops.concepts;

public class FineChecker extends Customers {
    double accountBalance;
    double minBalance=1000;
    double fineAmount=minBalance/10;
    public FineChecker(String name, long accountNo, double accountBalance) {
        super(name, accountNo);
        this.accountBalance=accountBalance;
    }

    @Override
    public void eligibleChecker() {
        if(accountBalance<minBalance){
            System.out.println("Fine Amount is : "+fineAmount);
        }else{
            System.out.println("Good Customer");
        }
    }

    @Override
    public void loanChecker() {
        if(accountBalance>10000){
            System.out.println("Eligible for the Loan");
        }else {
            System.out.println("Not Eligible for the Loan");
        }
    }
}
