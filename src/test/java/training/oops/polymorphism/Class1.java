package training.oops.polymorphism;
//method signature: method name and method parameters together said to  be method signature
//What is overriding:
//Same class should not have the methods with same signature.
//Child class and parent class can have  methods with same signature.
//Child class method can override the parent class method.
public class Class1 extends Class3 {

    public static void main(String[] args) {
        Class1 obj = new Class1();
        obj.method2();
        obj.method2(22);
    }

    //Override annotation helps have clean code.
    //If parent method is not having method with same signature like child class,
    // Override annotation show the error.
//    @Override
    public void method2(){
        System.out.println("Class1 method2");
    }

}


