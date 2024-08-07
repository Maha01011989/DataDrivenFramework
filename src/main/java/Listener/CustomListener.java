package Listener;

import ExtentReport.ExtentReportManager;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class CustomListener extends ExtentReportManager implements ITestListener {
    ExtentTest test;


    @Override
    public void onFinish(ITestContext arg0) {
        endReport();
        System.out.println("On Finish Method " + arg0.getName() + " finished");

    }

    @Override
    public void onStart(ITestContext arg0) {
       // startReport();
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
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName());
       // test = startTest(result.getName());
        System.out.println(test);

    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        System.out.println("On Success method");

    }


    public ExtentTest getExtentTestInstance() {
        return test;
    }

}


