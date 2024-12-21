class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating food!");
    }
}

class Dog extends Animal {
    public Dog() {
        super("lucky"); //super keyword helps defining the parent class in the curret class.
    }

    public Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " is barking!");
    }
}

class Puppy extends Dog {
    public Puppy() {
        super();    //this will call the default constructor of parent class
    }

    public Puppy(String name) {
        super(name);    //this will call the parameterized constructor of parent class
    }

    void play() {
        System.out.println(name + " is playing!");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Puppy pup1 = new Puppy();

        pup1.play();
        pup1.eat();
        pup1.bark();
        pup1.eat();
        System.out.println();

        Puppy pup2 = new Puppy("Tuffy");

        pup2.play();
        pup2.eat();
        pup2.bark();
        pup2.eat();
    }
}
/*
Multilevel inheritance is a fundamental concept in object-oriented programming (OOP) where a class (child class) inherits from another class (parent class), which in turn may inherit from another class. This creates a hierarchy of classes that can share attributes and methods across multiple levels, resembling a family tree where traits are passed down through generations.

-> Problem Statement 1: Family Traits
Create a multilevel inheritance structure to represent family traits:

- Base Class: `Person`
  - Attributes: `name`, `age`
  - Method: `displayInfo()`

- Derived Class: `Parent` (inherits from `Person`)
  - Additional Attribute: `occupation`
  - Override `displayInfo()` to include occupation.

- Further Derived Class: `Child` (inherits from `Parent`)
  - Additional Attribute: `school`
  - Override `displayInfo()` to include school information.

- Task: Implement this structure in your preferred programming language and demonstrate the functionality by creating instances of each class and displaying their information.

-> Problem Statement 2: Vehicle Classification
Develop a multilevel inheritance model for different types of vehicles:

- Base Class: `Vehicle`
  - Attributes: `make`, `model`, `year`
  - Method: `displayDetails()`

- Derived Class: `Car` (inherits from `Vehicle`)
  - Additional Attribute: `numberOfDoors`
  - Override `displayDetails()` to include the number of doors.

- Further Derived Class: `ElectricCar` (inherits from `Car`)
  - Additional Attribute: `batteryCapacity`
  - Override `displayDetails()` to include battery capacity.

- Task: Write code for this vehicle hierarchy, create instances of each class, and display the details of each vehicle type.


*/