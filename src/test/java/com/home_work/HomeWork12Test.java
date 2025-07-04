package com.home_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork12Test {

    WebDriver driver;

    @BeforeMethod

    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://demowebshop.tricentis.com");
    }

    @Test

    public void testDemoWebShop() {
        System.out.println("Open test");
    }

    @AfterMethod(enabled = false)

    public void tearDown() {
        driver.close();

    }

}
