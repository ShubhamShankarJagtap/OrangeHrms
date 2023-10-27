package com.TestNG_Demo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static java.lang.System.*;
public class AutoMobileClass {
    @Test(invocationCount = 6)
   // @Parameters({"AutomobileName"})
    public void testCase1(String name){
        out.println(name);
    }
}
