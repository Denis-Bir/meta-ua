package tests_web_pages.Test_LoginPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import meta_ua.test.Base.BaseTest;
import meta_ua.test.Web_pages.LoginPage;
import org.testng.annotations.Test;


public class TestLoginForm extends BaseTest {

    @Test
    @Description("Login form positive")
    @Severity(SeverityLevel.MINOR)
    public void testLoginForm () {
            getDriver().navigate().to("https://passport.meta.ua/login/");

            LoginPage login_page = new LoginPage();
            login_page.EnterUsername("denfortest@meta.ua");
            login_page.EnterPassword("VjzJcyjdf1980_");


        }

    @Test
    @Description("Login form check button positive")
    @Severity(SeverityLevel.MINOR)
    public void loginPageCheckConfirmButton () {
        LoginPage login_page = new LoginPage();

            // check the enabled/disabled confirm button
            boolean btnPresence = login_page.confirmButton.isDisplayed();
            boolean btnEnable = login_page.confirmButton.isEnabled();
            if (btnPresence == false | btnEnable == false) {
                System.out.println("ERROR!!! Check the confirm button! or check the fields form");
            } else if (btnPresence == true & btnPresence == false) {
                System.out.println("The confirm button is visible but not active! Fill the all fields!");
            } else if (btnPresence == true & btnEnable == true) {
                System.out.println("The confirm button is visible and enabled");

            }
        login_page.ClickConfirmButton();
        }


    }


