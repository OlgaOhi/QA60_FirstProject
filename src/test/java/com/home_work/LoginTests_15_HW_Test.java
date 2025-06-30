package com.home_work;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests_15_HW_Test extends TestBase_15_HW_Test {

    @Test
    public void loginPositiveTest() {

        clickOnLoginLink();
        fillEmailForm();
        fillPasswordForm();
        clickOnLoginButton();
        Assert.assertTrue(newUserAccount(By.xpath("//button[.='Sign Out']")));
    }

}
