package com.cydeoShorts.testNG;

import com.cydeoShorts.base.testBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P03_TestNG_Selenium extends testBase {


    @Test
    public void googleTitle(){

       driver.get("https://google.com");

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "google title not match");
    }

}
