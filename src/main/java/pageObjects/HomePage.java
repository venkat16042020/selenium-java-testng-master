package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage {
    public WebDriver webDriver;

    @FindBy(linkText = "Flights")
    private WebElement flightLink;

    @FindBy(xpath = "//b[text()='Passengers:']")
    private WebElement passengersLbl;

    @FindBy(xpath = "//input[@name='tripType' and @value='oneway']")
    private WebElement oneWayRadioBtn;

    @FindBy(name = "passCount")
    private WebElement passCountSelectBox;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public WebElement getFlightLink() {
        return flightLink;
    }

    public void clickFlightLink() {
        flightLink.click();
        webDriver.navigate().refresh();
        flightLink.click();
        boolean isPassengerFieldDisplayed = getPassengersLbl().isDisplayed();
        Assert.assertTrue(isPassengerFieldDisplayed);
        System.out.println("Flight booking going on......");
    }


    public WebElement getPassengersLbl() {
        return passengersLbl;
    }

    public void setPassengersLbl(WebElement passengersLbl) {
        this.passengersLbl = passengersLbl;
    }

    public WebElement getOneWayRadioBtn() {
        return oneWayRadioBtn;
    }

    public void clickOneWayRadioBtn() {
        oneWayRadioBtn.click();
    }

    public void getPassCountSelectBoxByValue(String value) {
        Select selectObj = new Select(passCountSelectBox);
        selectObj.selectByValue(value);
    }

    public void getPassCountSelectBoxByVisible(String visibleText) {
        Select selectObj = new Select(passCountSelectBox);
        selectObj.selectByVisibleText(visibleText);
    }

    public void getPassCountSelectBoxByIndex(int index) {
        Select selectObj = new Select(passCountSelectBox);
        selectObj.selectByIndex(index);
    }

    public void setPassCountSelectBox(WebElement passCountSelectBox) {
        this.passCountSelectBox = passCountSelectBox;
    }

    public void bookFlight(int noOfPassengers) {
        clickFlightLink();
        getPassCountSelectBoxByIndex(noOfPassengers);
    }

}
