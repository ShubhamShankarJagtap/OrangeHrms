package com.TestNG_Demo.NG;

import org.testng.annotations.*;

public class Demo {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class.");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method.");
    }
    @Test
    public void test1(){
        System.out.println("This is test case.");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class.");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method.");
    }
    @Test
    public void test2(){
        System.out.println("this is second test case");
    }
}
