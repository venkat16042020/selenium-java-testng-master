package training.javaPractice;

public class Hour6_terinaryOperatory_switch_enum {
    public static void main(String[] args) {
        int num = 2;
        boolean isGoodMarks = num>20?true:false;
        System.out.println(isGoodMarks);

        char colorCode = 'G';
        switch (colorCode){
            case 'O':
                System.out.println("Orange");
            case 'B':
                System.out.println("Blue");
            case 'G':
                System.out.println("Green");
            case 'R':
                System.out.println("Red");
            case 'W':
                System.out.println("White");
            default:
                System.out.println("program completed!");
        }
    }
}
