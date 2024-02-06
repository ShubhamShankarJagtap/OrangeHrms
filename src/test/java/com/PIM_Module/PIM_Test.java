package com.PIM_Module;

import com.LoginModule.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utility.BaseClass;


public class PIM_Test  extends BaseClass {

 WebDriver driver;
    PIM_Page pimPage;

    @Test
     public void addEmployee() {

          pimPage = new LoginPage(driver).navigateToPIM();
          new PIM_Page(driver).createEmployee();
          screenShots();
     }

}

