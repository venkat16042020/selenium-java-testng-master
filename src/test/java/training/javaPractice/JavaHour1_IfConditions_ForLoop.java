package training.javaPractice;


import java.util.Arrays;

public class JavaHour1_IfConditions_ForLoop {
    public static void main(String[] args) {

        int marks = 95;
        //decision-making
        if (marks > 90) {
            System.out.println("Excellent marks");
        } else if (marks > 70) {
            {
                System.out.println("Good marks");
            }
        } else {
            System.out.println("Need to improve");
        }
        System.out.println("....if block is completed........");
        //to iterate the code
        for (int i = 0; i <= 30; i++) {
            System.out.println("for loop. iteration number: " + i);
            if (i <= 10) {
                System.out.println("if block for iteration number: " + i);
            } else if (i > 10 && i <= 25) {
                System.out.println("else-if block for iteration number: " + i);
            } else {
                System.out.println("else-block: " + i);
                break;
            }
            System.out.println("going to next loop");
        }
        System.out.println("....for(used break in it) block is completed........");
        for(int i=1;i<=10;i++){
            if(i==5){
                //using continue statement
                continue;//it will skip the rest statement
            }
            System.out.println(i);
            System.out.println("do the actions here....");
        }
        System.out.println("....for(used continue in it) block is completed........");

        int a = 6;
        // do-while: loop iterates until condition is true.
        //But validation of the condition is after iteration execution is done
        do
        {
            System.out.println("do while loop " + a);
            a = a+1;
        }while(a<9);

        System.out.println("....do-while block is completed........");

        //while loop: loop iterates until condition is true.
        //condition will be checked before to execute the iteration
        while (a<15){
            System.out.println("while loop " + a);
            a = a+1;
        }
        System.out.println("....while block is completed........");

        int numbers []= new int[5];
        char [] chars = new char[6];
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(numbers));
        numbers[0]=2;
        numbers[1]=22;
        numbers[2]=54;
        numbers[4]=94;
//        numbers[5]=932;
//        numbers[6]=2;
        chars[0]='A'; chars[1]='b'; chars[2]='C'; chars[3]='A'; chars[4]='G';
        System.out.println(numbers);
        System.out.println(Arrays.toString(chars));
        int [] discounts = new int[]{2,3,2,23,23,39,29,289,22,21};
        System.out.println(Arrays.toString(discounts));

        System.out.println("....arrays block is completed........");

        //for each will iterate for all the elements in the array
        for(int x : discounts ){
            System.out.println("for-each loop " + x);
        }
        System.out.println("....for-each block is completed........");

    }


}