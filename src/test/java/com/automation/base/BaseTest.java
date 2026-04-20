package com.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import java.net.URL;
import java.time.Duration;

public class BaseTest {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public WebDriver getDriver() {
        return driver.get();
    }
    @BeforeMethod
    public void setup() throws Exception {

        String browser = System.getProperty("browser", "chrome");

        if (browser.equalsIgnoreCase("chrome")) {

            ChromeOptions options = new ChromeOptions();

            driver.set(new RemoteWebDriver(new URL("http://localhost:4444"), options));


        } else if (browser.equalsIgnoreCase("firefox")) {

            FirefoxOptions options = new FirefoxOptions();

            driver.set(new RemoteWebDriver(new URL("http://localhost:4444"), options));
        }

        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().get("https://app.voxy.com/v2/#/login");
    }

    @AfterMethod
    public void tearDown() {

            getDriver().quit();
            driver.remove();

    }
}