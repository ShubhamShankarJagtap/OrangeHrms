package com.TestNG_Demo;
import static java .lang.System.*;
import org.testng.annotations.*;
public class TestNG_Parameter_Demo {
    @Test(description = "THIS IS ADDITION METHOD.")
    @Parameters({"i","j"})
    public void add(int a,int b){
        System.out.println(a+b);
    }
    @Test(description = "THIS IS SUBTRACTION METHOD.")
    @Parameters({"i","j"})
    public void sub(int a,int b){
        System.out.println(a-b);
    }
    @Test(description = "THIS IS MULTIPLICATION METHOD.")
    @Parameters({"i","j"})
    public void multiply(int a,int b){
        System.out.println(a*b);
    }
}
