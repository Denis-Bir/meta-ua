package meta_ua.test.decorator;

import org.openqa.selenium.WebElement;

public class Element {

    protected WebElement webElement;

    public Element(WebElement webElement) {
        this.webElement = webElement;
    }

    public boolean isElementDisplayed() {
        return webElement.isDisplayed();
    }

    public boolean isElementEnabled() {
        return webElement.isEnabled();
    }
}