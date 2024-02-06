package com.PIM_Module;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utility.BaseClass;

public class Employee_Test extends BaseClass {

    static public WebDriver driver;
    EmployeeList_Page employeeListPage;
    @Test(description = "This test is for reset employee information")
    public void resetEmployee(){

        employeeListPage = new EmployeeList_Page(driver);
        employeeListPage.resetEmployee();
        screenShots();
    }
}
