package HWSeleniumClass06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {

    public static void selectFromDropdown(WebDriver driver, By locator, String value) {
        WebElement dropdownElement = driver.findElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue(value);
    }



}
