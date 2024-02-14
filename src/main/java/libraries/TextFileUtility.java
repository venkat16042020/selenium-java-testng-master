package libraries;


import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TextFileUtility {

    public static void readTextFile(String filePath) throws IOException {
        System.out.println("Start read text file");
        // File path is passed as parameter
        File file = new File(filePath);
        FileReader fr = new FileReader(file);
        // Creating an object of BufferedReader class
        BufferedReader br = null;
        br = new BufferedReader(fr);
        // Declaring a string variable
        String st="";
        // Condition holds true till there is character in a string
        while ((st = br.readLine()) != null) {
            // Print the string
            System.out.println(st);
        }

    }
    public static void writeTextFile(String filePath) throws IOException {
        System.out.println("Start write text file");
        // File path is passed as parameter
        File file = new File(filePath);

        FileWriter fw = new FileWriter(file);
        Date d = new Date();
        fw.append("Last run time was : " + d.toString());
        fw.close();
    }


}
