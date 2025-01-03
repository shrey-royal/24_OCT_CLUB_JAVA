class Vehicle {
    void start() {
        System.out.println("The Vehicle starts");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("The car starts with a key");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Vehicle c = new Car();

        c.start();
    }
}

/*
Overriding: If a method is present in a subclass and the same method is declared in the parent class then the method in the subclass is said to be overriding the method in the parent class.

Tasks: 

1. Banking System
In a banking application, different types of accounts (e.g., Savings Account, Current Account) may have different interest calculation methods. By using method overriding, each account type can implement its own version of an interest calculation method.

2. Animal Sounds
In an application dealing with animals, you might want each animal to produce its unique sound. Instead of creating separate methods for each animal type, you can use method overriding.

*/