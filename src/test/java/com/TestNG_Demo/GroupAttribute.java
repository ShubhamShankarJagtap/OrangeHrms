package com.TestNG_Demo;
import static java.lang.System.*;
import org.testng.annotations.Test;

public class GroupAttribute {

    @Test(groups = "SOFTWARE COMPANY.")
    public void infosys(){
        out.println("THIS IS INFOSYS.");
    }

    @Test(groups = "SOFTWARE COMPANY.")
    public void wipro(){
        out.println("THIS IS WIPRO.");
    }
    @Test(groups = "AUTOMOBILE COMPANY.")
    public void TATA(){
        out.println("THIS IS TATA MOTORS.");
    }
    @Test(groups = "AUTOMOBILE COMPANY.")
    public void tesla(){
        out.println("THIS IS TESLA.");
    }
}
