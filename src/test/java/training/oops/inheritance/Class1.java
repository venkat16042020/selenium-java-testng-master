package training.oops.inheritance;

public class Class1 extends Class3 {
    public String name = "John";
    public Integer charge  = 12;
    public static String accountStatus;
    public Class1(){
        super(5);
    }

    //Java
    public static void main(String[] args) {
        //non-static cannot access in static method directly.
        // but we can access through class object
        // Below 1st line gives error.
//         System.out.println(charge);
        System.out.println(accountStatus);
        System.out.println(circumference);

        Class1 class1_Obj = new Class1();
        class1_Obj.method1();

    }

    //Inheritance concept:
    //One class can extend another class.
    //child-parent;sub-super;derived-base===>this is the wording used for the classes.
    //Using inheritance: we can reuse the members(variables & methods) of parent class
    // to avoid the duplication.

    //Inheritance in Java is the method to create a hierarchy between
    // classes by inheriting from other classes.
    // Java Inheritance is transitive - so if Benz extends Car and Car extends Vehicle,
    // then Benz is also inherited from the Vehicle class.
    // The Vehicle becomes the superclass of both Car and Sedan.
    public void method1(){
        System.out.println("method1 in class1");
        System.out.println("Current class variable: " + charge);
        System.out.println("Current class variable: " + accountStatus);
        System.out.println("Current class variable: " + this.charge);
        System.out.println("Super class variable: " + super.area);//child-parent; sub-super
        //derived-base
        this.method3();
        this.method2();
        super.method2();
        //this keyword is used even-though the method is not from the current class
        this.method5();
    }
    public void method2(){
        System.out.println("method2 in class1");
    }
    public void method3(){
        System.out.println("method3 in class1");
    }
}
