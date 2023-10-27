package com.TestNG_Demo;

import org.testng.annotations.*;

import static java.lang.System.*;
public class Personal_Loan {
    @BeforeSuite
    public void beforeSuite(){
        out.println("THIS IS BEFORE SUITE METHOD FOR LOAN DEPARTMENT SUITE.");
    }
    @AfterSuite
    public void afterSuite(){
        out.println("THIS IS AFTER SUITE METHOD FOR LOAN DEPARTMENT SUITE.");
    }
    @BeforeTest
    public void beforeTest(){
        out.println("THIS IS BEFORE TEST METHOD FOR SANITY TEST.");
    }
    @AfterTest
    public void afterTest(){
        out.println("THIS IS AFTER TEST METHOD FOR SANITY TEST.");
    }
    @BeforeClass
    public void beforeClass(){
        out.println("THIS IS PERSONAL LOAN CLASS BEFORE METHOD.");
    }
    @AfterClass
    public void afterClass(){
        out.println("THIS IS PERSONAL LOAN CLASS AFTER METHOD.");
    }
    @BeforeMethod
    public void beforeMethod(){
        out.println("THIS IS BEFORE METHOD.");
    }

   @AfterMethod
   public void afterMethod(){
       out.println("THIS IS AFTER METHOD.");
   }

    @Test
    public void mobileLoginPersonalLoan(){
        out.println("THIS IS A MOBILE LOGIN FOR PERSONAL LOAN");
    }

    @Test
    public void webLoginPersonalLoan(){
        out.println("THIS IS A WEB LOGIN FOR PERSONAL LOAN");
    }

    @Test
    public void appLoginPersonalLoan(){
        out.println("THIS IS AN APP LOGIN FOR PERSONAL LOAN");
    }
}
