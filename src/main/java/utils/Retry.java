package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public  class Retry implements IRetryAnalyzer {
    int retryCount  = 0;
    int maxRetryCount=3;
    @Override
    public boolean retry(ITestResult result) {

        if(retryCount<maxRetryCount){
            retryCount++;
            return true;
        }
        return false;
    }
}