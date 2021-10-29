package com.github.elenaAeternanox.thirdHomeWork;

public class Sellers {

    static class Seller {
        String name;
        String address;

        public void sellerDescription() {
            System.out.println("                Seller:" );
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Seller firstSeller = new Seller();
        firstSeller.name = "First seller";
        firstSeller.address = "First seller's address";

        Seller secondSeller = new Seller();
        secondSeller.name = "Second seller";
        secondSeller.address = "Second seller's address";

        firstSeller.sellerDescription();
        secondSeller.sellerDescription();;
    }
}
