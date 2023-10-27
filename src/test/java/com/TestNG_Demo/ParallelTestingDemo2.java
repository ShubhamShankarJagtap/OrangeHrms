package com.TestNG_Demo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.System.*;

public class ParallelTestingDemo2 {
    WebDriver driver;

    @Test
    public void LaunchBrowser(){

        //Launching the Chrome browser.
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        out.println("Browser has been launched successfully.");

        // Navigating to the website.
        driver.get("https://www.saucedemo.com/");
        out.println("successfully navigated to the website.");
    }

    @Test
    public void login(){
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         //Locating the username field
        WebElement username=driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        //Locating the password
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        //Locating the Login Button
        WebElement loginButton=driver.findElement(By.id("login-button"));
        loginButton.submit();

        //verifying the login
        Assert.assertEquals(driver.getTitle(),"Swag Labs");
        out.println("Login has been successful.");

       // driver.quit();
    }

}
