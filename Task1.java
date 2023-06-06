package HWSeleniumClass06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // navigate to the website
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");

        // click the Start button
        WebElement startButton = driver.findElement(By.id("startButton"));
        startButton.click();

        // wait for the text to load and print it to the console
        WebElement welcomeText = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println(welcomeText.getText());
        // close the browser
        driver.quit();










    }

}
