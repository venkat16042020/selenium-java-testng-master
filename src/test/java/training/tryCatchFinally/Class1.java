package training.tryCatchFinally;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import training.testNgPractice.TestNgBaseTest;

public class Class1  {
    public static int amount=33;
    public final static int charge = 999;
    @Test
    public  void testtest() {
        System.out.println(amount);
        System.out.println();
//        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
//        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
//        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        driver.get(baseUrl);
        System.out.println("part1.....");

            driver.findElement(By.name("userName")).sendKeys("test");

        //If we want to overcome the errors occurred during program execution, we will use
        //try catch block.
        //finally block is optional. But if we mention it, it will execute all time.
        //we can multiple catch blocks.
        System.out.println("username entered");
        try {
            System.out.println("password entering.....");
            driver.findElement(By.name("passwordnn")).sendKeys("test");
            System.out.println("password entered.");
        }catch (NoSuchElementException e){
            System.out.println("Exception message: " + e.getMessage());
        }catch (StaleElementReferenceException e){
            System.out.println("Do this in case of exception....");
        }
            finally {
            System.out.println("Do this finally.....");
        }

        //final: We cannot change the data if we define with final keyword.
        //finalize(); This methods we will use to delete the objects.
        //Java has inbuilt mechanism to execute finalize method.
        //Stale element error: Element is identified. But when about to perform action on
        //element, that element is not intractable. This tyep of error is call stale element error.
        driver.close();
    }
}
