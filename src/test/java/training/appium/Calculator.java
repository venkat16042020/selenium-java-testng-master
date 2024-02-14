package training.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Calculator {
    WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException, InterruptedException {
        //Set up desired capabilities and pass the Android app-activity and app-package to Appium
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
//        capabilities.setCapability("device", "Android");
        capabilities.setCapability("deviceName", "testtest");
//        capabilities.setCapability("platformVersion","6.0.1");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("automationName", "EE");
        capabilities.setCapability("app", "C:\\Users\\91891\\Downloads\\ApiDemos.apk");

        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),capabilities);
        System.out.println(driver);
//        driver.get("http://www.goolge.com");
//        Thread.sleep(1000);

//        capabilities.setCapability("appPackage", "com.android.calculator2");
//// This package name of your app (you can get it from apk info app)
//        capabilities.setCapability("appActivity","com.android.calculator2.Calculator"); // This is Launcher activity of your app (you can get it from apk info app)
//Create RemoteWebDriver instance and connect to the Appium server
        //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
    }

    @Test
    public void testCal() throws Exception {
        driver.get("https://google.com");
        //locate the Text on the calculator by using By.name()
//        WebElement two=driver.findElement(By.name("2"));
//        two.click();
//        WebElement plus=driver.findElement(By.name("+"));
//        plus.click();
//        WebElement four=driver.findElement(By.name("4"));
//        four.click();
//        WebElement equalTo=driver.findElement(By.name("="));
//        equalTo.click();
//        //locate the edit box of the calculator by using By.tagName()
//        WebElement results=driver.findElement(By.tagName("EditText"));
//        //Check the calculated value on the edit box
//        assert results.getText().equals("6"):"Actual value is : "+results.getText()+" did not match with expected value: 6";

    }

    @AfterClass
    public void teardown(){
        //close the app
        driver.quit();
    }
}
