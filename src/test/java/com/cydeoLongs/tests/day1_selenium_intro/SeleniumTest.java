package com.cydeoLongs.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        //1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the Chrome driver
        WebDriver driver = new ChromeDriver(); //new session

        //3- Test if driver is working as expected
        driver.get("https://www.google.com");
        //Note: When run, you may some red messages at the console. It is normal.
        // These are some default lines.
        driver.get("https://www.time.is");

        //Stop code execution for 1 seconds
        Thread.sleep(1000);

        //use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 1 seconds
        Thread.sleep(1000);

        //navigate forward
        driver.navigate().forward();

        //refresh
        driver.navigate().refresh();

        //change address
        driver.navigate().to("https://sozcu.com.tr");

        //get title
        driver.getTitle();
        System.out.println(driver.getTitle());

        //current URL
        System.out.println(driver.getCurrentUrl());

        // maximize window
        driver.manage().window().maximize();

        //full screen
        driver.manage().window().fullscreen();

        //close the currently opened window
        driver.close();

        //close all of the opened windows
        //kill the current session, means if more than one
        driver.quit();

    }

}
