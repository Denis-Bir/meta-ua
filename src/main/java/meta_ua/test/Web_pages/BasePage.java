package meta_ua.test.Web_pages;

import meta_ua.test.Base.WebDriverConfig;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class BasePage {

    public WebDriver driver;

    public BasePage(){
        this.driver = WebDriverConfig.getBaseChromeDriver();
        PageFactory.initElements(driver, this);
    }

    protected void WaitForElementVisibility(WebElement element) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).
                withTimeout(Duration.ofSeconds(30)).
                pollingEvery(Duration.ofMillis(200));

        wait.until((webDriver -> {
            try {
                return element.isDisplayed();
            } catch (NoSuchElementException e){
                return false;
            }
        }));
    }

    public void WriteTextToInputField(WebElement element, String value, boolean doHitEnterKey) {
        this.WaitForElementVisibility(element);
        element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        element.sendKeys(value);

        if(doHitEnterKey) {
            element.sendKeys(Keys.chord(Keys.ENTER));
        }
    }

    public void dropdownSelect (WebElement element, int index){
        this.WaitForElementVisibility(element);
        Select select = new Select(element);
        select.selectByIndex(index);

    }

    public void dropdownSelectMonth (WebElement element, String value){
        this.WaitForElementVisibility(element);
        Select select = new Select(element);
        select.selectByVisibleText(value);

    }

    public void ClickElement(WebElement element) {
        this.WaitForElementVisibility(element);
        element.click();
    }

    public boolean IsElementPresent(WebElement element){
        this.WaitForElementVisibility(element);
        return element.isDisplayed();
    }

    public boolean IsElementEnabled(WebElement element){
        this.WaitForElementVisibility(element);
        return element.isEnabled();
    }


    public WebDriver getWebDriverChoose(String browserName){
        switch (browserName){
            case "chrome":
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            default:
                throw new RuntimeException("Incorrect BrowserName");
        }
    }
}
