package com.cydeoShorts.practice;

// XPath Syntax
// tagName[@attribute='value']

/*
EX:  <a href = "https://www.tesla.com" id="uh7" name="bb95" > TESLA </a>

#1. locating with href      :   //a[@href='https://www.tesla.com']
#2. locating with id        :   //a[@id='uh7']
#3. locating with name      :   //a[@name='bb95']

*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice11_XPath {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement googleSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys("Cydeo"+ Keys.ENTER);

        WebElement cydeoText = driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
        cydeoText.click();

        driver.quit();
    }
}
