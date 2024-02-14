package training.testNgPractice;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class Retry implements IRetryAnalyzer {
    private int retryCount = 0;
    private int maxRetryCount = 3;
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            System.out.println("Retry #" + retryCount + " for test: " + result.getMethod().getMethodName() +
                    ", on thread: " + Thread.currentThread().getName());

            return true;
        }
        return false;
    }

}

