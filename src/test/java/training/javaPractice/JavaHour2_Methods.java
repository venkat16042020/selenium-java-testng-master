package training.javaPractice;
//Java class syntax
public class JavaHour2_Methods {
    //Class(or) non-static Variable: We can access the variable with using only object.
    public int projectId = 6699;
    //Static variable: We can access static variable without using object.
    public static int tax = 40;
    //Java application starting(entry) point is main method. Without main method, we cannot run the java application
    public static void main(String[] args) {
        int vehicleId = 293;
        //comments
        /*
        Multiple line comments
        Multiple line comments.......
         */
        System.out.println("hello world");
        //Creating a jav object
        //ClassName objectName = new ClassConstructor();
        JavaHour2_Methods javaHour1 = new JavaHour2_Methods();
        //By using object only we can access the non-static members(variables/methods)
        javaHour1.javaHour1_1_methodCreation();
        //accessing static members without using object
        staticMethod_deleteAccount();
        System.out.println(javaHour1.projectId);
        System.out.println(tax);
        System.out.println(javaHour1.method3());
//        System.out.println(accId);


    }

    //Creating a method without parameters
    //Method syntax
    public void javaHour1_1_methodCreation(){
        JavaHour2_Methods javaHour1 = new JavaHour2_Methods();
        System.out.println(javaHour1.projectId);
        System.out.println(tax);

        System.out.println("Method Creation");
        System.out.println();
    }

    //Creating a method with parameters
    public void editAccount(String accountId){
        System.out.println("Method creation with parameters");
    }

    //Creating a static method
    public static  void staticMethod_deleteAccount(){
        System.out.println("Delete account");
    }

    public int method3(){
        System.out.println("method3");
        int accountGenerated = 99;
        System.out.println(accountGenerated);
        return accountGenerated;
    }

}
