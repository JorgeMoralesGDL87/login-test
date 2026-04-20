package listeners;

import com.automation.base.BaseTest;
import com.automation.utils.ScreenshotUtil;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        Object currentClass = result.getInstance();
       WebDriver driver = ((BaseTest) result.getInstance()).getDriver();

        String testName = result.getName();

        ScreenshotUtil.takeScreenshot(driver, testName);
    }
}