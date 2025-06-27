package com.home_work;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests_15_HW_Test extends TestBase_15_HW_Test {

    @Test(enabled = false)
    public void newUserRegistrationPositiveTest() {

        click(By.cssSelector("[href='/login']"));

        type(By.name("email"), "homework15@gmail.com");

        type(By.name("password"), "Aa12345!");

        click(By.name("registration"));

        Assert.assertTrue(newUserAccount(By.xpath("//button[.='Sign Out']")));

    }

}
