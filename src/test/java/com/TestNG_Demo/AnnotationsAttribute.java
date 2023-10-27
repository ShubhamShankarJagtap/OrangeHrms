package com.TestNG_Demo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static java.lang.System.*;

public class AnnotationsAttribute {
    @Test(description = "THIS IS A TEST CASE FOR THE MOBILE LOGIN.")
    public void TestCase1(){
        out.println("mobile login testcase.");
    }
    @Test(description = "THIS IS THE TEST CASE FOR WEB PAGE LOGIN.",timeOut = 10,priority = 2)
    public void TestCase2(){
        out.println("web login testcase.");
      //  Assert.assertTrue(false);
    }
    @Parameters({"i","j"})
    @Test(description = "THIS IS THE TEST CASE FOR THE APPLICATION LOGIN.",priority = 1,dependsOnMethods = {"TestCase2","TestCase1"})
    public void TestCase3(int a,int b){
        out.println("app login testcase." + (a+b));
    }
}
