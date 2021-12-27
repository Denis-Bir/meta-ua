package meta_ua.test.Web_pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    private WebDriver driver;

    //Page URL
    private static String PAGE_URL="https://meta.ua";

    //Locators

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Завести пошту')]")
    private WebElement createNewMailBox;

    //Constructor
    public HomePage(WebDriver driver){
        this.driver=driver;
        driver.get(PAGE_URL);

        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public HomePage() {

    }

    public void clickOnTheButtonCreateNewMailBox(){

        createNewMailBox.click();

    }
}
