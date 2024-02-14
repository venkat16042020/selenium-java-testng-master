package training.oops.inheritance;



public class Class2 {
    public int amount = 34;
    public int discount = 88;

    public static void main(String[] args) {
        System.out.println();
        Class2 class2_Obj = new Class2();
        class2_Obj.method1();
    }
    public void method1(){
        System.out.println("method1 in class2");
        new Class3().method2();

    }
    public void method2(){
        System.out.println("method2 in class2");
    }
    public void method3(){
        System.out.println("method3 in class2");
    }
}