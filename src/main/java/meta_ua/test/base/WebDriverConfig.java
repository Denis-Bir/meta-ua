package meta_ua.test.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {

    private static WebDriver chromeDriver;

    public static WebDriver getBaseChromeDriver() {

        if (chromeDriver != null) {
           return chromeDriver;
            }

        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
//        System.setProperty("webdriver.chrome.driver", "." + "\\drivers\\chromedriver.exe");
//        driver =  new ChromeDriver();
        return chromeDriver;
    }


}



