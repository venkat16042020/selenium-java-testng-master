package training.testNgPractice;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginModuleTests {
    @Test(priority = 2)
    public void test11(){
        System.out.println("test11.....");
    }
    @Test
    public void test12(){
        System.out.println("test12.....");
    }
    @Test(priority = 1)
    @Parameters({"browser"})
    public void test13(String browser){
        System.out.println("Running tests on browser: " + browser);
        System.out.println("test13.....");
    }

    @Test(priority = 2)
    public void test15(){
        System.out.println("test15......");
    }

    @Test
    public void test116() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("test116......");
    }
    @Test
    public void test117(){
        System.out.println("test117......");
        Assert.assertEquals("abc", "abc", "some msg");
        Assert.assertTrue(false, "user defined message");
        System.out.println("end of test117....");
    }

    @Test
    public void test118(){
        System.out.println();
        int expectedPulseCount = 20;
        int actualPulseCount = 30;
        System.out.println("part1.....");
        SoftAssert softAssert = new SoftAssert();
        boolean isPulseCountCorrect = expectedPulseCount == actualPulseCount;
        softAssert.assertTrue(false);
        System.out.println("part2...");
        softAssert.assertAll();
    }

    @Test(retryAnalyzer = Retry.class)
    public void test119(){
        int a = 25;
        System.out.println("test119");
        boolean expectedStatus = false;
        Assert.assertTrue(expectedStatus, "failing...");
    }
}