package meta_ua.test.Web_pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationForm extends BasePage {
    private WebDriver driver;

    @FindBy (xpath= "//*[@id=\"regForm\"]/div/div[2]/input")
    public  WebElement inputNewEmail;

    @FindBy (xpath = "//*[@id=\"regForm\"]/div/div[5]/input")
    public WebElement name;

    @FindBy (xpath = "//*[@id=\"regForm\"]/div/div[6]/input")
    public WebElement surname;

    @FindBy (xpath = "//div[10]/select[1]")
    public WebElement selectDay;

    @FindBy (xpath = "//div[11]/select[1]")
    public WebElement selectMonth;

    @FindBy (xpath = "//div[12]/select[1]")
    public WebElement selectYear;

    @FindBy (xpath = "//div[18]/input[1]")
    public WebElement setPassword;

    @FindBy (xpath = "//div[18]/input[1]")
    public WebElement repeatPassword;

    @FindBy (xpath = "//div[19]/input[1]")
    public WebElement phoneNumber;

    @FindBy (xpath = "//button[contains(text(),'Підтвердити телефон')]")
    public WebElement buttonConfirmPhoneNumber;

    @FindBy (xpath = "//a[contains(text(),'\"Угоди з користувачем на використання персональних')]")
    public WebElement licenceLink;

    @FindBy (xpath = "//a[contains(text(),'\"Угодою про конфіденційність\"')]")
    public WebElement secondLicenceLink;

    @FindBy (xpath = "//input[@id='check_agree']")
    public WebElement licenceCheckBox;

    @FindBy (xpath = "//input[@id='register_btn']")
    public WebElement registerButton;

    public void dropDownSelectDay (int index){ dropdownSelect(selectDay, index);}
    public void dropdownSelectMonth (String value){ dropdownSelectMonth(selectMonth, value);}
    public void dropDownSelectYear (int index){ dropdownSelect(selectYear, index);}
    public void EnterUserLogin(String value) {
        WriteTextToInputField(inputNewEmail, value, false);
    }
    public void EnterUsername(String value) {
        WriteTextToInputField(name, value, false);
    }
    public void EnterUserSurname(String value) {
        WriteTextToInputField(surname, value, false);
    }
    public void SetUserPassword(String value) {
        WriteTextToInputField(setPassword, value, false);
    }
    public void RepeatUserPassword(String value) {
        WriteTextToInputField(repeatPassword, value, false);
    }
    public void EnterUserPhoneNumber(String value) {
        WriteTextToInputField(phoneNumber, value, false);
    }

    public RegistrationForm (WebDriver driver){
        this.driver=driver;

        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public RegistrationForm() {
        return;
    }
}
