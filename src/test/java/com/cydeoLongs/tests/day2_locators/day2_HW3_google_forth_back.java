package com.cydeoLongs.tests.day2_locators;

//TC #3: Back and forth navigation

import com.cydeoShorts.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day2_HW3_google_forth_back {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Click to Gmail from top right.
        WebElement gmailLink = driver.findElement(By.xpath("//a[@data-pid='23']"));
        gmailLink.click();

        //4- Verify title contains:
        //Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("GMAIL TITLE VERIFIED");
        }else {
            System.out.println("GMAIL TITLE FAILED");
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("expectedTitle = " + expectedTitle);
            System.out.println("\n");
        }


        //5- Go back to Google by using the .back();
        driver.navigate().back();
        //6- Verify title equals:
        //Expected: Google
        String expectedGTitle = "Google";
        String actualGTitle = driver.getTitle();
        if(expectedGTitle.equals(actualGTitle)){
            System.out.println("GOOGLE TITLE VERIFIED");
        }else {
            System.out.println("FAILED");
            System.out.println("actualTitle = " + actualGTitle);
            System.out.println("expectedTitle = " + expectedGTitle);
        }

        driver.quit();
    }
}
