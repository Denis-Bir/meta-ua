package meta_ua.test.web_pages;

import meta_ua.test.base.WebDriverConfig;
import meta_ua.test.decorator.CustomDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class BasePage {

    public WebDriver driver;

    public BasePage() {
        this.driver = WebDriverConfig.getBaseChromeDriver();
        PageFactory.initElements(new CustomDecorator(driver), this);
    }

    protected void WaitForElementVisibility(WebElement element) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).
                withTimeout(Duration.ofSeconds(30)).
                pollingEvery(Duration.ofMillis(200));

        wait.until((webDriver -> {
            try {
                return element.isDisplayed();
            } catch (NoSuchElementException e) {
                return false;
            }
        }));
    }
//
//    public void WriteTextToInputField(WebElement element, String value, boolean doHitEnterKey) {
//        this.WaitForElementVisibility(element);
//        element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
//        element.sendKeys(value);
//
//        if (doHitEnterKey) {
//            element.sendKeys(Keys.chord(Keys.ENTER));
//        }
//    }

    public void dropdownSelect(WebElement element, int index) {
        this.WaitForElementVisibility(element);
        Select select = new Select(element);
        select.selectByIndex(index);

    }

    public void dropdownSelectMonth(WebElement element, String value) {
        this.WaitForElementVisibility(element);
        Select select = new Select(element);
        select.selectByVisibleText(value);

    }
}






