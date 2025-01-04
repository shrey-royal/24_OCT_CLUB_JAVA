class Animal {
    String color = "white";

    Animal() {
        color = "Brown";
    }

    Animal(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }
}

class Dog extends Animal {
    String color = "black";

    Dog(String color) {
        super(color);   //calling constructor of parent class
        System.out.println("Parameterized Constructor");
    }

    String getColor() {
        return color;
    }

    void printColor() {
        System.out.println(color);
        // System.out.println(super.color); //calling parent class' data member
        System.out.println(super.getColor());   //calling parent class' instance method
        // System.out.println(getColor());
    }
}


public class SuperKw {
    public static void main(String[] args) {
        Dog d = new Dog("Gray");
        d.printColor();
    }
}

/*
This Keyword-: refers current class' instance members
Super Keyword-: refers parent class' instance members

Tasks:

Scenario 1: Car Manufacturing
In a car manufacturing system, have a base class called "Vehicle" with a method called "manufacture" that handles common manufacturing steps. Implement a derived class called "Car" that overrides the "manufacture" method and uses the super keyword to invoke the base class implementation.

Scenario 2: Online Shopping
In an online shopping system, create a base class called "Product" with a method called "displayDetails" that shows general product information. Implement derived classes like "Electronics" and "Clothing" that override the "displayDetails" method and use the super keyword to display both general and specific product details.

*/