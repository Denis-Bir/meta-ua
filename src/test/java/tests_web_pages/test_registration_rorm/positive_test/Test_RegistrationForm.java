package tests_web_pages.test_registration_rorm.positive_test;

import meta_ua.test.base.BaseTest;
import meta_ua.test.web_pages.RegistrationForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Random;

public class Test_RegistrationForm extends BaseTest {

    Random random = new Random();
    public int n = random.nextInt(100) + 1;

    @Test
    public void checkRegistrationForm() {

        //BaseTest.getWebDriverChoose("Chrome");
        getDriver().navigate().to("https://passport.meta.ua/reg/");
        RegistrationForm reg_form = new RegistrationForm(getDriver());

        //set a login name.
        reg_form.login("new name for test");

        //set a user name.
        reg_form.name("for test name");

        //set a user surname.
        reg_form.surname("for test surname");

        //set a user birthday.
        reg_form.dropDownSelectDay(15);

        //set a user birth month.
        reg_form.dropdownSelectMonth("липень");

        //set a user birth year.
        reg_form.dropDownSelectYear(16);

        //set a user password.
        reg_form.setPassword("user123"+n);

        //confirm user password.
        reg_form.repeatPassword("user123"+n);

        //Set user phone number.
        reg_form.phoneNumber("1234567890");

        //click on the register button.
        reg_form.registerButton.perform_click();


        // check the checkbox state
        WebElement checkbox = getDriver().findElement(By.xpath("//input[@id='check_agree']"));
        WebElement state = checkbox.findElement(By.xpath("//input[@id='check_agree']"));
        if (state.isSelected()) {
            System.out.println("ERROR! Check-box was selected before!");
            getDriver().quit();
        } else {
            state.click();
            System.out.println("Check-box was correct selected");
        }

        reg_form.registerButton.perform_click();




        }
}