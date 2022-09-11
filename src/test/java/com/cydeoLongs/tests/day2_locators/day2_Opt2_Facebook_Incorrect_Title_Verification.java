package com.cydeoLongs.tests.day2_locators;
//- [ ]  **TC #2: Facebook incorrect login title verification**

import com.cydeoShorts.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day2_Opt2_Facebook_Incorrect_Title_Verification {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to(https://www.facebook.com/)
        driver.get("https://www.facebook.com");

        //3. Enter incorrect username
        WebElement usernameBar = driver.findElement(By.xpath("//input[@id='email']"));
        //usernameBar.sendKeys("incorrect"+ Keys.ENTER);

        //4. Enter incorrect password
        WebElement passwordBar = driver.findElement(By.xpath("//input[@id='pass']"));
        passwordBar.sendKeys("incorrect"+Keys.ENTER);

        //5. Verify title changed to:
        //Expected: “Log into Facebook”
        String expectedTitle = "Facebook - Giriş Yap veya Kaydol";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("TITLE VERIFIED");
        }else {
            System.out.println("TITLE VERIFICATION FAILED");
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("expectedTitle = " + expectedTitle);
            System.out.println("\n");
        }
        driver.quit();
    }
}
