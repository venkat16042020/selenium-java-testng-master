package xProjectTests.module2Tests;



import baseTest.TestNgBaseTest;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import config.Config;
import libraries.CommonUtility;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

import java.io.File;
import java.io.IOException;


public class Module2Tests extends TestNgBaseTest {
    ExtentTest extentTest;
    @Test
    public void Module2TestSrs1003MakePaymentValidScenario() {
        System.out.println("Test1 is started....");
        LoginPage loginPage =  PageFactory.initElements(getWebDriver(), LoginPage.class);
        HomePage homePage = loginPage.login(Config.userName, Config.password);
        String expectedTitle = "Login: Mercury Tours";
        String actualTitle = getWebDriver().getTitle();
//        CommonUtility.wait15Sec.set(11);
        extentTest.log(Status.INFO,"test1...."+
                "Current Thread Name: " + Thread.currentThread().getName()+
                "Current Thread Id: " + Thread.currentThread().getId()+
                "var id: "+ CommonUtility.wait15Sec.get());

        extentTest.log(Status.PASS, "Valid payments..abcd..");
        extentTest.log(Status.PASS, "Valid payments..efg..");
        extentTest.log(Status.PASS, "Valid payments..hij..");

        String imageLoc = Config.reportFilePath+ System.currentTimeMillis() + ".png";
        // Take screenshot and store as a file format
        File src=((TakesScreenshot)getWebDriver()).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the screenshot to desired location using copyFile method
            FileUtils.copyFile(src, new File(imageLoc));
            extentTest.log(Status.INFO, "Tried ticket with 3 passengers.",
                    MediaEntityBuilder.createScreenCaptureFromPath(imageLoc).build());
        } catch (IOException e)
        {
            System.out.println("Error in the captureAndDisplayScreenShot method: " + e.getMessage());
        }

    }

    @Test(invocationCount = 1)
    public void Module2TestSrs1004MakePaymentInvalidScenarios() {
        System.out.println("Test2 is started....");
        LoginPage loginPage =  PageFactory.initElements(getWebDriver(), LoginPage.class);
        HomePage homePage = loginPage.login(Config.userName, Config.password);
        String expectedTitle = "Login: Mercury Tours";
        String actualTitle = getWebDriver().getTitle();
//        CommonUtility.wait15Sec.set(121);
        extentTest.log(Status.INFO,"test2...."+
                "Current Thread Name: " + Thread.currentThread().getName()+
                "Current Thread Id: " + Thread.currentThread().getId()+
                "var id: "+ CommonUtility.wait15Sec.get());

        extentTest.log(Status.PASS, "Invalid payments..abcd..");
        extentTest.log(Status.PASS, "Invalid payments..efg..");
        extentTest.log(Status.PASS, "Invalid payments..hij..");

        String imageLoc = Config.reportFilePath+ System.currentTimeMillis() + ".png";
        // Take screenshot and store as a file format
        File src=((TakesScreenshot)getWebDriver()).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the screenshot to desired location using copyFile method
            FileUtils.copyFile(src, new File(imageLoc));
            extentTest.log(Status.INFO, "Tried ticket with 5 passengers.",
                    MediaEntityBuilder.createScreenCaptureFromPath(imageLoc).build());
        } catch (IOException e)
        {
            System.out.println("Error in the captureAndDisplayScreenShot method: " + e.getMessage());
        }
    }


    @Test(invocationCount = 1)
    public void Module2TestSrs1009Test() {
        System.out.println("Test2 is started....");
        LoginPage loginPage =  PageFactory.initElements(getWebDriver(), LoginPage.class);
        HomePage homePage = loginPage.login(Config.userName, Config.password);
        String expectedTitle = "Login: Mercury Tours";
        String actualTitle = getWebDriver().getTitle();
//        CommonUtility.wait15Sec.set(121);
        extentTest.log(Status.INFO,"test2...."+
                "Current Thread Name: " + Thread.currentThread().getName()+
                "Current Thread Id: " + Thread.currentThread().getId()+
                "var id: "+ CommonUtility.wait15Sec.get());

        extentTest.log(Status.PASS, "Invalid payments..abcd..");
        extentTest.log(Status.PASS, "Invalid payments..efg..");
        extentTest.log(Status.PASS, "Invalid payments..hij..");

        String imageLoc = Config.reportFilePath+ System.currentTimeMillis() + ".png";
        // Take screenshot and store as a file format
        File src=((TakesScreenshot)getWebDriver()).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the screenshot to desired location using copyFile method
            FileUtils.copyFile(src, new File(imageLoc));
            extentTest.log(Status.INFO, "Tried ticket with 5 passengers.",
                    MediaEntityBuilder.createScreenCaptureFromPath(imageLoc).build());
        } catch (IOException e)
        {
            System.out.println("Error in the captureAndDisplayScreenShot method: " + e.getMessage());
        }
    }



    @BeforeMethod
    public void initiateExtentTest(ITestResult result){
        extentTest=  extentReport.createTest(result.getMethod().getMethodName());
    }

}