package test_mail_services;

import meta_ua.test.base.BaseTest;
import meta_ua.test.helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SortingMenu extends BaseTest {


@Test
    public void sortingSenderMenu() {

    // Ascending sort the "Sender" column
    List<WebElement> elements = getDriver().findElements(By.xpath("//table[@id='messlist']//tr/td[4]/a"));
    Boolean areElementsSortedByAsc = Helper.isAscendingSort(elements);

    /* only for education :)
    //List<String> textElements = elements.stream().map(i -> i.getText()).collect(Collectors.toList());
    //Boolean areElementsSortedByAsc = meta_ua.test.Helper.Helper.isAscendingSort2(textElements);
    */

    Assert.assertTrue(areElementsSortedByAsc, "Not sorted");

    //Descending sort data by Sender column
    findElementByXpathClick("//*[@id=\"messlist\"]/tbody/tr[1]/th[4]/a");
    List<WebElement> newElements = getDriver().findElements(By.xpath("//table[@id='messlist']//tr/td[4]/a"));
    Boolean areElementsSortedByDsc = Helper.isDescendingSort(newElements);
    Assert.assertTrue(areElementsSortedByDsc, "Not sorted");
    }








}
