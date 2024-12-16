class Animal {  //Parent/Base/Super Class
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {  //Child/Derived/Sub Class
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        Dog lucky = new Dog();

        lucky.bark();   //method from the same class
        lucky.eat();    //method from parent class
    }
}

/*
Task:

-> Problem Statement 1: Employee and Manager
Create a base class `Employee` with attributes like `name` and `employeeId`. Include a method to display the employee's details. Create a derived class `Manager` that extends the `Employee` class and includes an additional attribute `department`. Add a method in the `Manager` class to display the manager's specific details along with the employee's details.

Example Output:  
Employee Name: John  
Employee ID: 101  
Department: IT  

-> Problem Statement 2: Shape and Circle
Create a base class `Shape` with an attribute `color` and a method to display the shape's color. Create a derived class `Circle` that extends the `Shape` class and includes additional attributes like `radius`. Add a method in the `Circle` class to calculate and display the circle's area along with its color.

Example Output:  
Shape Color: Blue  
Circle Radius: 5  
Circle Area: 78.54  



*/