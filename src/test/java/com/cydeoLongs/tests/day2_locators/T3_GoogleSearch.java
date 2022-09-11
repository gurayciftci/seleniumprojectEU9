package com.cydeoLongs.tests.day2_locators;

//GOOGLE SEARCH
//LOCATOR --> BY NAME

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        //1. Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2.Go to https://www.google.com
        driver.get("https://www.google.com");

        //3. Write "apple" in search box
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        //googleSearchBox.sendKeys("apple");
        //when the above code run, it only texts "apple" in the search box. It is not searched.
        googleSearchBox.sendKeys("apple");
        Thread.sleep(1500);
        googleSearchBox.sendKeys(Keys.ENTER);



    }
}
