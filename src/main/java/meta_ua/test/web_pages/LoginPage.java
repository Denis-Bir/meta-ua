package meta_ua.test.web_pages;

import meta_ua.test.decorator.ButtonElement;
import meta_ua.test.decorator.InputElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//body/div[1]/div[1]/article[1]/form[1]/div[1]/input[1]")
    public InputElement login;

    @FindBy(xpath = "//body/div[1]/div[1]/article[1]/form[1]/div[2]/input[1]")
    public InputElement password;

    @FindBy(xpath = "//*[@id='login-form']/button")
    public ButtonElement confirmButton;

    @FindBy(xpath = "//input[@id='login-lifetime']")
    public WebElement checkBox;

    @FindBy(xpath = "//a[contains(text(),'Забули пароль')]")
    public WebElement linkForgotPassword;

    public void EnterUsername(String uname) {
        login.send_keys(uname);
        //WriteTextToInputField(login, value, false);
    }

    public void EnterPassword(String pass) {
        password.send_keys(pass);
        //WriteTextToInputField(password, value, false);
    }

    public void ClickConfirmButton(){
        confirmButton.perform_click();
        //ClickElement(confirmButton);
    }

    public boolean IsLoginButtonPresent(){
        return confirmButton.isElementDisplayed();

    }

    public boolean IsLoginButtonEnabled(){
         return confirmButton.isElementEnabled();
    }
}