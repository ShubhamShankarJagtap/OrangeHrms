package Encryption;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Demo {
   static WebDriver driver;
//  static String password = "admin123";

//  static byte[] encodedPassword ;

   static By username = By.name("username");
   static By password = By.name("password");
   static By loginButton = By.xpath("//button[@type=\"submit\"]");

   static byte [] decodedPassword ;
    public static void main(String[] args) {
/*
        // Encode password.
       encodedPassword = Base64.encodeBase64(password.getBytes());

        System.out.println("encoded version of password is : " + new String(encodedPassword));

 */
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        decodedPassword = Base64.decodeBase64("YWRtaW4xMjM=");

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(username)).sendKeys("admin");

        Wait<WebDriver> waitPassword = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        waitPassword.until(ExpectedConditions.presenceOfElementLocated(password)).sendKeys(new String(decodedPassword));

        Wait<WebDriver> waitLoginButton = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        waitLoginButton.until(ExpectedConditions.presenceOfElementLocated(loginButton)).click();

        driver.close();
    }
}
