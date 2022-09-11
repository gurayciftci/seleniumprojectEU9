package com.cydeoShorts.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice10_cssSelectorPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        //search for cydeo
        WebElement googleSearchBox = driver.findElement(By.cssSelector("input[name='q']"));
        googleSearchBox.sendKeys("cydeo"+ Keys.ENTER);

        //verify Cydeo linktext is appeared in the results
        WebElement cydeoText = driver.findElement(By.cssSelector("a[href='https://cydeo.com/']>h3"));
        if(cydeoText.getText().equals("Cydeo")){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        driver.quit();
    }
}
