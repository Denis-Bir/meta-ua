package tests_web_pages.test_registration_rorm.positive_test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import meta_ua.test.base.BaseTest;
import meta_ua.test.web_pages.RegistrationForm;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Test_licenceAgreement extends BaseTest {

    @Test
    @Description("Test licence agreement")
    @Severity(SeverityLevel.MINOR)

    public void test_licences_page () {

        //BaseTest.getWebDriverChoose("Chrome");
        getDriver().navigate().to("https://passport.meta.ua/reg/");
        RegistrationForm test_licence = new RegistrationForm(getDriver());
        test_licence.licenceLink.click();
        //check license agreement
        ArrayList<String> newTab = new ArrayList<String>(getDriver().getWindowHandles());

        String oldTab = getDriver().getWindowHandle();
        newTab.remove(oldTab);

        // change focus to new tab
        getDriver().switchTo().window(newTab.get(0));


        getWait().until(ExpectedConditions.titleIs("Пользовательское соглашение"));
        String licenceLink = getDriver().getTitle();
        if (licenceLink.equals("Пользовательское соглашение")) {
            System.out.println("Link is actual");
        } else {
            System.out.println("ERROR!!! Link is not actual");
        }
        getDriver().switchTo().window(oldTab);

        //check confidential agreement
       test_licence.secondLicenceLink.click();
        getDriver().switchTo().window(newTab.get(0));
        getWait().until(ExpectedConditions.urlToBe("https://meta.ua/legal/terms"));
        String licenceConfidential = getDriver().getTitle();
        if (licenceConfidential.equals("Пользовательское соглашение")) {
            System.out.println("Confidential link is correct");
        } else {
            System.out.println("ERROR!!! Confidential link is not correct!");

        }


    }
}
