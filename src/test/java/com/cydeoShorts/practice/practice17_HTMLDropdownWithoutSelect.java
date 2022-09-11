package com.cydeoShorts.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice17_HTMLDropdownWithoutSelect {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/dropdown");

        //Click to open dropdown which has no select tag
        WebElement dropdownLink = driver.findElement(By.id("dropdownMenuLink")); //Select a website part
        dropdownLink.click();

        //Click item (link) with text Yahoo
        WebElement itemYahoo = driver.findElement(By.linkText("Yahoo"));
        itemYahoo.click();

        //quit the browser
        driver.quit();

    }
}
