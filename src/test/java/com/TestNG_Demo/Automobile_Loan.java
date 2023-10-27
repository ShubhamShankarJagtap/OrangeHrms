package com.TestNG_Demo;
import org.testng.annotations.*;

import static java.lang.System.*;

public class Automobile_Loan {
    @BeforeClass
    public void beforeClass(){
        out.println("THIS IS AUTOMOBILE LOAN BEFORE CLASS  METHOD.");
    }
    @AfterClass
    public void afterClass(){
        out.println("THIS IS AUTOMOBILE LOAN AFTER CLASS METHOD.");
    }
    @BeforeMethod
    public void beforeMethod(){
        out.println("THIS IS BEFORE METHOD FOR AUTOMOBILE LOAN CLASS.");
    }

    @AfterMethod
    public void afterMethod(){
        out.println("THIS IS AFTER METHOD FOR AUTOMOBILE LOAN CLASS.");
    }

    @Test
    public void mobileLoginAutomobileLoan(){
        out.println("THIS IS A MOBILE LOGIN FOR AUTOMOBILE LOAN.");
    }


    @Test
    public void webLoginAutomobileLoan(){
        out.println("THIS IS A WEB LOGIN FOR AUTOMOBILE LOAN.");
    }
    @Test
    public void appLoginAutomobileLoan(){
        out.println("THIS IS AN APP LOGIN FOR AUTOMOBILE LOAN.");
    }
}
