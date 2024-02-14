package training.testNgPractice;

import org.testng.annotations.*;

public class TestNgBaseTest {

    @BeforeSuite
    public void startingTestSuite(){
        System.out.println("Starting..test suite");
    }

    @BeforeGroups
    public void startingGroupTests(){
        System.out.println("Starting group tests....");
    }
    @BeforeClass
    public void startingModuleTests(){
        System.out.println("Starting..module/class tests....");
    }

    @BeforeTest
    public void startingTest(){
        System.out.println("Starting...test....");
    }
    @BeforeMethod
    public void launchBrowser(){
        System.out.println("launch browser....");
    }

    @AfterSuite
    public void afterTestSuite(){
        System.out.println("After test suite ran...");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After test module/class run...");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After test run.......");
    }
    @AfterGroups
    public void afterGroup(){
        System.out.println("After group test run...");
    }


    @AfterMethod
    public void closeBrowser(){
        System.out.println("closing browser....");
    }
}
