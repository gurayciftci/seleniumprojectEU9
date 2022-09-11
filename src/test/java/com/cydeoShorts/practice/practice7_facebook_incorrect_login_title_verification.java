package com.cydeoShorts.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*1. Open Chrome browser
2. Go to [https://www.facebook.com]
3. Enter incorrect username
4. Enter incorrect password
5. Verify title changed to:
Expected: “Log into Facebook”*/

public class practice7_facebook_incorrect_login_title_verification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://facebook.com");
        WebElement facebookEmail = driver.findElement(By.id("email"));
        facebookEmail.sendKeys("gurayciftcisikeratar");

        WebElement facebookPsw = driver.findElement(By.id("pass"));
        facebookPsw.sendKeys("hehehhee"+ Keys.ENTER);

        String expResult = "Facebook'a Giriş Yap";
        Thread.sleep(5000);
        String liveResult = driver.getTitle();
        System.out.println("liveResult = " + liveResult);

        if (expResult.equals(liveResult)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        System.out.println("TEST FINISHED");

    }


}
