package meta_ua.test.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFirefoxConfig {

    private static WebDriver driverFirefox;

    public static WebDriver getBaseFirefoxDriver(){

        System.setProperty("webDriver.firefox.FirefoxDriver", "C:\\Users\\Den\\Desktop\\WebDriversSelenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
        driverFirefox=new FirefoxDriver();
        driverFirefox.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driverFirefox.manage().window().maximize();
        return driverFirefox;
    }


}
