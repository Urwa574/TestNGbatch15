package Class4;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result){ //iTestResult is an interface its attaching the result of the test case
        System.out.println("The test case has passed" +result.getName());

    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("the test case has failed" +result.getName()); //it will get name of that specific test name whether it passes or fails
    }
}
