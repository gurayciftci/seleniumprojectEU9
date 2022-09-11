package com.cydeoLongs.tests.day4_findElements_checkboxes_radio;

//TC #4: FindElements Task


import com.cydeoShorts.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class day4_Task4_findElements {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());

        //5- Print out the texts of the links.
        for (WebElement each: allLinks){
            System.out.println("each.getText() = " + each.getText());
            System.out.println("HREF Values: "+each.getAttribute("href"));
        }

        //6- Print out the HREF attribute values of the links

        driver.quit();
    }
}
