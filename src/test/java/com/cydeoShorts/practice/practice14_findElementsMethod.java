package com.cydeoShorts.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class practice14_findElementsMethod {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/radio_buttons");
        List<WebElement> colorButtons = driver.findElements(By.name("color"));
        System.out.println(colorButtons.size()); //Shows how many webelement has added to list

        for(WebElement each:colorButtons){
            System.out.println("Button id is: " + each.getAttribute("id"));
            System.out.println("Is '"+each.getAttribute("id")+"' enabled?: " + each.isEnabled());
            System.out.println("Is '"+ each.getAttribute("id") +"' selected?: "+ each.isSelected()+"\n");

            }
        driver.quit();
    }
}
