package com.github.elenaAeternanox.thirdHomeWork;

import java.util.List;

public class Sellers {

    static class Seller {
        String name;
        String address;
        List<RealEstates.Apart> apartsList;
        List<RealEstates.House> housesList;

        public void sellerDescription() {
            System.out.println("                Seller:" );
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("");
        }
    }
}
