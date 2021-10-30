package com.github.elenaAeternanox.thirdHomeWork;

public class RealEstates {

    static class Apart {
        int id;
        int price;
        String address;
        double square;
        int numberOfRooms;
        boolean sold = false;

        public void apartDescription() {
            System.out.println("                Apart:" );
            System.out.println("Id: " + id);
            System.out.println("Price: " + price);
            System.out.println("Address: " + address);
            System.out.println("Square: " + square);
            System.out.println("Number of rooms: " + numberOfRooms);
            System.out.println("Sold: " + sold);
            System.out.println("");
        }
    }

    static class House {
        int id;
        int price;
        String address;
        double areaSquare;
        double square;
        int numberOfRooms;
        boolean sold = false;

        public void houseDescription() {
            System.out.println("                House:" );
            System.out.println("Id: " + id);
            System.out.println("Price: " + price);
            System.out.println("Address: " + address);
            System.out.println("Square of outside area: " + square);
            System.out.println("Square of house: " + square);
            System.out.println("Number of rooms: " + numberOfRooms);
            System.out.println("Sold: " + sold);
            System.out.println("");
        }
    }
}
