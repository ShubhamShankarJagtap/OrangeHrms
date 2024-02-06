package com.PIM_Module;

import com.LoginModule.LoginPage;
import com.LoginModule.LoginTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utility.BaseClass;
import utility.ReadProperty;


public class PIM_Page extends BaseClass {

     public WebDriver driver;
    By addEmployee = By.linkText("Add Employee");
    By firstName = By.name("firstName");
    By middleName = By.name("middleName");
    By lastName = By.name("lastName");
    By checkBox = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/label[1]/span[1]");
    By userName = By.xpath("//input[@autocomplete='off']");
    By passWord = By.xpath("//input[@type='password']");
    By confirmPassword = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]/input[1]");
    By save = By.xpath("//button[@type='submit']");
    ReadProperty readProperty = new ReadProperty();
    public String first_Name = readProperty.getFirstName();
    public String middle_Name = readProperty.getMiddleName();
    public String last_Name = readProperty.getLastName();
    public String user_Name = readProperty.getUsername();
    public String pass_Word = readProperty.getPassWord();
    LoginPage loginPage;

    public PIM_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void createEmployee() {

//         Performing & verify login
        loginPage = new LoginPage(driver);
        loginPage.navigateToPIM();

        //         Add an employee
         click(addEmployee);

//         Verify the navigation to the add employee page.
        Assert.assertEquals("OrangeHRM",driver.getTitle());

        enterText(firstName, first_Name);
        enterText(middleName, middle_Name);
        enterText(lastName, last_Name);
        click(checkBox);
        enterText(userName, user_Name);
        enterText(passWord, pass_Word);
        enterText(confirmPassword, pass_Word);
        click(save);
    }

}
