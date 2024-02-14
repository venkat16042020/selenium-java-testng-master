package libraries;


import globalConfigData.GlobalTestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverUtility {
    private static WebDriver webDriver ;
    //declared constructor as private
    private WebDriverUtility()
    {
    }

    //declared static method that returns the object of singleton class
    public static WebDriver getWebDriverInstance(String browserName) {
        if(webDriver == null)
            if (browserName.equalsIgnoreCase("Chrome")) {
//                ChromeOptions chromeOptions = new ChromeOptions();
//                chromeOptions.setCapability("platformName", "Windows");
//                chromeOptions.setCapability("se:name", "My simple test");
                webDriver = new ChromeDriver();
//                try {
//                    webDriver = new RemoteWebDriver(new URL(GlobalTestData.seleniumGridHubUrl), chromeOptions);
//                } catch (MalformedURLException e) {
//                    throw new RuntimeException(e);
//                }
            }

// driver = new RemoteWebDriver(new URL(http:// + username + ":" + access_key + "@hub.lambdatest.com/wd/hub"),
        //capabilities);
        System.out.println("Started session.......");

        return webDriver;
    }

}