class Animal {
    void sound() {
        System.out.println("Animal makes a sound!");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks!");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows!");
    }
}

public class HIerarchicalInheritance {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.sound();
        myDog.sound();
        myCat.sound();
    }
}

/*
Problem Statement 1: Animal Classification

-> Description:
You need to create a program that models different types of animals in a zoo. Each animal has common characteristics, such as the ability to make a sound, but different animals make different sounds. 

-> Requirements:
- Create a superclass called `Animal` with a method `sound()`.
- Create subclasses for specific animals, such as `Lion`, `Elephant`, and `Monkey`, each overriding the `sound()` method to provide their unique sounds.

Problem Statement 2: Employee Management System

-> Description:
You are tasked with developing a simple employee management system for a company that has different types of employees. Each type of employee has common attributes (like name and ID) but also has unique responsibilities and roles.

-> Requirements:
- Create a superclass called `Employee` with common attributes and methods (e.g., `getName()`, `getID()`).
- Create subclasses for specific roles, such as `Manager`, `Developer`, and `Intern`. Each subclass should have its own method that describes the specific role (e.g., `manageTeam()` for `Manager`).


*/