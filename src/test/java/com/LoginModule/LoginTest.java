package com.LoginModule;

import com.Reusable_Methods.BaseClass;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.PropertyHandling;

import static java.lang.System.out;

public class LoginTest extends BaseClass {
    PropertyHandling property;
    LoginPage loginPage;

      @BeforeClass
      public void start(){

          //Initialising the property class object.
          property= new PropertyHandling();

          // launching the browser.
          launchBrowser(property.getProperty("browser"));

          // Navigating to the website.
          driver.get(property.getProperty("orangeHrmUrl"));

          // Initialising the driver.
          LoginPage loginPage =new LoginPage(driver);
      }

      @Test
              public void Login(){
          // Performing login operation with the valid credential's .
          loginPage.enterUsername("orangeHrmUsername");
          loginPage.enterPassword("orangeHrmPassword");
          loginPage.clickOnLoginButton();
      }
      @Test
              public void verifyLogin(){
          // Verifying the Login Action.
          Assert.assertEquals("OrangeHRM",driver.getTitle());
          out.println("Login successful Verification is completed.");
      }
      /*
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

            System.out.println("This method verifies login.");
            String actualTitle =driver.getTitle();
            String expectedTitle = "OrangeHRM";
            Assert.assertEquals(expectedTitle,actualTitle);
            System.out.println("Login Verification successful.");
     */
    }
