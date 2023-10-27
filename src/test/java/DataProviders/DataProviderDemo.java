package DataProviders;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

import static java.lang.System.*;

public class DataProviderDemo {
    WebDriver driver;
    @DataProvider(name="searchDataSet")
    public Object[][] searchData(){
        Object[][] searchKeyWord= new Object[3][2];

        searchKeyWord[0][0]="India";
        searchKeyWord[0][1]="Qutub Minar";

        searchKeyWord[1][0]="Agra";
        searchKeyWord[1][1]="Taj Mahal";

        searchKeyWord[2][0]="Hyderbad";
        searchKeyWord[2][1]="Charminar";

        return searchKeyWord;
    }
    @Test(dataProvider = "searchDataSet" ,enabled = false)
   public void googleSearch(String country,String monument){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://www.google.com");
       WebElement searchBox = driver.findElement(By.name("q"));
       searchBox.sendKeys(country + " " +  monument);
       searchBox.click();
    }

    @DataProvider(name = "searchNewDataSet")
    public Object[][] searchNewData(){

        Object[][] search = new Object[2][2];

        search[0][0] = "USA";
        search[0][1] = "statue of liberty";

        search[1][0] = "FRANCE";
        search[1][1] = "Eiffel Tower";

        return search;
    }
    @Test(dataProvider = "searchNewDataSet")
    public void searchGoogle(String country,String Wonder) throws AWTException {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .withMessage("Hey buddy you got an Exception.");

        WebElement searchBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));

        searchBox.sendKeys(country +  " " + Wonder);

        Robot robot = new Robot();


    }
}
