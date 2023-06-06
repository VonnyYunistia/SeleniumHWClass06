package HWSeleniumClass06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task2 {

    public static void main(String[] args) {

        // create a new ChromeDriver instance and navigate to the page
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/dynamic-data-loading-demo.php");

        // click the "Get New User" button
        WebElement getNewUserButton = driver.findElement(By.id("save"));
        getNewUserButton.click();

        // get the first name of the user and print it to the console
        WebElement firstName = driver.findElement(By.id("firstname"));
        System.out.println("First Name: " + firstName.getText());

        // close the browser
        driver.quit();














    }
}
