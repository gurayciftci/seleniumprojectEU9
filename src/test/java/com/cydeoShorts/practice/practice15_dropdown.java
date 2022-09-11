package com.cydeoShorts.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice15_dropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/dropdown");

        //Simple Dropdown
        //identify the select element
        WebElement simpleDropdown = driver.findElement(By.id("dropdown"));

        //wrap this element inside Select object
        Select selectObj = new Select(simpleDropdown);

        //use ready methods to select option
        selectObj.selectByIndex(2);
        selectObj.selectByValue("2");
        selectObj.selectByVisibleText("Option 2");

        //verify determined option is selected
        String expectedOpt = "Option 2";
        String actualOpt = selectObj.getFirstSelectedOption().getText();
        if (actualOpt.equals(expectedOpt)){System.out.println("pass");}
        else{System.out.println("fail");}

        //quit
        driver.quit();
    }
}