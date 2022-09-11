package com.cydeoShorts.practice;

/*Practice 2: Etsy Title Verification

    *Open Chrome browser
    *Go to [https://www.etsy.com](https://www.etsy.com/)
    *Search for “wooden spoon”
    *Verify title:
    Expected: “Wooden spoon | Etsy”*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2_etsy_title_verification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        WebElement x2 = driver.findElement(By.name("search_query"));
        x2.sendKeys("wooden spoon"+ Keys.ENTER);

        String expectedResult = "Wooden spoon - Etsy";
        String actualResult = driver.getTitle();

        if (expectedResult.equals(actualResult)){
            System.out.println("Result PASS");
        }else {
            System.out.println("Result FAIL");
        }

    }
}
