package com.cydeoLongs.tests.day2_locators;

//LOCATOR -- LINKTEXT & PARTIAL LINKTEXT


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkText_Practice {
    public static void main(String[] args) throws InterruptedException {
        //TC #3: Back and forth navigation
        //1. Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("The window has opened");


        //2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");
        Thread.sleep(1000);
        System.out.println("The page has accessed");

        //3. Click to A/B Testing from top of the list.
        driver.findElement(By.linkText("A/B Testing")).click();
        Thread.sleep(1000);
        System.out.println("Clicked the link");

        //4. Verify title is:
        //Expected: No A/B Test
        Thread.sleep(1000);
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASS");
        }else {
            System.out.println("Title verification FAILED");
        }


        //5. Go 1back to home page by using the .back();
        Thread.sleep(1000);
        driver.navigate().back();

        //6. Quit
        //Thread.sleep(5000);





    }
}
