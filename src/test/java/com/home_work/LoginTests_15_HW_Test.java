package com.home_work;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests_15_HW_Test extends TestBase_15_HW_Test {

    @Test
    public void loginPositiveTest() {

        click(By.cssSelector("[href='/login']"));

        type(By.name("email"), "homework15@gmail.com");

        type(By.name("password"), "Aa12345!");

        click(By.name("login"));

        Assert.assertTrue(newUserAccount(By.xpath("//button[.='Sign Out']")));
    }

}
