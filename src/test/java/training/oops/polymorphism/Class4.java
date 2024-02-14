package training.oops.polymorphism;

// Java Program to Prevent Method Overriding
// using a static method

// Importing java input output classes

// Class 1
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object og Base class
        Base base = new Child();

        // Printing message from base class as
        // its static methods have static binding

        // Hence even if the object is of Child class
        // message printed is from base class
        base.hello();
    }
}

// Class 2
// Parent class
class Base {

    // hello() method of parent class
    public static void hello()
    {

        // Print and display the message if
        // hello() method of parent class is called
        System.out.println("Hello from base class");
    }
}

// Class 3
// Child class
class Child extends Base {

    // Overriding the existing method - hello()
    // @Override
    // hello() method of child class
    public static void hello()
    {
        // Print and display the message if
        // hello() method of child class is called
        System.out.println("Hello from child class");
    }
}