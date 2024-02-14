package training.javaPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BytecodeReader {

    public static void main(String[] args) throws IOException {
        Path classfile = Path.of("C:\\Users\\91891\\IdeaProjects\\selenium-java-testng\\target\\test-classes\\org\\xproject\\accounts\\javaPractice\\A.class");// put path of your classfile here
        byte[] bytes = Files.readAllBytes(classfile);
        for (byte aByte : bytes) {
            //ref https://stackoverflow.com/a/12310078/893197
            String byteString = String.format("%8s", Integer.toBinaryString(aByte & 0xFF))
                    .replace(' ', '0');
            System.out.println(byteString);
        }
    }
}