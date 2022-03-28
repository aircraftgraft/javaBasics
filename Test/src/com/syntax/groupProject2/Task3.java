package com.syntax.groupProject2;

public class Task3 {
    /* Create a Class Car that would have the following fields:
    carPrice and color and method calculateSalePrice() which should be returning a price of the car.
    Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own
    implementation of  calculateSalePrice() method in which returned price calculated as following:
    if weight>2000 then returned price car should include 10% discount,
    otherwise 20% discount.
    The Sedan class has field as length and also does its own implementation of calculateSalePrice():
    if length of sedan is >20 feet then returned car price should include 5% discount,
    otherwise 10% discount
     */
    public static void main(String[] args) {
        Car car=new Car(8000.0, "green");
        System.out.println("Car price is "+car.calculateSalePrice());

        Sedan sed=new Sedan(13000, "red", 21);
        System.out.println("Sedan price is "+sed.calculateSalePrice());

        Truck t=new Truck(5000, "black", 2020);
        System.out.println("Truck price is "+t.calculateSalePrice());
    }
}

class Car {
    double carPrice;
    String color;
    public double calculateSalePrice(){
        return carPrice;
    }
    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }
}

class Sedan extends Car {
    double carLength;
    public Sedan(double carPrice, String color, double carLength) {
        super(carPrice, color);
        this.carLength=carLength;
    }
    @
            Override
    public double calculateSalePrice() {
        if (carLength>20) {
            return carPrice*0.95;
        } else {
            return carPrice*0.90;
        }

    }
}

class Truck extends Car {
    double carWeight;
    public Truck(double carPrice, String color, double carWeight) {
        super(carPrice, color);
    }

    @Override
    public double calculateSalePrice() {
        if (carWeight>2000) {
            return carPrice*0.90;
        } else {
            return carPrice*0.80;
        }

    }
}
