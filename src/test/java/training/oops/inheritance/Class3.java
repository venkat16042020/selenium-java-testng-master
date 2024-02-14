package training.oops.inheritance;

public class Class3 {

    public int area = 29;
    public  int volume = 93;

    public static int circumference = 58;

    public Class3(){

    }

    public Class3(int circumference){
        this.circumference = circumference;
    }

    public void method1(){
        System.out.println("method1 in class3");
    }
    public void method2(){
        System.out.println("method2 in class3. Circumference: "  + circumference);
    }
    public void method3(){
        System.out.println("method3 in class3");
    }
    public static void method4(){
        System.out.println("static method4 in class3");
    }

    public void method5(){
        System.out.println("method5 in class3");
    }
}