package com.cydeoLongs.tests.day1_selenium_intro;


//Task1: Yahoo Title Verification
//do setup for browser driver
//1. Open Chrome Browser
//2. go to https://www.yahoo.com
//3. verify title Expected: Yahoo

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_YahooTitleVerification {
    public static void main(String[] args) {

        //do setup for browser driver
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome Browser
        WebDriver driver = new ChromeDriver();

        //maximize
        driver.manage().window().maximize();

        //2. go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        //3. verify title Expected: Yahoo
        System.out.println(driver.getTitle());


    }
}
