class Animal {
    protected String name;

    public Animal() {
        // name = "unknown";
        this("unknown"); //this will call the current class' constructor
    }

    public Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating something!");
    }

    void eat(String food) {
        System.out.println(name + " is eating " + food + "!");
    }
    
    void eat(String food, int quantity) {
        System.out.println(name + " is eating " + quantity + " units of " + food + "!");
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Animal dog = new Animal("Sheru");
        dog.eat();
        dog.eat("bones");
        dog.eat("bones", 3);
    }
}

/*
-> Polymorphism is an ability to use same thing in many ways.
-> It is when you use the same method in many ways in the same class or another class(both classes should be inherited).

Method Overloading:
    - It is when you use the same the method with same name in the same class but with different parameters.

this(parameter/s) -> it will call another constructor with matching parameters in the same class.

Tasks:

Here are two problem statements involving method overloading:

---

-> Problem Statement 1: Volume Calculation
Write a program that calculates the volume of different shapes using method overloading. Implement the following methods in a 'VolumeCalculator' class:

1. 'calculateVolume(double radius)' - Calculates the volume of a sphere.
2. 'calculateVolume(double radius, double height)' - Calculates the volume of a cylinder.
3. 'calculateVolume(double length, double breadth, double height)' - Calculates the volume of a cuboid.

---

-> Problem Statement 2: Area Calculation
Write a program that calculates the area of different geometric shapes using method overloading. Implement the following methods in an 'AreaCalculator' class:

1. 'calculateArea(double side)' - Calculates the area of a square.
2. 'calculateArea(double length, double breadth)' - Calculates the area of a rectangle.
3. 'calculateArea(double base, double height)' - Calculates the area of a triangle.


*/