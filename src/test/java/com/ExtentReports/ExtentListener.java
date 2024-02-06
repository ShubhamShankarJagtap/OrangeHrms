package com.ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ExtentListener implements ITestListener {

    ExtentSparkReporter extentSparkReporter;
    ExtentReports reports;
    ExtentTest test;
    private void startExtentReport(){

        extentSparkReporter = new ExtentSparkReporter(".//Report//extentReport.htm");
        reports = new ExtentReports();
        reports.attachReporter(extentSparkReporter);

        extentSparkReporter.config().setReportName("Functional Testing");
        extentSparkReporter.config().setDocumentTitle("Functional Testing_Shubham_Jagtap");
        extentSparkReporter.config().setTimeStampFormat("DD/MM/YYYY,  HH:MM:SS");
        extentSparkReporter.config().setOfflineMode(true);
        extentSparkReporter.config().setTheme(Theme.STANDARD);

        reports.setSystemInfo("Machine", "Shubham@Test_PC23");
        reports.setSystemInfo("OS", "Windows 11");
        reports.setSystemInfo("User", "Shubham Jagtap");
        reports.setSystemInfo("Browser", "Edge");
        reports.setSystemInfo("Build", "@Test_13");

    }
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName() + "method execution has been started.");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test = reports.createTest(result.getName());
        test.log(Status.PASS, MarkupHelper.createLabel(result.getTestName()+ " is passed" , ExtentColor.GREEN));
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test = reports.createTest(result.getName());
        test.log(Status.FAIL,MarkupHelper.createLabel(result.getTestName() + " This method is failed. " , ExtentColor.RED));
    }

    @Override
    public void onTestSkipped(ITestResult result) {

        test = reports.createTest(result.getName());
        test.log(Status.SKIP, MarkupHelper.createLabel(result.getTestName() + " is skipped ", ExtentColor.PINK));
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @BeforeClass
    public void onStart(ITestContext context) {
        System.out.println("Report generation has been started.");
        startExtentReport();
    }

    @AfterClass
    public void onFinish(ITestContext context) {
        System.out.println("Report generation has been completed...");
        reports.flush();
    }
}
