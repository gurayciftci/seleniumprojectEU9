package com.cydeoLongs.tests.day2_locators;

import com.cydeoLongs.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//- [ ]  **TC #1: Etsy Title Verification**

public class day2_HW1_etsy_title_verification {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to (https://www.etsy.com/)
        driver.get("https://www.etsy.com/");

        //3. Search for “wooden spoon”
        WebElement etsySearchBar = driver.findElement(By.cssSelector("input[data-id='search-query']"));
        etsySearchBar.sendKeys("wooden spoon"+ Keys.ENTER);

        //4. Verify title:
        //Expected: “Wooden spoon | Etsy”
        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("expectedTitle = " + expectedTitle);
        }

        driver.quit();
    }
}
