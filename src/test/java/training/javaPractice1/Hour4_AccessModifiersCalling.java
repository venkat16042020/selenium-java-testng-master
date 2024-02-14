package training.javaPractice1;

import training.javaPractice.Hour4_AccessModifiers;

public class Hour4_AccessModifiersCalling extends Hour4_AccessModifiers {
    public  int amount = 20;
    public int discount = 2;
    public boolean isAccountActive = true;
    public Hour4_AccessModifiersCalling(){
        System.out.println("kdkd");
    }

    public Hour4_AccessModifiersCalling(int amount, int discount, boolean isAccountActive){
        //default object of current class
        Hour4_AccessModifiersCalling obj = new Hour4_AccessModifiersCalling();
        obj.amount = amount;
        //this: it is the current class object. (similar to obj here. no difference).
        //we no need to create current class object explicitly.
        this.discount = discount;
        this.isAccountActive = isAccountActive;

    }
    public static void main(String[] args) {
        Hour4_AccessModifiers obj = new Hour4_AccessModifiers();
        System.out.print(obj.publicNumber);
//        System.out.print(obj.protectedNumber);
        Hour4_AccessModifiersCalling ob = new Hour4_AccessModifiersCalling();
        //Reading protected number which is defined in another class
        System.out.println(ob.protectedNumber);
        Hour4_AccessModifiersCalling obj1 = new Hour4_AccessModifiersCalling();
        System.out.println(obj1.amount);
        System.out.println(obj1.discount);
        System.out.println(obj1.isAccountActive);
        System.out.println(obj1.protectedNumber);

        Hour4_AccessModifiersCalling audiObj = new Hour4_AccessModifiersCalling(8,3,false);
        System.out.println(audiObj.amount);
        System.out.println(audiObj.discount);
        System.out.println(audiObj.isAccountActive);

        Hour4_AccessModifiersCalling bengObj = new Hour4_AccessModifiersCalling(18,13,true);
        System.out.println(bengObj.amount);
        System.out.println(bengObj.discount);
        System.out.println(bengObj.isAccountActive);
    }
}
