package training.javaPractice;

import java.util.Arrays;

public class Hour5_Arrays_do_while_foreach {
    public int [] numbers = new int[5];
    public char [] chars = new char[6];

    public static void main(String[] args) {
        new Hour5_Arrays_do_while_foreach().printAllArrayElements();
    }
    public void printAllArrayElements(){
        System.out.println(Arrays.toString(this.chars));
        System.out.println(Arrays.toString(this.numbers));
        numbers[0]=2;
        numbers[1]=22;
        numbers[2]=54;
        numbers[4]=94;
//        numbers[5]=932;
//        numbers[6]=2;
        chars[0]='A'; chars[1]='b'; chars[2]='C'; chars[3]='A'; chars[4]='G'; chars[5]='S';
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(chars));
        int [] discounts = new int[]{2,3,2,23,23,39,29,289,22,21};
        System.out.println(Arrays.toString(discounts));

        //for each will iterate for all the elements in the array
        for(int discount : discounts ){
            System.out.println("for each loop " + discount);
        }
        int a = 6;
        // do-while: loop iterates until condition is true.
        //But validation of the condition is after iteration execution is done
        do
         {
            System.out.println("do while loop " + a);
            a = a+1;
        }while(a<9);
        //while loop: loop iterates until condition is true.
        //condition will be checked before to execute the iteration
        while (a<15){
            System.out.println("while loop " + a);
            a = a+1;
        }


    }

}
