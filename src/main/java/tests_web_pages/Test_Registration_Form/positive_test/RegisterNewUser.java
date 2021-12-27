package tests_web_pages.Test_Registration_Form.positive_test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import meta_ua.test.Base.BaseTest;
import meta_ua.test.Web_pages.HomePage;
import meta_ua.test.Web_pages.RegistrationForm;
import org.testng.annotations.Test;

public class RegisterNewUser extends BaseTest {

    @Test
    @Description("Open new registration form; positive")
    @Severity(SeverityLevel.MINOR)
    public void openPageRegistrationForm(){

       HomePage home_page=new HomePage();
       getDriver().navigate().to("https://meta.ua/");
       home_page.clickOnTheButtonCreateNewMailBox();

    }

    @Test
    @Description("Register new user; positive")
    @Severity(SeverityLevel.MINOR)

    public void registerNewUser(){

        RegistrationForm registrationForm = new RegistrationForm();
            registrationForm.EnterUserLogin("first_test@test.org");
            registrationForm.EnterUsername("first_test");
            registrationForm.EnterUserSurname("second_test");
            registrationForm.dropDownSelectDay(8);
            registrationForm.dropdownSelectMonth("липень");
            registrationForm.dropDownSelectYear(20);
            registrationForm.SetUserPassword("test-for-testing");
            registrationForm.RepeatUserPassword("test-for-testing");
            registrationForm.EnterUserPhoneNumber("0971231234");
    }

    @Test
    @Description("Check confirm button; positive")
    @Severity(SeverityLevel.MINOR)

    public void loginPageCheckConfirmButton () {
        RegistrationForm reg_form = new RegistrationForm();

        // check the enabled/disabled confirm button
        boolean btnPresence = reg_form.registerButton.isDisplayed();
        boolean btnEnable = reg_form.registerButton.isEnabled();
        if (btnPresence == false | btnEnable == false) {
            System.out.println("ERROR!!! Check the confirm button! or check the fields form");
        } else if (btnPresence == true & btnPresence == false) {
            System.out.println("The confirm button is visible but not active! Fill the all fields!");
        } else if (btnPresence == true & btnEnable == true) {
            System.out.println("The confirm button is visible and enabled");

        }
        reg_form.registerButton.click();
    }
}
