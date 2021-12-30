package meta_ua.test.Base;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

       public static WebDriver createInstance(String browser) {
            WebDriver driver;
            BrowserList browserType = BrowserList.valueOf(browser.toUpperCase());
            switch (browserType) {

                case CHROME:
                    driver = WebDriverConfig.getBaseChromeDriver();
                    break;
                case FIREFOX:
                    driver = WebDriverFirefoxConfig.getBaseFirefoxDriver();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + browserType);
            }
            return driver;
        }

        public enum BrowserList {
            CHROME, FIREFOX
        }
}
