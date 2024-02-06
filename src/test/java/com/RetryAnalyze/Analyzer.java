package com.RetryAnalyze;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Analyzer implements IRetryAnalyzer {
   final int retryCount=3;
    int maxCount;
    @Override
    public boolean retry(ITestResult result) {
        if (!result.isSuccess()){
            if (maxCount<retryCount)
                maxCount++;
            return true;
        }
        return false;
    }
}
