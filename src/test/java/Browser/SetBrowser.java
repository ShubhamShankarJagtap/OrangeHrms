package Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowser {
    static private void setBrowser(){
        ChromeDriver chromeDriver = new ChromeDriver();
        WebDriver.Options options =chromeDriver.manage();
        options.window().maximize();

        Dimension size =chromeDriver.manage().window().getSize();
        System.out.println(size.getHeight());
        System.out.println(size.getWidth());
    }
    public static void main(String[] args) {
        setBrowser();
    }
}
