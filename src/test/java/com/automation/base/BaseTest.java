package com.automation.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.URL;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {

        String browser = System.getProperty("browser", "chrome");

        DesiredCapabilities caps = new DesiredCapabilities();

        if (browser.equalsIgnoreCase("chrome")) {
            caps.setBrowserName("chrome");
        } else if (browser.equalsIgnoreCase("firefox")) {
            caps.setBrowserName("firefox");
        }

        driver = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"),
                caps
        );

        driver.get("https://app.voxy.com/v2/#/login");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}