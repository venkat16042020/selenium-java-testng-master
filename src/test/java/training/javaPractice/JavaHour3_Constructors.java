package training.javaPractice;


public class JavaHour3_Constructors{
//Example1:
    //In simple terms, the state of an object is its state at a certain point in time, and a behaviour
    // of an object is the things it can do which is stored in methods. When the method is run, it performs an action,
    // thus changing the state of the object.
    //
    //State Examples:
    //
    //A radio can be "on" or "off"
    //A song can be "playing" or "not playing"
    //A task can be either "complete" or "incomplete"
    //Behaviour Examples:
    //
    //If a power button is pressed, the radio turns from "off" to "on"
    //If a stop button is pressed, the song that is playing "stops"
    //If you finish a task and click on the checkbox to the left, a line crosses thru the text task
    // indicating it's complete
//Example2
    //Imagine a dog. This is an example of an object.
    //
    //A state can be on or off. If it's asleep, its state is off. If it's awake, the state is on.
    //
    //Behaviour: If the dog is awake, what is it doing? Examples of behaviour might be barking, sniffing,
    // eating or drinking, pawing, jumping, playing, to name a few.

//Example3:
    //for the radio example state is like on or off, the radio could be on so the state would be on
    // behavior is what is does, it plays music, when the state is off the behavior is not playing music
    //
    //another example could be a cow the state could be sleeping or awake when the state is awake the behavior could be eating grass

    //Understanding:
    //Java Object has state and behavior.
    //Behavior: any action it can perform(method body has the steps to perform some action/functionality.
    // Create a product:Adding all the data in the form and submit.
    //Output is Product added successfully. Product status is Active.
    //Action: output of the behavior(return type of the method)
    public int age = 30;
    //Constructor without arguments
    public JavaHour3_Constructors(){
        //age = 5;
        System.out.println("no special initialization");
    }

    //Constructor with arguments.
    public JavaHour3_Constructors(int age){
        //
        this.age = age;
    }

    public void createProduct(){
        JavaHour3_Constructors objC = new JavaHour3_Constructors(11);
        System.out.println("Constructor used in another method: " + objC.age);
    }

}
//Java class: Blueprint of the object.
//Object: Object is an instance of the class
//Constructor: Constructor is used to initialize the variables with required data
//Constructor will be called while only creating object.
class JustOneClass {
    public static void main(String[] args) {
        JavaHour3_Constructors objA = new JavaHour3_Constructors();
        System.out.println("Constructor without args: " + objA.age);
        JavaHour3_Constructors objB = new JavaHour3_Constructors(15);
        System.out.println("Constructor with args: " + objB.age);
        objA.createProduct();
    }

}