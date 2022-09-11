package com.cydeoShorts.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*- [ ]  TC #4: Practice Cydeo – Class locator practice
1- Open a chrome browser
2- Go to: [https://practice.cydeo.com/inputs]
3- Click to “Home” link
4- Verify title is as expected:
Expected: Practice

PS: Locate “Home” link using “className” locator*/

public class practice5_cydeo_class_locator_practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/inputs");

        WebElement homeLink = driver.findElement(By.className("nav-item"));
        homeLink.click();

        String expectedTitle = "Practice";
        String liveTitle = driver.getTitle();
        if (expectedTitle.equals(liveTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        System.out.println("\nTEST SUCCESSFULLY FINISHED");
    }
}
