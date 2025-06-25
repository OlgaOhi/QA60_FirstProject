package com.home_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork13_14Test {

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
    public void findByCssSelector() {

        driver.findElement(By.cssSelector("h2"));

        driver.findElement(By.cssSelector(".header"));

        driver.findElement(By.cssSelector("#dialog-notifications-success"));

        driver.findElement(By.cssSelector("[href='/login']"));

        driver.findElement(By.cssSelector("[href*='di']"));

        driver.findElement(By.cssSelector("[href^='/regi']"));

        driver.findElement(By.cssSelector("[href$='ds']"));

        driver.findElement(By.cssSelector("[href*='news']"));

        driver.findElement(By.cssSelector("[href='/gift-cards']"));

        driver.findElement(By.cssSelector(".footer"));
    }

    @Test
    public void findByXpath () {

        driver.findElement(By.xpath("//h2"));

        driver.findElement(By.xpath("//div[@class='top-menu-triangle']"));

        driver.findElement(By.xpath("//input[@id='small-searchterms']"));

        driver.findElement(By.xpath("//h3[contains(.,'us')]"));

        driver.findElement(By.xpath("//label[starts-with(@for,'po')]"));

        driver.findElement(By.xpath("//ul[@class='top-menu']/.."));

        driver.findElement(By.xpath("//h2/parent::div"));

        driver.findElement(By.xpath("//h2/ancestor::div"));

        driver.findElement(By.xpath("//h3[text()='Information']"));

        driver.findElement(By.xpath("//input[@value='Add to cart']"));

    }
}
