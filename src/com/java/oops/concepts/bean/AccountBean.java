package com.java.oops.concepts.bean;

final public class AccountBean {
    private final String firstName="";
    private final int age=24;

    public AccountBean(String firstName, int age) {
      //  this.firstName=firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
}
/*
1. concreate class
2. abstract class(cannot create object)
3. static class/inner class
4. immutable class
5. singleton class

 */
