package Cookies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Map;
import java.util.Set;

public class Demo {
   static WebDriver driver;
   static Set<Cookie> cookies;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.com");

        // Capturing all cookies

        cookies = driver.manage().getCookies();

        //print the size of cookies

        System.out.println(cookies.size());

        //printing all the cookie value

        for (Cookie c : cookies){

            System.out.println(c.getName() + " : " + c.getValue());
        }

        driver.close();
    }
}
