package com.home_work;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests_15_HW_Test extends TestBase_15_HW_Test {

    @Test(enabled = false)
    public void newUserRegistrationPositiveTest() {

        clickOnLoginLink();
        fillEmailForm();
        fillPasswordForm();
        clickOnRegistrationButton();
        Assert.assertTrue(newUserAccount(By.xpath("//button[.='Sign Out']")));

    }

}
