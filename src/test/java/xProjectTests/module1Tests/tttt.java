package xProjectTests.module1Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class tttt {
    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");

//        System.setProperty("webdriver.http.factory", "apache");
        ChromeOptions chromeOptions = new ChromeOptions();
        String browserName = "Chrome";
        if (browserName.equalsIgnoreCase("Chrome")) {
//    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.setCapability("platformName", "Windows");
//    chromeOptions.setCapability("se:name", "My simple test");
    WebDriver webDriver;
    try {
        webDriver = new RemoteWebDriver(new URL("http://192.168.0.103:4444"), chromeOptions);
    } catch (MalformedURLException e) {
        throw new RuntimeException(e);
    }
}

//// driver = new RemoteWebDriver(new URL("http://" + username + ":" + access_key + "@hub.lambdatest.com/wd/hub"),
//                capabilities);
//        System.out.println("Started session");
    }
}
