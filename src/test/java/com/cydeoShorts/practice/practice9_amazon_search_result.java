package com.cydeoShorts.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/* 1. Go amazon
* 2. text "Nutella" to the searchbox
* 3. enter "ENTER"
* 4. FİND THE RESULT*/


public class practice9_amazon_search_result {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        WebElement amazonSearchField = driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearchField.sendKeys("Nutella" + Keys.ENTER);

        //<div class="a-section a-spacing-small a-spacing-top-small">
        WebElement amazonResult = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(amazonResult.getText());
        //driver.quit();
        System.out.println("\nTest finished.");


    }
}



