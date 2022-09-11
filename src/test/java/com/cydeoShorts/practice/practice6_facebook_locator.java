package com.cydeoShorts.practice;

/*- [ ]  TC #5: Facebook title verification
1. Open Chrome browser
2. Go to [https://www.facebook.com](https://www.facebook.com/)
3. Verify title:
Expected: “Facebook - Log In or Sign Up”*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice6_facebook_locator {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        String fbTitle = driver.getTitle();
        String expectedTitle = "Facebook - Giriş Yap veya Kaydol";

        if (expectedTitle.equals(fbTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        System.out.println("TEST FINISHED");
    }

}
