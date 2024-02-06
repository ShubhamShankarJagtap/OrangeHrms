package IRetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    int counterForRetryAttempts=0;
   final int maxLimitForRetry = 3;
    @Override
    public boolean retry(ITestResult result) {
        if(!result.isSuccess())
        {
            if (counterForRetryAttempts < maxLimitForRetry)
            {
                counterForRetryAttempts++;
                return true;
            }
        }
        return false;
    }
}
