package com.cydeoShorts.testNG;

import com.cydeoShorts.base.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class P07_Window_Handle extends testBase {

    @Test
    public void windowHandleTest(){
        driver.get("https://practice.cydeo.com/windows");

        //String currentHandle = driver.getWindowHandle();
        //System.out.println("currentHandle = " + currentHandle);

        Set<String> allHandles = driver.getWindowHandles();
        //System.out.println("allHandles = " + allHandles); //shows one window

        WebElement newWindowLink = driver.findElement(By.linkText("Click Here"));
        newWindowLink.click();

        Set<String> allHandles2 = driver.getWindowHandles();
        //System.out.println("allHandles2 = " + allHandles2);

        allHandles = driver.getWindowHandles();

        int index = 1;

        for (String eachHandle:allHandles){
            driver.switchTo().window(eachHandle);
            System.out.println("Window "+index+": "+ eachHandle);
            System.out.println("Window title: "+driver.getTitle() + "\n");
            index++;
        }

        driver.quit();


    }

}
