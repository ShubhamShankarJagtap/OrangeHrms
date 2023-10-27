package com.TestNG_Demo;
import static java.lang.System.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class

ParallelTestingDemo1 {
    WebDriver driver;
    @Test
    public void verifyTitle() throws InterruptedException {

        // Launching The Browser(Chrome).
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigating to the website.
        driver.get("https://www.saucedemo.com/");

        //Verifying the homepage is opened using title of homepage.
        Assert.assertEquals(driver.getTitle(),"Swag Labs");
        out.println("Homepage of sauce demo is navigated successfully.");

        Thread.sleep(5000);
        driver.quit();

    }
    @Test
    public void verifyLogo(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigating to the website.
        driver.get("https://www.saucedemo.com/");

        // Locating the logo
        WebElement logo = driver.findElement(By.cssSelector("input#login-button"));

        // Verifying the logo.
        Assert.assertTrue(logo.isDisplayed());
        out.println("Logo has been verified successfully.");
    }
}
