package xProjectTests.module1Tests;


import baseTest.TestNgBaseTest;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import config.Config;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

import java.io.File;
import java.io.IOException;

public class Module1Tests extends TestNgBaseTest {
    ExtentTest extentTest;

    @Test(priority = 1)
    public void Module1TestSrs1001BookFlightValidScenario() {
        System.out.println("Test1 is started....");
        LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
        HomePage homePage = loginPage.login(Config.userName, Config.password);
        String expectedTitle = "Login: Mercury Tours";
        String actualTitle = getWebDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Verify app title");
        homePage.bookFlight(2);

        extentTest.log(Status.PASS, "Login Successful");
        extentTest.log(Status.PASS, "Ticket Created");
        extentTest.log(Status.INFO, "No of passengers shown correct");

        String imageLoc = Config.reportFilePath+ System.currentTimeMillis() + ".png";
        // Take screenshot and store as a file format
        File src=((TakesScreenshot)getWebDriver()).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the screenshot to desired location using copyFile method
            FileUtils.copyFile(src, new File(imageLoc));
            extentTest.log(Status.INFO, "Tried ticket with 3 passengers.", MediaEntityBuilder.createScreenCaptureFromPath(imageLoc).build());
        } catch (IOException e)
        {
            System.out.println("Error in the captureAndDisplayScreenShot method: " + e.getMessage());
        }

    }

    @Test(priority = 2)
    public void Module2TestSrs1002BookFlightInvalidScenario() {


        LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
        HomePage homePage = loginPage.login(Config.userName, Config.password);
        String expectedTitle = "Login: Mercury Tours";
        String actualTitle = getWebDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Verify app title");
        extentTest.log(Status.PASS, "Login Successful");
        extentTest.log(Status.INFO, "Tried to book ticket with invalid number of passengers count");
        try {
            homePage.bookFlight(30);
            extentTest.log(Status.FAIL, "Ticket got Created with 30 passengers" );
        }catch (NoSuchElementException e){
            extentTest.log(Status.PASS, "Ticket Not Created with 30 passengers");
        }
        String extentReportImage = Config.reportFilePath+ System.currentTimeMillis() + ".png";
        // Take screenshot and store as a file format
        File src=((TakesScreenshot)getWebDriver()).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the screenshot to desired location using copyFile method
            FileUtils.copyFile(src, new File(extentReportImage));
            extentTest.log(Status.INFO,  MediaEntityBuilder.createScreenCaptureFromPath(extentReportImage).build());
        } catch (IOException e)
        {
            System.out.println("Error in the captureAndDisplayScreenShot method: " + e.getMessage());
        }
    }

    @BeforeMethod(dependsOnMethods = "generateExtentTestReport")
    public void initiateExtentTest(ITestResult result){
        extentTest=  extentReport.createTest(result.getMethod().getMethodName());
    }

}