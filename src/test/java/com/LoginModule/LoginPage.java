package com.LoginModule;

import com.PIM_Module.PIM_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import utility.BaseClass;
import utility.ReadProperty;

import java.time.Duration;

public class LoginPage extends BaseClass {
    WebDriver driver;
    By username = By.name("username");

    // Identifying all elements in login page.
    By password = By.name("password");
    By loginButton = By.xpath("//button[@type=\"submit\"]");
    By dashBoardSign = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
    By pim_navigation = By.xpath("//span[text()='PIM']");
    ReadProperty readProperty = new ReadProperty();
    public String user = readProperty.getUser();
    public String pass = readProperty.getPass();
    public String url = readProperty.getUrl();
    public String browser = readProperty.getBrowser();
    public LoginPage(WebDriver d) {
        driver = d;    // Initialising the driver variable.
    }

    public void log_in() {

        enterText(username, user);
        enterText(password, pass);
        click(loginButton);

//      Verify successful login
        Assert.assertEquals(getElementText(dashBoardSign), "Dashboard");
    }


    public PIM_Page navigateToPIM() {
        launchBrowser(browser, url);
        log_in();
        click(pim_navigation);
        return new PIM_Page(driver);
    }
}
