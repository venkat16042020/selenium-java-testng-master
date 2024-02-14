package training.javaPractice;

public class Hour7_integers {
    public static int a = 20;
    public static int b = 12;
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(a + b);
        System.out.println(a-b);
        System.out.println(a*b);
        //gives quotient
        System.out.println(a/b);
        //gives reminder
        System.out.println(a%b);
        System.out.println("--------");
        //gives power to the integer
        System.out.println(a^2);
        System.out.println(a^3);
        System.out.println(a==20);
        System.out.println(a!=20);
        System.out.println(a>=20);
        System.out.println(a<=20);
        int [] numbers = new int[]{2,3,84,28,929};
        System.out.println(Math.max(2,88));
        System.out.println(Math.min(89,2));
        System.out.println(Math.subtractExact(3,1));
        System.out.println(Math.abs(-99));
        System.out.println(Math.round(23.99229));
        System.out.println(Math.addExact(6,19));
        System.out.println(Math.ceil(23.982282));
        System.out.println(Math.floor(23.982282));
        System.out.println(Math.random());
    }
}