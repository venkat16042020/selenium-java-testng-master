package training.oops.abstraction;

// Abstract class
//What is abstract class:
//A class with abstract keyword and with at least one abstract method is called
//abstract class.
//What is abstract method:
//A method with abstract keyword and no-body is called abstract method.

abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass - Dog (inherit from Animal)
//To extend abstract class, need to implement the abstract methods.
//else it will throw error.
class Dog extends Animal {
    @Override
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The dog says: bow bow");
    }
}

class Cat extends Animal{
    //if we don't define/implement method, then error will be displayed.
    //if we want to extend any abstract class means: we should implement
    // the abstract methods in the parent class.
    //Note: regular methods in abstract class, no need to implement in child classes
    public void animalSound() {
        System.out.println("The cat says: mew mew");
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create a dog object
        myDog.animalSound();
        myDog.sleep();
        Cat myCat = new Cat();
        myCat.animalSound();
        myCat.sleep();

    }
}