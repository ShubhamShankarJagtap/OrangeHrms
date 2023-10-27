package TestNG_Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerClass implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart method is invoked.");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess method is invoked." + " successful method name is : " + result.getName());
    }

    public void onFinish(ITestContext Result){
        System.out.println("onFinish is invoked.");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure is invoked " + " failed method name is : " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped is invoked " + " skipped method name is : " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart method is invoked.");
    }

}
