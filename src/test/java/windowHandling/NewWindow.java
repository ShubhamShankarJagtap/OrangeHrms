package windowHandling;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class NewWindow {
  static   ChromeDriver chromeDriver;
    static private void openWindow(){

       chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com");
        System.out.println(chromeDriver.getTitle());

//        ChromeDriver chromeDriver1 = new ChromeDriver();
//        chromeDriver1.get("https://www.facebook.com");
//        System.out.println(chromeDriver1.getTitle());

        chromeDriver.switchTo().newWindow(WindowType.WINDOW);
        chromeDriver.get("https://www.facebook.com");
        System.out.println(chromeDriver.getTitle());
    }

    static private void windowHandling(){

        chromeDriver.get("https://www.flipcart.com");
        String handle = chromeDriver.getWindowHandle();
        System.out.println(handle);
        chromeDriver.switchTo().newWindow(WindowType.WINDOW);
        chromeDriver.navigate().to("https://www.cnn.com");
        String cnnHandle = chromeDriver.getWindowHandle();
        System.out.println(cnnHandle);
        Set<String> allHandles;
        allHandles=chromeDriver.getWindowHandles();
        for (String handles : allHandles){
//            System.out.println(handles);
            if (handles.equals(chromeDriver.getCurrentUrl()))
                chromeDriver.switchTo().window(handles);
        }
        List<String> allHandle = new ArrayList<>(allHandles);
        chromeDriver.switchTo().window(allHandle.get(0));
}
    public static void main(String[] args) {
        openWindow();
        windowHandling();
    }
}
