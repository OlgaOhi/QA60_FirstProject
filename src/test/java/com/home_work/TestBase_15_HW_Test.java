package com.home_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestBase_15_HW_Test {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://telranedu.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
    @Test(enabled = false)
    public boolean newUserAccount(By locator) {
        return driver.findElements(locator).size()>0;


    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {

        driver.findElement(locator).click();
    }

    public void clickOnLoginButton() {
         click(By.name("login"));
     }

    public void fillPasswordForm() {
        type(By.name("password"), "Aa12345!");
    }

    public void fillEmailForm() {
        type(By.name("email"), "homework15@gmail.com");
    }

    public void clickOnLoginLink() {
        click(By.cssSelector("[href='/login']"));
    }

    public void clickOnRegistrationButton() {
        click(By.name("registration"));
    }
}
