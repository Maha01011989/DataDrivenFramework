package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class CustomListener implements ITestListener {

    @Override
    public void onFinish(ITestContext arg0) {
        System.out.println("On Finish Method " + arg0.getName() + " finished");

    }

    @Override
    public void onStart(ITestContext arg0) {
        System.out.println("On Start Method " + arg0.getName() + " started");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestStart(ITestResult arg0) {
        System.out.println("The testcaseName is " + arg0.getName());

    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        System.out.println("On Success method");

    }


}


