package com.Recruitment_Module;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;

public class Recruitment {
    static WebDriver driver;

    static public void LaunchBrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    static void Login(){
        Wait<WebDriver>wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class)
                .withMessage("Unable to load element");

        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        username.sendKeys("Admin");

        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        password.sendKeys("admin123");

        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type=\"submit\"]")));
        login.click();
        System.out.println("Login is successful.");
    }

    static void recruitment(){
        Wait<WebDriver>wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class)
                .withMessage("Unable to load element");

        WebElement recruitment_module = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Recruitment']")));
        recruitment_module.click();

        WebElement add_Candidate = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='orangehrm-header-container']/button")));
        add_Candidate.click();

        WebElement firstname = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstName")));
        firstname.sendKeys("John");

        WebElement middlename = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstName")));
        middlename.sendKeys("Alex");

        WebElement lastname = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstName")));
        lastname.sendKeys("Cena");

        WebElement Email = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Type here']")));
        Email.sendKeys("jc@123gmail.com");

        WebElement contactNumber= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]/input[1]")));
        contactNumber.sendKeys("9876489439");

        WebElement saveButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
        saveButton.click();
    }
    public static void main(String[] args) {
        LaunchBrowser();
        Login();
        recruitment();
    }
}
