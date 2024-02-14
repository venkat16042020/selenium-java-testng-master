package training.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Hour4 {

    @Test
    public void testHour4_frames_1(){

        WebDriver driver = new ChromeDriver(); //navigates to the Browser
        driver.get("https://demo.guru99.com/test/guru99home/");
        // navigates to the page consisting an iframe

        driver.manage().window().maximize();
        driver.switchTo().frame("a077aa5e"); //switching the frame by ID

        System.out.println("********We are switch to the iframe*******");
        //Clicks element in the iframe
        driver.findElement(By.xpath("html/body/a/img")).click();

        System.out.println("current url: " + driver.getCurrentUrl());
        driver.switchTo().defaultContent();

        driver.findElement(By.id("philadelphia-field-email")).sendKeys("abc@abc.com");
        driver.findElement(By.id("philadelphia-field-submit")).click();
        driver.switchTo().alert().accept();
        System.out.println("*********We are done***************");
    }

    @Test
    public void testHour4_frames_2(){
        WebDriver driver = new ChromeDriver();
        driver.get("URL");// URL OF WEBPAGE HAVING FRAMES
//First finding the element using any of locator strategy
        WebElement iframeElement = driver.findElement(By.id("iFrameResult"));
//now using the switch command to switch to main frame.
        driver.switchTo().frame(0);
//Perform all the required tasks in the frame 0

        // Switch to the parent frame
        driver.switchTo().frame("parent-frame");

// Switch to the child frame
        driver.switchTo().frame("child-frame");

// Interact with elements inside the child frame
        WebElement childElement = driver.findElement(By.id("child-element"));
        childElement.click();

// Switch back to the parent frame
        driver.switchTo().parentFrame();

// Interact with elements inside the parent frame
        WebElement parentElement = driver.findElement(By.id("parent-element"));
        parentElement.click();

// Switch back to the "default content" or "main window"
        driver.switchTo().defaultContent();
        driver.quit();
    }

    @Test
    public void testHour4_browserWindows_1() throws InterruptedException {
        WebDriver driver = new ChromeDriver(); //navigates to the Browser
        driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
        // navigates to the page consisting an iframe

        driver.manage().window().maximize();
        System.out.println("Window handles with one window: " + driver.getWindowHandles());

        driver.findElement(By.xpath("//a[@title='TimeTable / Track']")).click();
        driver.findElement(By.xpath("//a[text()='All services Time Table & Tracking']")).click();
        String firstWindowHandle = driver.getWindowHandle();
        System.out.println("Window handles with two window2: " + driver.getWindowHandles());

        System.out.println("First browser window handle: " + firstWindowHandle);
        System.out.println("First browser window title: " + driver.getTitle());

        Set<String> windowHandles = driver.getWindowHandles();

        Iterator<String> iterator = windowHandles.iterator();
        String subWindowHandler="";
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler);
        System.out.println("Second Window handle: " + subWindowHandler);
        System.out.println("Second Window title: " + driver.getTitle());
        Thread.sleep(15000);
        driver.close();
        driver.switchTo().window(firstWindowHandle);
        System.out.println("First Window handle: " + subWindowHandler);
        System.out.println("First Window title: " + driver.getTitle());
        driver.quit();

    }

}