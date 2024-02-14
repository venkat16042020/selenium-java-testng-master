package training.javaPractice;

import java.util.Arrays;

public class Hour7_Strings {
    public String name = "Venkat";
    public String name1 = new String("John");
    public static String text = "Product has been created successfully.";

    public static void main(String[] args) {
        System.out.println(new Hour7_Strings().name);
        System.out.println(new Hour7_Strings().name1);
        System.out.println(text);
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.length());
        System.out.println(text.charAt(2));
        System.out.println((text.compareTo("Product has been created.")));
        System.out.println("Product".compareToIgnoreCase("product"));
        System.out.println(text.concat(" For customer Alex John."));
        System.out.println(text.contains("success"));
        System.out.println(text.endsWith("successfully."));
        System.out.println("Product".equalsIgnoreCase("product"));
        System.out.println(text.startsWith("Product"));
        System.out.println(text.compareTo("Product has been created successfully."));
        System.out.println(text.indexOf('h'));
        System.out.println(text.isBlank());
        System.out.println(text.isEmpty());
        System.out.println(text.lastIndexOf('c'));
        System.out.println(text.repeat(2));
        System.out.println(text.replace('c', 'C'));
        System.out.println(text.replaceAll("c", "C"));
        String[] x = text.split("s", 3);
        System.out.println(Arrays.toString(x));
        System.out.println("   hello   ".strip());
        System.out.println("   hello   ". stripLeading());
        System.out.println("   hello   " . stripTrailing());
        System.out.println("   hello    ".trim());
        System.out.println(text.substring(4));
        System.out.println(text.substring(4,10));
        System.out.println(text.split(" ",3));
        char [] chars = text.toCharArray();
        System.out.println(Arrays.toString(chars));
        System.out.println(text.subSequence(1,5));

    }
}