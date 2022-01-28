package meta_ua.test.helper;
import org.openqa.selenium.WebElement;

import java.util.List;

public final class  Helper {

    // The method could be applied only for ASKII strings :)
    public static  boolean isAscendingSort(List<WebElement> elementsSorted) {
        Boolean isSorted = true;
        String previousValue = elementsSorted.get(0).getText();
        for (WebElement element : elementsSorted) {
            String currentValue = element.getText();
            System.out.print("\nprevious = '" + previousValue + "', current ='" + currentValue + "',");
            Boolean isCurrentGreaterPrevious = currentValue.compareTo(previousValue) <= 0;
            System.out.print("\tcurrent > previous = " + isCurrentGreaterPrevious);
            if (!isCurrentGreaterPrevious) {
                isSorted = false;
                break;
            }

            previousValue = currentValue;
        }

        return isSorted;
    }

    // The method could be applied only for ASKII strings :) Remake by collection.
    public static  boolean isDescendingSort(List<WebElement> elementsSorted) {
        Boolean isSorted = true;
        String previousValue = elementsSorted.get(0).getText();
        for (WebElement element : elementsSorted) {
            String currentValue = element.getText();
            System.out.print("\nprevious = '" + previousValue + "', current ='" + currentValue + "',");
            Boolean isCurrentLowerNext = currentValue.compareTo(previousValue) >= 0;
            System.out.print("\tcurrent < previous = " + isCurrentLowerNext);
            if (!isCurrentLowerNext) {
                isSorted = false;
                break;
            }
            previousValue = currentValue;
        }
        return isSorted;
    }

    public void CheckConfirmButton (WebElement element) {

        // check the enabled/disabled confirm button on start page

        boolean btnPresence = element.isDisplayed();
        boolean btnEnable = element.isEnabled();

        if (btnPresence == false | btnEnable == false) {
            System.out.println("ERROR!!! Check the confirm button! or check the fields form");
        } else if (btnPresence == true & btnPresence == false) {
            System.out.println("The confirm button is visible but not active! Fill the all fields!");
        } else if (btnPresence == true & btnEnable == true) {
            System.out.println("The confirm button is visible and enabled");
            element.click();
        }

    }
}
