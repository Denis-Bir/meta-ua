package tests_web_pages.Test_Registration_Form.positive_test;

import meta_ua.test.Base.BaseTest;
import meta_ua.test.Web_pages.RegistrationForm;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Test_licenceAgreement extends BaseTest {

    @Test

    public void test_licences_page () {

        //BaseTest.getWebDriverChoose("Chrome");
        getDriver().navigate().to("https://passport.meta.ua/reg/");
        RegistrationForm test_licence = new RegistrationForm(getDriver());

        //check license agreement
        ArrayList<String> newTab = new ArrayList<String>(getDriver().getWindowHandles());
        test_licence.licenceLink.click();
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
