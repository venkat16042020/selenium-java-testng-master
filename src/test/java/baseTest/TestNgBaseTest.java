package baseTest;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import config.Config;
import libraries.CommonUtility;
import libraries.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;

public class TestNgBaseTest  {

    private WebDriver webDriver;
    public static ExtentReports extentReport;

    @BeforeSuite
    @Parameters({"env","browser"})
    public void readConfigData(ITestContext iTestContext,ITestResult result, String env, String browser){
        System.out.println("reading config data");
        System.out.println(env);
        Config.env = env;
        Config.browserName = browser;
        new Config(env, browser);

        extentReport = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(Config.reportFilePath+
                "TestReport" + iTestContext.getSuite().getName() +
                System.currentTimeMillis()+".html");
        extentReport.attachReporter(spark);

    }

    @BeforeClass
    public void invokeBrowserSession(){
        setWebDriver(WebDriverUtility.getWebDriverInstance(Config.browserName));
        getWebDriver().manage().window().maximize();
        getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(CommonUtility.wait5Sec));
    }

    @BeforeMethod
    public void generateExtentTestReport(ITestResult result){
        getWebDriver().get(Config.appUrl);
//        setExtentTest(getExtentReport().createTest(result.getMethod().getMethodName()));
    }

    @AfterClass
    public void closeBrowser() {
        getWebDriver().close();
        getWebDriver().quit();
    }

    @AfterSuite
    public void publishReportDataToHtml(){
        extentReport.flush();
    }
    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }



}