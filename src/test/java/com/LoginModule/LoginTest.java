package com.LoginModule;

import com.ExtentReports.ExtentListener;
import com.PIM_Module.PIM_Page;
import com.RetryAnalyze.Analyzer;
import utility.BaseClass;
import org.junit.Assert;
import org.testng.annotations.*;
import utility.PropertyHandling;

import static java.lang.System.out;

@Listeners(ExtentListener.class)
public class LoginTest extends BaseClass {
    PropertyHandling property;
    LoginPage loginPage;

    @BeforeClass
    public void start() {

        //Initialising the property class object.
        property = new PropertyHandling();

        // launching the browser and url.
        launchBrowser("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Initialising the driver.
        loginPage = new LoginPage(driver);
    }

    @Test(retryAnalyzer = Analyzer.class, description = "THIS METHOD IS FOR LOGIN USING VALID CREDENTIAL'S.")
    public void Login() {
        loginPage = new LoginPage(driver);
        loginPage.log_in();
        screenShots();
    }

    @Test(retryAnalyzer = Analyzer.class)
    public void verifyLogin() {
        // Verifying the Login Action.
        Assert.assertEquals("OrangeHRM", driver.getTitle());
        out.println("Login successful Verification is completed.");
        screenShots();
    }
}
