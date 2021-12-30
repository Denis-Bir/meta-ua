package tests_web_pages.Test_LoginPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import meta_ua.test.Base.BaseTest;
import meta_ua.test.Web_pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DifferentUser extends BaseTest {

    @DataProvider(name = "Authentication")

    public  static Object[][] credentials() {
         return new Object[][]{
                {"login_1", "password1"},
                {"login_23", "password22"},
                {"login_333", "password333"},
                {"login_4444", "password4444"},
                {"login_55555", "password55555"}

        };
    }
    @Test(dataProvider = "Authentication")
    @Description("Login form for different user; positive")
    @Severity(SeverityLevel.MINOR)

    public void testLoginForm (String login, String password) {
        driver.get("https://passport.meta.ua/login/");
        LoginPage login_page = new LoginPage ();
        login_page.EnterUsername(login);
        login_page.EnterPassword(password);
        login_page.ClickConfirmButton();

    }






}