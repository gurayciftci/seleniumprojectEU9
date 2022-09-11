package com.cydeoShorts.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice12_LocatingCheckbox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement chBox1 = driver.findElement(By.xpath("//input[@id='box1']"));
        System.out.println("chBox1.isSelected() = " + chBox1.isSelected());
        //The command line above, returns boolean type about checkBox1 is selected or not
        chBox1.click();
        System.out.println("chBox1.isSelected() = " + chBox1.isSelected());

        WebElement chBox2 = driver.findElement(By.xpath("//input[@id='box2']"));
        System.out.println("chBox2.getAttribute() = " + chBox2.getAttribute("checked"));
        //The command line above, returns boolean type about checkBox1 is selected or not
        chBox2.click();
        System.out.println("chBox2.getAttribute() = " + chBox2.getAttribute("checked"));
        //Since there is no attribute as "checked", it seems null

        //if we want to check the checkbox
        if (chBox1.isSelected()){
            System.out.println("Checkbox1 is already selected");
        }else{
            chBox1.click();
        }


    }
}
