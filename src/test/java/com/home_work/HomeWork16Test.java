package com.home_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
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
    public void AddItemToCartTests(Label shoppingCart) {
        driver.findElement(By.xpath("//div[@class='item-box'][2]//input[@value='Add to cart']")).click();
        driver.findElement(By.xpath("//input[@value='Shopping cart']")).click();

        String checkText = shoppingCart.getText();
        if (checkText.contains("14.1-inch Laptop")) {
            System.out.println("Product added");
        } else {
            System.out.println("Product has not been added");
        }
    }
}
