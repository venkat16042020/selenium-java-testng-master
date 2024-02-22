package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//What is pageObject class?
//We will keep all the locators details in a page object class. And we maintain methods for the functionalities
//going to be performed on the page.
//syntax for the creating a page object is:
//@FindBy(name = "username"); private WebElement usernameTxtBox;

public class LoginPage {
    public WebDriver webDriver;
    @FindBy(name = "username")
    private WebElement usernameTxtBox;

    @FindBy(name = "password")
    private WebElement passwordTxtBox;

    @FindBy(name = "submit")
    private WebElement loginBtn;

    public LoginPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public WebElement getUsernameTxtBox() {
        return usernameTxtBox;
    }

    public WebElement getPasswordTxtBox() {
        return passwordTxtBox;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public HomePage login(String username, String password) {
        usernameTxtBox.sendKeys(username);
        passwordTxtBox.sendKeys(password);
        loginBtn.click();
        System.out.println("Login is success....");
        return PageFactory.initElements(webDriver, HomePage.class);
    }

}