package com.cydeoShorts.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice16_multiselectDropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/dropdown");

        //identify the dropdown with multiple select options
        WebElement multiItemDrop = driver.findElement(By.name("Languages"));

        //wrap this element into select object
        Select multiItSelect = new Select(multiItemDrop);

        //check if this element has multi select option
        System.out.println("Is it multi?: "+ multiItSelect.isMultiple() );

        //select items
        multiItSelect.selectByIndex(2);
        multiItSelect.selectByValue("python");
        multiItSelect.selectByVisibleText("Ruby");


        //deselect items
        multiItSelect.deselectByIndex(2);
        multiItSelect.deselectByValue("python");
        multiItSelect.deselectByVisibleText("Ruby");

        //deselect ALL
        multiItSelect.deselectAll();

        //quit
        driver.quit();

    }

}
