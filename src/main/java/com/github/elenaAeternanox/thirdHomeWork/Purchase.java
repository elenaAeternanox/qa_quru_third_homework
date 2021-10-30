package com.github.elenaAeternanox.thirdHomeWork;

import java.util.Arrays;

import static com.github.elenaAeternanox.thirdHomeWork.Customers.Customer;
import static com.github.elenaAeternanox.thirdHomeWork.RealEstates.Apart;
import static com.github.elenaAeternanox.thirdHomeWork.RealEstates.House;
import static com.github.elenaAeternanox.thirdHomeWork.Sellers.Seller;

public class Purchase {

    static class Condition {
        int customerSum;
        int apartPrice;

        public void conditionDescription() {
            System.out.println("Customer has $: " + customerSum);
            System.out.println("Apart's price $: " + apartPrice);
            possibilityCalc(apartPrice, customerSum);
            System.out.println("");
        }

        public void possibilityCalc(int apartPrice, int customerHas) {
            boolean purchaseIsPossible;
            if (apartPrice <= customerHas) {
                purchaseIsPossible = true;
            } else {
                purchaseIsPossible = false;
            }
            possibilityPrint(purchaseIsPossible);
        }

        public void possibilityPrint(boolean purchaseIsPossible) {
            if (purchaseIsPossible == false) {
                System.out.println("Purchase's impossible :(");
            } else {
                System.out.println("Congrats!!! Purchase's possible :)");
            }
        }
    }

    public static void main(String[] args) {
        Customer firstCustomer = new Customers.Customer();
        firstCustomer.name = "First customer";
        firstCustomer.sum = 234123;

        Customers.Customer secondCustomer = new Customers.Customer();
        secondCustomer.name = "Second customer";
        secondCustomer.sum = 450432;
        firstCustomer.customerDescription();

        Customer thirdCustomer = new Customers.Customer();
        thirdCustomer.name = "Third customer";
        thirdCustomer.sum = 128000;
        firstCustomer.customerDescription();

        Customer forthCustomer = new Customers.Customer();
        forthCustomer.name = "Forth customer";
        forthCustomer.sum = 5439888;
        firstCustomer.customerDescription();

        firstCustomer.customerDescription();
        secondCustomer.customerDescription();;
        thirdCustomer.customerDescription();
        forthCustomer.customerDescription();
        System.out.println("" +
                "" +
                "");

        Apart firstApart = new RealEstates.Apart();
        firstApart.id = 1;
        firstApart.address = "First apart's address";
        firstApart.price = 235678;
        firstApart.square = 34.5;
        firstApart.numberOfRooms = 1;
        firstApart.sold = false;

        Apart secondApart = new RealEstates.Apart();
        secondApart.id = firstApart.id + 1;
        secondApart.address = "Second apart's address";
        secondApart.price = 435678;
        secondApart.square = 54.5;
        secondApart.numberOfRooms = 3;
        secondApart.sold = false;

        House firstHouse = new RealEstates.House();
        firstHouse.id = 1;
        firstHouse.address = "First house's address";
        firstHouse.areaSquare = 176.3;
        firstHouse.price = 784356;
        firstHouse.square = 75.2;
        firstHouse.numberOfRooms = 3;
        firstHouse.sold = true;

        House secondHouse = new RealEstates.House();
        secondHouse.id = firstHouse.id + 1;
        secondHouse.address = "Second house's address";
        secondHouse.areaSquare = 176.3;
        secondHouse.price = 1234567;
        secondHouse.square = 175.2;
        secondHouse.numberOfRooms = 5;
        secondHouse.sold = true;

        firstApart.apartDescription();
        secondApart.apartDescription();
        firstHouse.houseDescription();
        secondHouse.houseDescription();
        System.out.println("" +
                "" +
                "");


        Seller firstSeller = new Sellers.Seller();
        firstSeller.name = "First seller";
        firstSeller.address = "First seller's address";
        firstSeller.apartsList = Arrays.asList(firstApart, secondApart);
        firstSeller.housesList = Arrays.asList(secondHouse);

        Seller secondSeller = new Sellers.Seller();
        secondSeller.name = "Second seller";
        secondSeller.address = "Second seller's address";
        secondSeller.housesList = Arrays.asList(firstHouse);

        firstSeller.sellerDescription();
        /* check apart's list and house's list aren't empty
        if it's true, print their description
        */
        if (firstSeller.apartsList != null) {
            for (int i = 0; i < firstSeller.apartsList.size(); i++) {
                firstSeller.apartsList.get(i).apartDescription();
            }
        } else {
            System.out.println("There aren't aparts");
        }
        if (firstSeller.housesList != null) {
            for (int i = 0; i < firstSeller.housesList.size(); i++) {
                firstSeller.housesList.get(i).houseDescription();
            }
        } else {
            System.out.println("There aren't houses");
        }
        System.out.println("");
        System.out.println("");

        secondSeller.sellerDescription();
        /* check apart's list and house's list aren't empty
        if it's true, print their description
        */
        if (secondSeller.apartsList != null) {
            for (int i = 0; i < secondSeller.apartsList.size(); i++) {
                secondSeller.apartsList.get(i).apartDescription();
            }
        } else {
            System.out.println("There aren't aparts");
        }
        if (secondSeller.housesList != null) {
            for (int i = 0; i < secondSeller.housesList.size(); i++) {
                secondSeller.housesList.get(i).houseDescription();
            }
        }
        else {
            System.out.println("There aren't houses");
        }
        System.out.println("" +
                "" +
                "");

        Condition firstCondition = new Condition();
        firstCondition.customerSum = firstCustomer.sum;
        firstCondition.apartPrice = secondApart.price;

        Condition secondCondition = new Condition();
        secondCondition.customerSum = secondCustomer.sum;
        secondCondition.apartPrice = firstHouse.price;

        Condition thirdCondition = new Condition();
        thirdCondition.customerSum = thirdCustomer.sum;
        thirdCondition.apartPrice = secondHouse.price;

        Condition forthCondition = new Condition();
        forthCondition.customerSum = forthCustomer.sum;
        forthCondition.apartPrice = firstApart.price;

        firstCondition.conditionDescription();
        secondCondition.conditionDescription();
        thirdCondition.conditionDescription();
        forthCondition.conditionDescription();
    }
}
