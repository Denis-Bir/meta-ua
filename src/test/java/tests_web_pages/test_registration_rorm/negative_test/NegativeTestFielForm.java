package tests_web_pages.test_registration_rorm.negative_test;

import meta_ua.test.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class NegativeTestFielForm extends BaseTest {

    @Test
    public void negativeTestRegistrationForm() {

        //waiterXpathVisible("/html/body/div[1]/div[1]/form/div/div[36]/div[2]/input");
        //findElementByXpathAndKeys("//*[@id=\"regForm\"]/div/div[2]/input", "@@123");
        getDriver().findElement(By.xpath("//*[@id=\"regForm\"]/div/div[2]/input")).sendKeys(Keys.ENTER);

        //for login field
        try {
            String expectedErrorMessage = "Ошибка!!! Логин должен состоять из символов A-z, 0-9, -,_,., начинаться с буквы, заканчиваться буквой или цифрой и содержать от 4 до 20 символов";
            //waiterXpathVisible("//input[contains(@class, 'login')]/parent::div/following-sibling::div[@class='error-message'][1]");
            String actualErrorMessage = getDriver().findElement(By.xpath("//input[contains(@class, 'login')]/parent::div/following-sibling::div[@class='error-message'][1]")).getText();
            //Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
            if (expectedErrorMessage.equals(actualErrorMessage)) {
                System.out.println("Error message for login field is correct!");
            } else {
                System.out.println("Error message for login field is incorrect!");
            }
        } finally {

        }
        //for name field
        try {
            getDriver().findElement(By.xpath("/html/body/div[1]/div[1]/form/div/div[5]/input")).sendKeys("@@123123" );
            //waiterXpathVisible("//input[contains(@class, 'login')]/parent::div/following-sibling::div[@class='error-message'][2]");
            String expectedErrorName = "Ошибка в имени";
            String actualErrorName = getDriver().findElement(By.xpath("//input[contains(@class, 'login')]/parent::div/following-sibling::div[@class='error-message'][2]")).getText();
            if (expectedErrorName.equals(actualErrorName)) {
                System.out.println("Error Name message for login field is correct!");
            } else {
                System.out.println("Error Name message for login field is incorrect!");
            }
        } finally{
        }

        //for surname field
        try {
            getDriver().findElement(By.xpath("/html/body/div[1]/div[1]/form/div/div[6]/input")).sendKeys("@@123123");
            //waiterXpathVisible("//input[contains(@class, 'login')]/parent::div/following-sibling::div[@class='error-message'][3]");
            String actualErrorSurname=getDriver().findElement(By.xpath("//input[contains(@class, 'login')]/parent::div/following-sibling::div[@class='error-message'][3]")).getText();
            String expectedErrorSurname="Ошибка в фамилии";
            if (expectedErrorSurname.equals(actualErrorSurname)){
                System.out.println("Error SurName message for login field is correct!");
            } else {
                System.out.println("Error SurName message for login field is incorrect!");
            }
        } finally {

        }

        //for date field
        try{
            String actualErrorDate=getDriver().findElement(By.xpath("//input[contains(@class, 'login')]/parent::div/following-sibling::div[@class='error-message'][6]")).getText();
            String expectedErrorDate="Ошибочная дата";
            if (expectedErrorDate.equals(actualErrorDate)){
                System.out.println("Error message for Date displayed correctly!");
            } else {System.out.println("Error message for Date display incorrect!");}



        } finally {

        }

        //for password field
        try {
            String actualErrorPassword=getDriver().findElement(By.xpath("//input[contains(@class, 'login')]/parent::div/following-sibling::div[@class='error-message'][7]")).getText();
            String expectedErrorPassword="Длина пароля должна быть не менее 8 символов";
            if (expectedErrorPassword.equals(actualErrorPassword)){
                System.out.println("Error message for Password displayed correctly!");
            } else {System.out.println("Error message for Password display incorrect!");}

        } finally {

        }

        //for phone number field
        try {
            String actualErrorPhoneNumber=getDriver().findElement(By.xpath("//input[contains(@class, 'login')]/parent::div/following-sibling::div[@class='error-message'][9]")).getText();
            String expectedErrorPhoneNumber="Длина пароля должна быть не менее 8 символов";
            if (expectedErrorPhoneNumber.equals(actualErrorPhoneNumber)){
                System.out.println("Error message for Password displayed correctly!");
            } else {System.out.println("Error message for Password display incorrect!");}

        } finally {

        }
    }



}

