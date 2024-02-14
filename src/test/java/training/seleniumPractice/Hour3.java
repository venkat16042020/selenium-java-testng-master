package training.seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class Hour3 {
    @Test
    public void testHour3_alerts() throws InterruptedException {

        String appUrl = "https://demo.guru99.com/test/delete_customer.php";
        WebDriver driver = new ChromeDriver();
        driver.get(appUrl);
        driver.findElement(By.name("cusid")).sendKeys("77777");
        driver.findElement(By.name("submit")).submit();
        Thread.sleep(9000);
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        System.out.println("Alet text: " + alertText);
        alert.dismiss();
//        alert.accept();
//        alert.sendKeys("Text to enter in text box in the alert");
        driver.quit();

    }

    @Test
    public void testHour3_waits() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // launch Chrome and redirect it to the Base URL
        driver.navigate().to("https://uidai.gov.in/en/my-aadhaar/downloads.html");

        System.out.println(driver.getTitle());
        //4 types of wait methods available:
        //First is java Thread.sleep: It will make test execution wait for the mentioned seconds.
        //syntax is Thread.sleep(3000);
        Thread.sleep(5000);
        //2nd one is: ImplicitlyWait: It is applicable on driver object.
        //If any object is not available in application, driver object makes test wait for
        //specified seconds. Syntax is:
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //3rd one is: ExplicitWait or WebDriverWait: It will help to make test script to wait
        //only for the particular element until it is in expected condition:
        //Ex; until element is clickable, element is displayed etc..
        //Additional benefit of WebDriver wait is: If we mention 20 seconds of wait time,
        //for each 2 seconds, it will check for the element. If element found, it won't
        //wait for entire 20 seconds. It will come out immediately and proceed with next line of code
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("abcd")));
        element.click();

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("destination")));
        element1.click();


//        The following Expected Conditions in Selenium can be used in Explicit Wait:

//        alertIsPresent()
//        elementSelectionStateToBe()
//        elementToBeClickable()
//        elementToBeSelected()
//        frameToBeAvaliableAndSwitchToIt()
//        invisibilityOfTheElementLocated()
//        invisibilityOfElementWithText()
//        presenceOfAllElementsLocatedBy()
//        presenceOfElementLocated()
//        textToBePresentInElement()
//        textToBePresentInElementLocated()
//        textToBePresentInElementValue()
//        titleIs()
//        titleContains()
//        visibilityOf()
//        visibilityOfAllElements()
//        visibilityOfAllElementsLocatedBy()
//        visibilityOfElementLocated()

        //        //Declare and initialise a fluent wait
        //        FluentWait wait = new FluentWait(driver);
        ////Specify the timout of the wait
        //        wait.withTimeout(5000, TimeUnit.MILLISECONDS);
        ////Specify polling time
        //        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        ////Specify what exceptions to ignore
        //        wait.ignoring(NoSuchElementException.class)        //
        ////This is how we specify the condition to wait on.
        //        wait.until(ExpectedConditions.alertIsPresent());

        //In addition to 4 type of waits, we have pageLoadTimeout too.
        //        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @Test
    public void testHour3_actions__right_click() throws InterruptedException {
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        //Actions class will be used to perform actions using mouse and keyboard example like:
        //Double click, Right click, Drag and drop elements, Mouse hover elements,
        // Press UP Arrow KEY, Press DOWN Arrow KEY etc.......
        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .contextClick(link_Home)
                .build();
        mouseOverHome.perform();
        Thread.sleep(8000);
        System.out.println("Right click is happened");
        driver.quit();
    }

    @Test
    public void testHour3_actions__double_click_right_click() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
        //DOUBLE CLICK
        Actions action = new Actions(driver);
        action.doubleClick(element).build().perform();
        boolean is_double_click_msg_displayed = driver.findElement(By.xpath(
                "//p[@id='doubleClickMessage' and text()='You have done a double click']")
        ).isDisplayed();
        Assert.assertTrue(is_double_click_msg_displayed);
        System.out.println("double click is happened");

        //RIGHT CLICK
        WebElement element1 = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
        action.contextClick(element1).build().perform();
        String right_click_msg = driver.findElement(By.id("rightClickMessage")).
                getText();
        Assert.assertEquals("You have done a right click", right_click_msg);
        System.out.println("right click is happened");
        driver.quit();
    }

    @Test
    public void testHour3_actions__mouse_hover(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testsigma.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//a[text()='Resources']"));
        Actions action = new Actions(driver);
        //mouse hover the Resources element
        action.moveToElement(element).build().perform();
        //Identify the locator for the element Blog and click
        driver.findElement(By.linkText("Blog")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://testsigma.com/blog/");
        driver.quit();
    }

    @Test
    public void testHour3_actions__drag_and_drop() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        WebElement source = driver.findElement(By.xpath("//*[@id='credit2']/a"));
        Thread.sleep(3000);
        WebElement target = driver.findElement(By.xpath("//*[@id='bank']/li"));
        action.dragAndDrop(source, target).build().perform();
        Thread.sleep(6000);
        // we have put hard sleep so that the user can see whether the item got dropped to
        // its location or not
        driver.quit();
    }

    @Test
    public void testHour3_actions__Key_up() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//textarea[@title='Search']"));
        Actions action = new Actions(driver);
        //holds the SHIFT key and converts the text to uppercase
        action.keyDown(element, Keys.SHIFT).sendKeys("testSigma").build().perform();
        Thread.sleep(8000);
        // we have put hard sleep so that the user can visualize the change
        driver.quit();
    }

}