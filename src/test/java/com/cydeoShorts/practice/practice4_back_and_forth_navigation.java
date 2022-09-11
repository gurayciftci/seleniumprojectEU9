package com.cydeoShorts.practice;

/*Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice4_back_and_forth_navigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement x = driver.findElement(By.linkText("Gmail"));
        x.click();

        String expectedGmailTitle = "Gmail: Ücretsiz, Gizli ve Güvenli E-posta | Google Workspace";
        String liveGmailTitle = driver.getTitle();

        if (expectedGmailTitle.equals(liveGmailTitle)){
            System.out.println("GMAIL TITLE IS VERIFIED");
        }else {
            System.out.println("GMAIL TITLE DOES NOT MATCH WITH EXPECTED");
        }

        driver.navigate().back();

        String expectedGoogleTitle = "Google";
        String liveGoogleTitle = driver.getTitle();

        if (expectedGoogleTitle.equals(liveGoogleTitle)){
            System.out.println("GOOGLE TITLE IS VERIFIED");
        }else {
            System.out.println("GOOGLE TITLE DOES NOT MATCH WITH EXPECTED");
        }

        driver.quit();
        System.out.println("TEST IS FINISHED");

    }
}
