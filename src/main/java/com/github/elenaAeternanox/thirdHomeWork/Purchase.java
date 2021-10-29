package com.github.elenaAeternanox.thirdHomeWork;

public class Purchase {

    static class Condition {
        int customerHas;
        int apartPrice;

        public void conditionDescription() {
            System.out.println("Customer has $: " + customerHas);
            System.out.println("Apart's price $: " + apartPrice);
            possibilityCalc(apartPrice, customerHas);
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
        Condition firstCondition = new Condition();
        firstCondition.customerHas = 2345675;
        firstCondition.apartPrice = 123453;

        Condition secondCondition = new Condition();
        secondCondition.customerHas = 345672;
        secondCondition.apartPrice = 435234;

        Condition thirdCondition = new Condition();
        thirdCondition.customerHas = 567890;
        thirdCondition.apartPrice = 345098;

        firstCondition.conditionDescription();
        secondCondition.conditionDescription();
        thirdCondition.conditionDescription();
    }
}
