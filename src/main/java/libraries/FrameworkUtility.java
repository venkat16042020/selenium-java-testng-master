package libraries;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class FrameworkUtility {

    public WebDriver webDriver;

    public FrameworkUtility(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public static void captureScreenShot(WebDriver driver, String fileLocation) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(fileLocation));
    }

    public void clickElement(WebElement webElement) {
        if (webElement.isDisplayed()) {

        }
    }
}
