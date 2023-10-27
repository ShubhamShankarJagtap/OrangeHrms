package com.TestNG_Demo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static java.lang.System.*;
public class SoftwareCompany {

    @Test
    @Parameters({"SoftwareCompanyName"})
    public void testCase1(String name) {
        out.println(name);
    }
}
