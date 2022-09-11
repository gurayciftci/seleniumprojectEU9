package com.cydeoShorts.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice13_RadioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/radio_buttons");
        WebElement blueRdBtn = driver.findElement(By.xpath("//input[@id='blue']"));
        System.out.println(blueRdBtn.isSelected()); // shows if blue button is selected or not

        WebElement redRdBtn = driver.findElement(By.xpath("//input[@id='red']"));
        Thread.sleep(3000);
        redRdBtn.click();
        System.out.println(blueRdBtn.isSelected());
    }
}
