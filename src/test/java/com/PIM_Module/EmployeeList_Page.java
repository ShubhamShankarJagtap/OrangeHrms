package com.PIM_Module;

import com.LoginModule.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.BaseClass;
import utility.ReadProperty;

public class EmployeeList_Page extends BaseClass {

    By Employee_Name = By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']");
    By Employee_Id = By.xpath("//input[@class='oxd-input oxd-input--focus']");
    By Employment_Status = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]");
    By full_Time_permanent = By.xpath("//div[text()='Full-Time Permanent']");
    By Include = By.xpath("//div[text()=\"Current Employees Only\"]");
    By Supervisor_Name = By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--focus']//input[@placeholder='Type for hints...']");
    By Job_Title = By.xpath("//div[@class='oxd-select-text oxd-select-text--focus']");
    By sub_Unit = By.xpath("//div[@class='oxd-select-text oxd-select-text--focus']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']");
    By reset = By.xpath("//button[@type='reset']");
    By search = By.xpath("//button[@type='submit']");

    public WebDriver driver;
    LoginPage loginPage;
    ReadProperty readProperty;
    public EmployeeList_Page(WebDriver driver){
        this.driver=driver;
    }

    public void resetEmployee(){

        loginPage = new LoginPage(driver);
        loginPage.navigateToPIM();
        enterText(Employee_Name,"Bill William Goldberg.");
        enterText(Employee_Id,"34");
        click(Employment_Status);
        click(full_Time_permanent);
        click(Include);
        enterText(Supervisor_Name,"Lisa Andrews");
        enterText(Job_Title,"QA Engineer.");
        enterText(sub_Unit,"Engineering");
        click(reset);
    }
}
