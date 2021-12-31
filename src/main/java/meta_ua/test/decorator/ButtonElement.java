package meta_ua.test.decorator;

import org.openqa.selenium.WebElement;

public class ButtonElement extends Element {

    public ButtonElement(WebElement webElement) {
        super(webElement);
    }

    public void perform_click() {
       webElement.click();
    }
}

