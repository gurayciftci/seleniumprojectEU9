package com.cydeoShorts.testNG;

import com.cydeoShorts.base.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class P09_Web_Tables extends testBase {

    @Test
    public void webTablesTest(){
        driver.get("https://practice.cydeo.com/tables");

        //Print out Jason from row and cell number
        WebElement jasJas = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println("Before click jasJas.getText() = " + jasJas.getText());

        WebElement firstName = driver.findElement(By.xpath("(//span[.='First Name'])[1]"));
        firstName.click();

        jasJas = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[3]//td[2]"));
        System.out.println("After click jasJas.getText() = " + jasJas.getText());
        System.out.println("------------Task 1 Finished------------\n");


        //Print out Jason from text
        //even first name click, with this xpath, we get only Jason cell
        WebElement onlyJason = driver.findElement(By.xpath("//table[@id='table1']//td[.='Jason']"));
        System.out.println("onlyJason.getText() = " + onlyJason.getText());
        System.out.println("------------Task 2 Finished------------\n");

        //print out all cells in row 3
        List<WebElement> allRow3Cells = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//thead//tr//th[@class='header']"));
        for (WebElement each : allRow3Cells){
            System.out.println("each.getText() = " + each.getText());
            }

        System.out.println("\n\n");

       //driver.quit();
    }

}
