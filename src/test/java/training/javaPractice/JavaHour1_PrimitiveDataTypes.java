package training.javaPractice;

//https://arctern.com/AboutVolt.html

//What is java: It is a computer programming language which supports developing web, window, mobile,
// api,bigdata etc... applications.
//And as well it can help to web scrapping(where we can grab data from internet).

//Why are we using java for selenium - automation testing.
//Selenium helps to grab data from web applications and to interact web applications.
//Hence, we are using selenium for automation testing.
//Selenium apis/tool available in multiple programming language like in java, python, perl, ruby, c# etc....
//My project development s based on java. So for automation testing also, we are using selenium-java binding.
//Hence, we use java for automation testing.

//package in which the current class exists
//What is package: it is a group of class files

//Java class syntax
public class JavaHour1_PrimitiveDataTypes {

    //Java application starting point is main method
    public static void main(String[] args) {
        System.out.println("Learn about primitive variables");
//There are 8 type of primitive data types in java
        //The byte is the smallest data type among all the integer data types. It is an 8-bit signed two’s
        //complement integer. It stores whole numbers ranging from -128 to 127.
        byte sampleByte = 20;
        //Signed Two's complement integer: 1010 = −(1×2^3) + (0×2^2) + (1×2^1) + (0×2^0) = 1×−8 + 0 + 1×2 + 0 = −6.
        //                          0110 = +(0×2^3) + (0×2^2) + (1×2^1) + (0×2^0) = 0×8 + 0×4 + 1×2 + 0 = +6.
        //Short is a 16-bit signed two’s complement integer. It stores whole numbers with values ranging
        // from -32768 to 32767. Its default value is 0
        short amount2 = 20;
        //Int is a 32-bit signed two’s complement integer that stores integral values ranging
        // from 2147483648 (-2^31) to 2147483647 (2^31 -1). Its default value is 0.
        int amount1 = 10;
        //long is a 64-bit signed two’s complement integer that stores values ranging
        // from -9223372036854775808(-2^63) to 9223372036854775807(2^63 -1). It is used when we need a range of
        // values more than those provided by int. Its default value is 0L. This data type ends with ‘L’ or ‘l’.
        long amount3 = 99999999944444444L;
        //Float
        //It is a floating-point data type that stores the values, including their decimal precision.
        // It is not used for precise data such as currency or research data.
        //A Float value:is a single-precision 32-bit or 4 bytes IEEE 754 floating-point
        //can have a 7-digit decimal precision
        //ends with an ‘f’ or ‘F’
        //default value = 0.0f
        //stores fractional numbers ranging from 3.4e-038 to 3.4e+038
        //Common uses: Microdevices, IoT, mobile
        float price = 2.2F;
        //Double
        //The double data type is similar to float. The difference between the two is that is double twice the float
        // in the case of decimal precision. It is used for decimal values just like float and should not be used for
        // precise values.
        //A double value: is a double-precision 64-bit or 8 bytes IEEE 754 floating-point
        //can have a 15-digit decimal precision
        //default value = 0.0d
        //stores fractional numbers ranging from 1.7e-308 to 1.7e+308
        //Common uses: Enterprise apps, JPA, JDBC
        double price2 = 3.8;
        boolean isElementDisplayed = false;
        char firstCharOfAccount = 'C';

        System.out.println("byte " + String.valueOf(sampleByte)  + "\n" +
                "        int " + amount1 + "\n" +
                "        short " + String.valueOf(amount2)  + "\n" +
                "        long " + amount3 + "\n" +
                "        float " + price + "\n" +
                "        double " + price2 + "\n" +
                "        boolean " + isElementDisplayed + "\n" +
                "        char " + firstCharOfAccount);
    }

    //Data Type |Default Value |Default size         |Range
    //byte      |0             |1 byte or 8 bits      |-128 to 127 || -128 = 10000000
    //short     |0             |2 bytes or 16 bits       |-32,768 to 32,767
    //int       |0             |4 bytes or 32 bits    |2,147,483,648 to 2,147,483,647
    //long      |0             |8 bytes or 64 bits       |9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    //float     |0.0f           |4 bytes or 32 bits    |1.4e-045 to 3.4e+038
    //double    |0.0d           |8 bytes or 64 bits    |4.9e-324 to 1.8e+308
    //char      |‘\u0000’       |2 bytes or 16 bits       |0 to 65536
    //boolean   |FALSE          |1 byte or 2 bytes     |0 or 1

    //Why use “byte” and not “int”?
    //We can normally use “byte” instead of a primitive integer when there’s a memory or performance constraint.
    // Since 1 integer’s size is equal to the size of 4 bytes so we can conserve memory 4 times as that of a
    // simple integer. This space conservation is extremely helpful when you’re dealing with network programming.
    // Sending a byte in place of an int, can save your memory and bandwidth.

}



