package com.java.oops.concepts.boot;

import com.java.oops.concepts.FineChecker;

public class AbstractExcercise2 {
    public static void main(String[] args) {
        FineChecker customer1=new FineChecker("Abdullah",22334343,500);

        customer1.display();
        customer1.eligibleChecker();
        customer1.loanChecker();
    }
}
