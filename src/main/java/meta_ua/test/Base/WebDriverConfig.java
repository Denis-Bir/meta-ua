package meta_ua.test.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {

    private static WebDriver driver;

    public static WebDriver getBaseChromeDriver() {

        if(driver != null) {
            return driver;
        }

        System.setProperty("webdriver.chrome.driver", "." + "\\drivers\\chromedriver.exe");
        driver =  new ChromeDriver();

        return driver;
        //driver = new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver.whitelistedIps", "");
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
        //return driver;
    }
}
