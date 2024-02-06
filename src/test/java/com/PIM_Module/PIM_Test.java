package com.PIM_Module;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class PIM_module {

   static WebDriver driver;
   public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        username.sendKeys("Admin");

        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        password.sendKeys("admin123");

        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type=\"submit\"]")));
        login.click();

        System.out.println("Login is successful.");

        System.out.println("Navigating to PIM Module.");

        Wait<WebDriver> wait1 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement pim = wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='PIM']")));
        pim.click();

        System.out.println("Successfully Navigated to PIM Module.");

        System.out.println("Navigating to the add employee.");

        Wait<WebDriver> wait2 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement addEmployee = wait2.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Add Employee")));
        addEmployee.click();

        Wait<WebDriver> wait3 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement firstname = wait3.until(ExpectedConditions.presenceOfElementLocated(By.name("firstName")));
        firstname.sendKeys("Bill");

        Wait<WebDriver> wait4 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement middlename = wait4.until(ExpectedConditions.presenceOfElementLocated(By.name("middleName")));
        middlename.sendKeys("William");

        Wait<WebDriver> wait5 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement lastname = wait5.until(ExpectedConditions.presenceOfElementLocated(By.name("lastName")));
        lastname.sendKeys("Goldberg");

        Wait<WebDriver> wait6 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement checkBox = wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/label[1]/span[1]")));
        checkBox.click();

        Wait<WebDriver> wait7 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement Username = wait7.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@autocomplete='off']")));
        Username.sendKeys("billgold");

        Wait<WebDriver> wait8 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement Password = wait8.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='password']")));
        Password.sendKeys("s02169252723");

        Wait<WebDriver> wait9 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement confirmPassword = wait9.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]/input[1]")));
        confirmPassword.sendKeys("s02169252723");

        Wait<WebDriver> wait10 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement save = wait10.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
        save.click();
   }
}

