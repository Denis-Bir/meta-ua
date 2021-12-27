package tests_web_pages.Test_Registration_Form.positive_test;

import meta_ua.test.Base.BaseTest;
import meta_ua.test.Web_pages.RegistrationForm;
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
        reg_form.inputNewEmail.sendKeys("den+1232131");

        //set a user name.
        reg_form.name.sendKeys("Tester 123");

        //set a user surname.
        reg_form.surname.sendKeys("Tester 123");

        //set a user birthday.
        reg_form.selectDay.click();

        //set a user birth month.
        reg_form.selectMonth.click();

        //set a user birth year.
        reg_form.selectYear.click();

        //set a user password.
        reg_form.setPassword.sendKeys("user123"+n);

        //confirm user password.
        reg_form.repeatPassword.sendKeys("user123"+n);

        /*
        reg_form.phoneNumber.sendKeys("123123123");
        reg_form.buttonConfirmPhoneNumber.sendKeys("123123123");
        */

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

        try {
        reg_form.registerButton.click();
        } finally {
          }




        }
}