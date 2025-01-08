final class Bike {
    int speedLimit;

    Bike() {
        speedLimit = 80;
    }

    void run() {
        speedLimit = 100;
    }
}

// class Cyclist extends Bike {    // The type Cyclist cannot subclass the final class
//     @Override
//     void run() {    // Cannot override the final method from Bike
//         System.out.println("This is Cyclist class' run method");
//         System.out.println("SpeedLimit: " + speedLimit);
//     }
// }

public class FinalKW {
    public static void main(String[] args) {
        Bike bike = new Bike();

        System.out.println(bike.speedLimit);
        // bike.speedLimit = 100;  // stops value change
        // System.out.println(bike.speedLimit);

        // ---------------------------------------------------------
        // Cyclist c = new Cyclist();
        // c.run();
        
        // ---------------------------------------------------------


    }
}
/*
Final Keyword is used to make instance_member, methods or class constant:
    > value change
    > method override
    > inheritance

Tasks:

final keyword:

Scenario 1: Math Constants
In a mathematical calculation library, define a class called "MathConstants" with final variables for commonly used mathematical constants like pi and e. These variables cannot be modified and hold their constant values throughout the program.

Scenario 2: Configuration Settings
In a configuration management system, define a class called "Configuration" with final variables for system settings like database URL, username, and password. These variables cannot be modified and represent fixed configuration values.

Scenario 3: Math Calculations
In a math calculation library, define a class called "MathUtils" with final methods for commonly used mathematical calculations like square root and logarithm. These methods cannot be overridden and provide consistent behavior throughout the program.



*/