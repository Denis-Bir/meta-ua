package meta_ua.test.Web_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//body/div[1]/div[1]/article[1]/form[1]/div[1]/input[1]")
    public WebElement login;

    @FindBy(xpath = "//body/div[1]/div[1]/article[1]/form[1]/div[2]/input[1]")
    public WebElement password;

    @FindBy(xpath = "//*[@id='login-form']/button")
    public WebElement confirmButton;

    @FindBy(xpath = "//input[@id='login-lifetime']")
    public WebElement checkBox;

    @FindBy(xpath = "//a[contains(text(),'Забули пароль')]")
    public WebElement linkForgotPassword;

    public void EnterUsername(String value) {
        WriteTextToInputField(login, value, false);
    }

    public void EnterPassword(String value) {
        WriteTextToInputField(password, value, false);
    }

    public void ClickConfirmButton(){
        ClickElement(confirmButton);
    }

    public Object ClickConfirmButtonReturn(){
      ClickElement(confirmButton);
       return null;
    }

    public boolean IsLoginButtonPresent(){
        return IsElementPresent(confirmButton);
    }

    public boolean IsLoginButtonEnabled(){
        return IsElementEnabled(confirmButton);
    }
}