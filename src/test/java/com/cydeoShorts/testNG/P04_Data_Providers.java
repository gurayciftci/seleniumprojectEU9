package com.cydeoShorts.testNG;

import com.cydeoShorts.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P04_Data_Providers {

    WebDriver driver;

    @Test (dataProvider = "searchData")
    public void test1(String keyword, String expectedTitle){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys(keyword+ Keys.ENTER);
        Assert.assertEquals(driver.getTitle(), expectedTitle);

        driver.quit();
    }

    @DataProvider (name="searchData")
    public Object[][] testData(){

        return new Object[][]{
                {"selenium", "selenium - Google'da Ara"},
                {"java", "java - Google'da Ara"},
                {"job", "job - Google'da Ara"},
                {"cydeo", "cydeo - Google'da Ara"}
        };

    }

}
