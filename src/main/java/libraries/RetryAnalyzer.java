package libraries;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class RetryAnalyzer implements IRetryAnalyzer {

    //Counter to keep track of retry attempts
    int retryAttemptsCounter = 0;

    //The max limit to retry running of failed test cases
    //Set the value to the number of times we want to retry
    int maxRetryLimit = 3;

    //Method to attempt retries for failure tests
    public boolean retry(ITestResult result) {
        if (!result.isSuccess()) {
            if(retryAttemptsCounter < maxRetryLimit){
                retryAttemptsCounter++;
                System.out.println("retrying.................");
                return true;
            }
        }
        return false;
    }
}