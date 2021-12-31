package meta_ua.test.web_pages;


import meta_ua.test.decorator.ButtonElement;
import meta_ua.test.decorator.InputElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationForm extends BasePage {
    private WebDriver driver;

    @FindBy (xpath= "//*[@id=\"regForm\"]/div/div[2]/input")
    public InputElement login;

    @FindBy (xpath = "//*[@id=\"regForm\"]/div/div[5]/input")
    public InputElement name;

    @FindBy (xpath = "//*[@id=\"regForm\"]/div/div[6]/input")
    public InputElement surname;

    @FindBy (xpath = "//div[10]/select[1]")
    public WebElement selectDay;

    @FindBy (xpath = "//div[11]/select[1]")
    public WebElement selectMonth;

    @FindBy (xpath = "//div[12]/select[1]")
    public WebElement selectYear;

    @FindBy (xpath = "//div[18]/input[1]")
    public InputElement setPassword;

    @FindBy (xpath = "//div[18]/input[1]")
    public InputElement repeatPassword;

    @FindBy (xpath = "//div[19]/input[1]")
    public InputElement phoneNumber;

    @FindBy (xpath = "//button[contains(text(),'Підтвердити телефон')]")
    public WebElement buttonConfirmPhoneNumber;

    @FindBy (xpath = "//a[contains(text(),'\"Угоди з користувачем на використання персональних')]")
    public WebElement licenceLink;

    @FindBy (xpath = "//a[contains(text(),'\"Угодою про конфіденційність\"')]")
    public WebElement secondLicenceLink;

    @FindBy (xpath = "//input[@id='check_agree']")
    public WebElement licenceCheckBox;

    @FindBy (xpath = "//input[@id='register_btn']")
    public ButtonElement registerButton;

    public void login (String nname){login.send_keys(nname);}
    public void name (String newname){ name.send_keys(newname); }
    public void surname (String sname){surname.send_keys(sname);}
    public void setPassword (String nname){setPassword.send_keys(nname);}
    public void repeatPassword (String name){repeatPassword.send_keys(name); }
    public void phoneNumber (String pnumber){login.send_keys(pnumber);}

    public void dropDownSelectDay (int index){ dropdownSelect(selectDay, index);}
    public void dropdownSelectMonth (String value){ dropdownSelectMonth(selectMonth, value);}
    public void dropDownSelectYear (int index){ dropdownSelect(selectYear, index);}

    public RegistrationForm (WebDriver driver){
        this.driver=driver;

        //Initialise Elements
        PageFactory.initElements(driver, this);
    }
    public RegistrationForm() {
        return;
    }
}
