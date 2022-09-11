package com.cydeoShorts.testNG;

import com.cydeoShorts.base.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class P06_IFrame extends testBase{


    @Test
    public void iframeTest(){

        driver.get("https://practice.cydeo.com/iframe");
        WebElement iFRame = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iFRame); // way 1

        //driver.switchTo().frame(0); // another way

        //driver.switchTo().frame("mce_0_ifr"); // another way. text directly id

        WebElement textArea = driver.findElement(By.tagName("p"));
        assertTrue(textArea.isDisplayed());

        driver.switchTo().parentFrame();

    }
}
