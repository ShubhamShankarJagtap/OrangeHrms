package Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com");

        Actions actions = new Actions(driver);

        Action seriesOfAction = actions.moveToElement(driver.findElement(By.id("user-name")))
                .click()
                .sendKeys("standard_user", Keys.TAB)
                .sendKeys("secret_sauce",Keys.ENTER).build();
        seriesOfAction.perform();
    }
}
