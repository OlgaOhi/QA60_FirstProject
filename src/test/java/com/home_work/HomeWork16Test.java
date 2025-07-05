package com.home_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork16Test {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void userLoginTests() {
        driver.findElement(By.cssSelector("[href='/login']"));

    }

    @Test
    public void addItemToCartTests() {
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
        driver.findElement(By.cssSelector("#topcartlink")).click();
        driver.findElement(By.xpath("(//a[@class='product-name'])[1]"));


    }
}
