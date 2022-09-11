package com.cydeoShorts.testNG;

import com.cydeoShorts.base.testBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class P05_JS_Alerts extends testBase {
    private Object assertTrue;

    @Test
    public void alertTest(){

        //Click the JS Alert Button
        driver.get("https://practice.cydeo.com/javascript_alerts");
        WebElement jsButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsButton.click();

        //handle JS button
        Alert JSAlert = driver.switchTo().alert();
        JSAlert.accept();

        //check if text is displayed or not
        WebElement textG = driver.findElement(By.id("result"));
        assertTrue(textG.isDisplayed());


        driver.quit();
    }
}
