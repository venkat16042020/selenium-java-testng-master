package training.javaPractice;

public class Hour4_AccessModifiers {
    // code here
    //Access Modifier: Access modifier keywords sets the access level for the classes, variables, methods, constructors
    // and interfaces

    //public access modifier: Entire world can access it.
    //Accessible to same class, same package,
    //              subclassing from other package, other package
    public  int publicNumber = 30;
    //protected access modifier: Accessible only in same class, same package,
    //                                               subclassing from other package
    protected int protectedNumber = 22;

    //default(package-private) access modifier: Accessible only in same Class, Same package.
    int defaultNumber =99;
    //private access modifier: Accessible only in current class.
    private int privateNumber = 332;

    //Non-Access Modifiers: static, final
    public static int amount = 2999;
    final static  int discount = 12;
    final int membershipDiscount = 20;
    public void aaaa(){
        System.out.println("public class method");
    }

    public static void main(String[] args) {
        System.out.println(discount);
        //Unable to change the final static type data
//        discount =22;

        Hour4_AccessModifiers obj = new Hour4_AccessModifiers();
        //Unable tto change the final type data
//        obj.membershipDiscount = 99;

        System.out.println(new Hour4_AccessModifiers().publicNumber);
        System.out.println(new Hour4_AccessModifiers().protectedNumber);
        System.out.println(new Hour4_AccessModifiers().defaultNumber);
        System.out.println(new Hour4_AccessModifiers().privateNumber);
    }
}
