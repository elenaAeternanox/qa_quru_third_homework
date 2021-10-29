package com.github.elenaAeternanox.thirdHomeWork;

public class Customers {

    static class Customer {
        String name;
        int hasSum;

        public void customerDescription() {
            System.out.println("                Customer:" );
            System.out.println("Name: " + name);
            System.out.println("Has sum: " + hasSum);
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Customer firstCustomer = new Customer();
        firstCustomer.name = "First customer";
        firstCustomer.hasSum = 234123;

        Customer secondCustomer = new Customer();
        secondCustomer.name = "Second customer";
        secondCustomer.hasSum = 450432;
        firstCustomer.customerDescription();

        Customer thirdCustomer = new Customer();
        thirdCustomer.name = "Third customer";
        thirdCustomer.hasSum = 128000;
        firstCustomer.customerDescription();

        Customer forthCustomer = new Customer();
        forthCustomer.name = "Forth customer";
        forthCustomer.hasSum = 5439888;
        firstCustomer.customerDescription();

        firstCustomer.customerDescription();
        secondCustomer.customerDescription();;
        thirdCustomer.customerDescription();
        forthCustomer.customerDescription();
    }
}
