package com.automation.tests;
import com.automation.base.BaseTest;
import com.automation.utils.ScreenshotUtil;
import listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.automation.pages.LoginPage;

@Listeners(TestListener.class)

public class LoginTest extends BaseTest {

    @Test
    public void loginExitoso()  {

        LoginPage loginPage = new LoginPage( getDriver());

        loginPage.login("jorgeeduardom@herbalife.com", "Isabel20!");

        // Validación
        String currentUrl = getDriver().getCurrentUrl();
        ScreenshotUtil.takeScreenshot( getDriver(),"before_login");

        //adding more comments
        //adding more comments

    }
    @Test
    public void loginExitoso2()  {

        LoginPage loginPage = new LoginPage( getDriver());

        loginPage.login("jorgeeduardom@herbalife.com", "Isabel20!");

        // Validación
        String currentUrl = getDriver().getCurrentUrl();
        ScreenshotUtil.takeScreenshot( getDriver(),"before_login");

        //adding more comments
        //adding more comments

    }
}
