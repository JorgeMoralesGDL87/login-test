package com.automation.pages;

import com.automation.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // Locators
    By username = By.cssSelector("#login_form_email_input_field");
    By password = By.cssSelector("input#password_input_field.password-input__input");
    By loginBtn = By.cssSelector(".voxy-button__text");
    By popUp = By.id("pendo-button-85f35731");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void login(String user, String pass)  {

        WaitUtils wait = new WaitUtils(driver);
        wait.waitForVisibility(By.id("pendo-button-85f35731")).click();
        driver.findElement(username).sendKeys(user);
        driver.findElement(loginBtn).click();
        wait.waitForVisibility(By.cssSelector("#password_input_field"))
                .sendKeys(pass);
        driver.findElement(loginBtn).click();

    }

}