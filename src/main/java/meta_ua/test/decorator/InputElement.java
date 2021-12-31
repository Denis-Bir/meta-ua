package meta_ua.test.decorator;

import org.openqa.selenium.WebElement;

public class InputElement extends Element {

    public InputElement(WebElement webElement) {
        super(webElement);
    }

    public void send_keys(String value) {
        //webElement.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        webElement.sendKeys(value);
    }
}
