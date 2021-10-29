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

    public static void main(String[] args) {

        Apart firstApart = new Apart();
        firstApart.id = 1;
        firstApart.address = "First apart's address";
        firstApart.price = 235678;
        firstApart.square = 34.5;
        firstApart.numberOfRooms = 1;
        firstApart.sold = false;

        Apart secondApart = new Apart();
        secondApart.id = firstApart.id + 1;
        secondApart.address = "Second apart's address";
        secondApart.price = 435678;
        secondApart.square = 54.5;
        secondApart.numberOfRooms = 3;
        secondApart.sold = false;

        House firstHouse = new House();
        firstHouse.id = 1;
        firstHouse.address = "First house's address";
        firstHouse.areaSquare = 176.3;
        firstHouse.price = 784356;
        firstHouse.square = 75.2;
        firstHouse.numberOfRooms = 3;
        firstHouse.sold = true;

        House secondHouse = new House();
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
    }
}
