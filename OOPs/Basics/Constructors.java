class FoodItem {
    private String foodItemName;
    private double foodItemPrice;

    FoodItem() {
        foodItemName = "";
        foodItemPrice = 0.0;
        System.out.println("default Constructor called!");
    }

    FoodItem(String itemName, double itemPrice) {
        foodItemName = itemName;
        foodItemPrice = itemPrice;
        System.out.println("parameterized Constructor called!");
    }

    void getFoodItem() {
        System.out.println("Name: " + foodItemName);
        System.out.println("Price: " + foodItemPrice);
        System.out.println("-----------------------------");
    }
}

public class Constructors {
    public static void main(String[] args) {
        FoodItem foodItem = new FoodItem("Spaghetti", 430);
        FoodItem foodItem1 = new FoodItem();
        FoodItem foodItem2 = new FoodItem("Taco", 100);
        FoodItem foodItem3;

        System.out.println("-----------------------------");
        foodItem.getFoodItem();
        foodItem1.getFoodItem();
        foodItem2.getFoodItem();
        foodItem3 = new FoodItem("Panner Kebab", 260);  //Instantiation
        foodItem3.getFoodItem();

    }
}
/*
Constructor: They are special method which automatically invokes when an object is created.
> Constructor name must be same as class name.
> Constructor must have no explicit return type.

2 types of constructor:
1. Default constructor: It is a constructor which has no parameter.
2. Parameterized constructor: It is a constructor which has parameter.

The constructors are used to initialize the object.

Tasks:

1. Person Class: Create a `Person` class with a parameterized constructor to store a person's name, age, and address.

2. Book Class: Design a `Book` class with a constructor to store information about a book, including its title, author, and publication year.

3. Rectangle Class: Implement a `Rectangle` class with constructors for its width and height, and include methods to calculate its area and perimeter.

4. Bank Account Class: Create a `BankAccount` class with a constructor to initialize an account with an account number and balance.

5. Student Class: Develop a `Student` class with a constructor to store a student's name, ID, and a list of courses they are enrolled in.

6. Car Class: Design a `Car` class with a constructor to set the car's make, model, and year of manufacture.

7. Employee Class: Implement an `Employee` class with a constructor to store an employee's name, employee ID, and salary.

8. Circle Class: Create a `Circle` class with a constructor to specify the radius and methods to compute its circumference and area.

9. Library Book Class: Design a `LibraryBook` class with a constructor that includes the book's title, author, and a boolean indicating whether it's checked out.

10. Computer Class: Create a `Computer` class with a constructor to store information about a computer, including its brand, model, and price.



*/