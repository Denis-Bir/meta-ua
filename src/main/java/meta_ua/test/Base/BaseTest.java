package meta_ua.test.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setup() {

        driver = DriverFactory.createInstance("chrome");
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    public WebDriver getDriver() {
        return this.driver;
    }
    public WebDriver setDriver() {
        return this.driver; }

    public WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(driver, 25);
        return wait;

    }

    public void findElementByXpathClick(String xpath) {
        getDriver().findElement(By.xpath(xpath)).click();

    }
    public void waiterXpath(String xpath) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

    }


}








