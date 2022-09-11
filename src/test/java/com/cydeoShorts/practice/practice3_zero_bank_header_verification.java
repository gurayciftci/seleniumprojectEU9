package com.cydeoShorts.practice;
/*1. Open Chrome browser
2. Go to [http://zero.webappsecurity.com/login.html]
3. Verify header text
Expected: “Log in to ZeroBank"*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice3_zero_bank_header_verification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement liveResult = driver.findElement(By.className("page-header"));
        String liveResultTx = liveResult.getText();
        System.out.println(liveResultTx);
        String expectedResult = "Log in to ZeroBank";

        if (expectedResult.equals(liveResultTx)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

    }
}
