package IRetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    int counterForRetryAttempts;
    int limitForRetry = 3;
    @Override
    public boolean retry(ITestResult result) {
        if(!result.isSuccess())
        {
            if (counterForRetryAttempts < limitForRetry)
            {
                counterForRetryAttempts++;
                return true;
            }
        }
        return false;
    }
}
