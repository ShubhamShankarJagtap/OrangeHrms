package TestNG_Listners;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
@Listeners(ListenerClass.class)
public class ListenerDemo {
    WebDriver driver;
    Wait<WebDriver> wait;

    By userName = By.name("username");

    By passWord = By.name("password");

    By loginButton = By.xpath("//button[@type=\"submit\"]");
@Parameters({"username","password"})
    @Test
    public void login(String username,String password){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class)
                .withMessage("Hey buddy you have got an exception");
         wait.until(ExpectedConditions.presenceOfElementLocated(userName)).sendKeys(username);

         wait.until(ExpectedConditions.presenceOfElementLocated(passWord)).sendKeys(password);

         wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

        System.out.println(driver.getTitle());
    }
    @Test
    public void testFail(){
        System.out.println("failed test case method.");
        Assert.fail();
    }
    @Test
    public void skippedTest(){
        throw new SkipException("Test case is skipped.");
    }
}
