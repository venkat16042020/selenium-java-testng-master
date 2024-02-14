package training.javaPractice;

import java.util.Arrays;

public class Hour8_WrapperClasses_Enum {
    //Enum helps to restrict the input data in for a variable
    enum productStatus {Active, InActive, Suspended, Deleted}
    public static String name = "hello";

    public static int amount = 20;
    public static Integer discount = 20;
    public static Integer discount1 = new Integer(20);
    public static  char character = 'C';
    public static Character letter = 'D';

    public static void main(String[] args) {
        //Calling enum
        System.out.println(productStatus.Active);
        System.out.println(Arrays.toString(productStatus.values()));

        //Knowing the class of a variable/object/field
        System.out.println(name.getClass());

        // Each primitive type has respective wrapper class.
        // primitive type helps only to read and write functionality.
        // byte - Byte
        // short - Short
        // int - Integer
        // long - Long

        // float - Float
        // double - Double

        // boolean - Boolean
        // char - Character

        // As java is object-oriented programming, if we convert primitive types data to wrapper classes.
        // we can perform more operations on data. Ex: Collections concept.
        // Related example use case:
        // Need to sort 100 number in a primitive type int array []. We need to write some programming to acheive this.
        // Instead, if we use collection framework on Integer type data, we have in-built methods in java.

        //Automatic conversion of primitive type to wrapper class is called auto boxing.
        //Automatic conversion on Wrapper class to primitive data type is called auto unboxing.
        //java allows auto-boxing and auto-unboxing.

        //How to convert primitive type to wrapper class: Integer.valueOf(amount)
        System.out.println(Integer.valueOf(amount).getClass());
        //How to convert wrapper class type to primitive data type: Integer.parseInt("2323")
        System.out.println(Integer.parseInt("2323"));
        System.out.println(Integer.valueOf(amount));
        System.out.println(discount);
        if(amount==discount){
            System.out.println("Auto boxing is happened.");
        }
        //changing the type of data is called type casting...

        //type casting is done from primitive integer type to Wrapper Class Integer -  type
        System.out.println(Integer.valueOf(2).getClass());
        //type casting is done from primitive integer type to Class String -  type
        System.out.println(String.valueOf(2).getClass());
    }
}