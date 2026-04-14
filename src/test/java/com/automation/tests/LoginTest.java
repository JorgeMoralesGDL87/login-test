package com.automation.tests;
import com.automation.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.automation.pages.LoginPage;
public class LoginTest extends BaseTest {

    @Test
    public void loginExitoso()  {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("jorgeeduardom@herbalife.com", "Isabel20!");

        // Validación
        String currentUrl = driver.getCurrentUrl();
        //Assert.assertTrue(currentUrl.contains("Inicio"), "El login falló");
    }
}
